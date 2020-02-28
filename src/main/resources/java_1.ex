package     vn.tiki.gum.mapping;

import      io.reactivex.Completable;
import    io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import vn.tiki.gum.repository.CustomerCouponRepository;
import vn.tiki.gum.repository.cache.RedisCacheService;
import vn.tiki.gum.repository.entities.CustomerCoupon;
import vn.tiki.gum.repository.entities.legacy.PromoSalesrule;
import vn.tiki.gum.repository.entities.legacy.PromoSalesrule.CouponType;
import vn.tiki.gum.repository.mysql.DatabasePromoService;
import vn.tiki.gum.repository.mysql.DatabaseTalaService;
import vn.tiki.gum.utils.RuleEncoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class MappingServiceImpl implements MappingService {

    public static final Set<CouponType> SUPPORTED_TYPE = Set.of(CouponType.AUTO, CouponType.SPECIFIC);

    private DatabaseTalaService databaseTalaService;
    private DatabasePromoService databasePromoService;
    private RedisCacheService cacheRepository;
    private CustomerCouponRepository customerCouponRepository;

    private static final int BUFFER_SIZE = 10000;
    private static final Logger LOGGER = LoggerFactory.getLogger(MappingServiceImpl.class);

    public    MappingServiceImpl(DatabaseTalaService databaseTalaService, DatabasePromoService databasePromoService,
                              RedisCacheService cacheRepository, CustomerCouponRepository customerCouponRepository) {
        this.databaseTalaService = databaseTalaService;
        this.databasePromoService = databasePromoService;
        this.cacheRepository = cacheRepository;
        this.customerCouponRepository = customerCouponRepository;
    }

    private Completable mapSegmentSaleRule(int ruleId, String segmentId, CouponType couponType) {
        switch (couponType) {
            case AUTO: return mapCouponAuto(ruleId, segmentId);
            case SPECIFIC: return mapCouponSpecific(ruleId, segmentId);
            default: return Completable.error(new RuntimeException("Coupon type not supported"));
        }
    }

    private Completable mapDynamicSegmentSaleRule(int ruleId, CouponType couponType, int couponQuantity) {
        switch (couponType) {
            case AUTO: return mapDynamicSegmentCouponAuto(ruleId);
            case SPECIFIC:
                LOGGER.info("Mapping coupons for rule dynamic segments not supported");
                return Completable.complete();
            default: return Completable.error(new RuntimeException("Coupon type not supported"));
        }
    }

    @Override
    public    Completable      map(PromoSalesrule salesrule) {
        if (!SUPPORTED_TYPE.contains(salesrule.getCouponType())) {
            String msg = MessageFormatter.format("Coupon type {} not supported yet",
                    salesrule.getCouponType()).getMessage();
            return Completable.error(new UnsupportedOperationException(msg));
        }

        if (salesrule.hasDynamicSegment()) {
            return mapDynamicSegmentSaleRule(salesrule.getId(), salesrule.getCouponType(), salesrule.getCouponQuantity());
        }
        return mapSegmentSaleRule(salesrule.getId(), salesrule.getSegmentId(), salesrule.getCouponType());
    }

    private Completable mapCouponAuto(int ruleId, String segmentId) {
        Flowable<JsonArray> coupons = databaseTalaService.FetchCoupon(ruleId);
        Flowable<JsonArray> customers = databasePromoService.FetchCustomer(segmentId);

        return coupons.zipWith(customers, (coupon, customer) ->
                new CustomerCoupon()
                        .setCoupon(coupon.getString(0))
                        .setCustomerId(customer.getLong(0))
                        .setCookie(customer.getString(1))
                        .setDeviceId(customer.getString(2))
                        .setSaleRuleId(ruleId))
                .filter(CustomerCoupon::isCustomerNotNull)
                .buffer(BUFFER_SIZE)
                .flatMapCompletable(this::populate);
    }

    private Completable mapCouponSpecific(int ruleId, String segmentId) {
        Flowable<JsonArray> coupons = databaseTalaService.FetchCoupon(ruleId);
        Flowable<JsonArray> customers = databasePromoService.FetchCustomer(segmentId);

        return coupons.firstOrError()
                .flatMapCompletable(val -> {
                    String coupon = val.getString(0);
                    return customers.flatMap(customer ->
                            Flowable.just(new CustomerCoupon()
                                    .setCoupon(coupon)
                                    .setCustomerId(customer.getLong(0))
                                    .setCookie(customer.getString(1))
                                    .setDeviceId(customer.getString(2))
                                    .setSaleRuleId(ruleId)))
                            .filter(CustomerCoupon::isCustomerNotNull)
                            .buffer(BUFFER_SIZE) // bulk 10k
                            .flatMapCompletable(this::populate);
                });
    }

    private Completable mapDynamicSegmentCouponAuto(int ruleId) {
        return databaseTalaService.FetchCoupon(ruleId)
                    .map(couponJa -> couponJa.getString(0))
                    .toList()
                    .flatMap(coupons -> writeCouponCache(ruleId, coupons))
                    .ignoreElement();
    }

    @Deprecated
    private Completable populate(CustomerCoupon customerCoupon) {
        return writeDatabase(customerCoupon)
                .doOnSuccess(ignoreds ->
                        LOGGER.info("Write coupons into DB for rule_id {} successfully",
                                customerCoupon.getSaleRuleId()))
                .toFlowable()
                .flatMap(res -> writeCache(customerCoupon))
                .toList()
                .doOnSuccess(redisResponse ->
                        LOGGER.info("Cache coupons for rule_id {} successfully. Redis response {}",
                                customerCoupon.getSaleRuleId(), redisResponse))
                .ignoreElement();
    }

    // Performance
    private Completable populate(List<CustomerCoupon> customerCoupons) {
        if (customerCoupons.isEmpty())
            return Completable.complete();

        int saleRuleId = customerCoupons.get(0).getSaleRuleId();
        String hashedRuleId = RuleEncoder.encode(saleRuleId);

        Completable writeDB = customerCouponRepository.createMany(customerCoupons)
                .doOnSuccess(numWritten ->
                        LOGGER.info("Write {} coupons into DB for rule_id {} successfully",
                                numWritten, saleRuleId))
                .ignoreElement();

        Completable writeCache = cacheRepository.hset(hashedRuleId, makeParams(customerCoupons))
                .doOnSuccess(numWritten -> LOGGER.info("Cached {} coupons successfully sale rule {}",
                        numWritten, saleRuleId))
                .ignoreElement();

        return writeDB.andThen(writeCache);
    }

    private List<Pair<String, String>> makeParams(List<CustomerCoupon> customerCoupons) {
        List<Pair<String, String>> results = new LinkedList<>();
        for (var customerCoupon : customerCoupons) {
            if (customerCoupon.getCustomerId() != null) {
                results.add(Pair.of(String.valueOf(customerCoupon.getCustomerId()), customerCoupon.getCoupon()));
            }

            if (!StringUtils.isBlank(customerCoupon.getDeviceId())) {
                results.add(Pair.of(customerCoupon.getDeviceId(), customerCoupon.getCoupon()));
            }

            if (!StringUtils.isBlank(customerCoupon.getCookie())) {
                results.add(Pair.of(customerCoupon.getCookie(), customerCoupon.getCoupon()));
            }
        }
        return results;
    }

    @Deprecated
    private Flowable<String> writeCache(CustomerCoupon customerCoupon) {
        String hashedRuleId = RuleEncoder.encode(customerCoupon.getSaleRuleId());
        List<Maybe<String>> chainedMaybe = new LinkedList<>();
        if (customerCoupon.getCustomerId() != null) {
            chainedMaybe.add(cacheRepository.hset(hashedRuleId, String.valueOf(customerCoupon.getCustomerId()),
                    customerCoupon.getCoupon()));
        }

        if (!StringUtils.isBlank(customerCoupon.getDeviceId())) {
            chainedMaybe.add(cacheRepository.hset(hashedRuleId, customerCoupon.getDeviceId(), customerCoupon.getCoupon()));
        }

        if (!StringUtils.isBlank(customerCoupon.getCookie())) {
            chainedMaybe.add(cacheRepository.hset(hashedRuleId, customerCoupon.getCookie(),
                    customerCoupon.getCoupon()));
        }
        return Maybe.merge(chainedMaybe);
   }

   private Single<Integer> writeCouponCache(int ruleId, List<String> coupons) {
       String key = "rule-dynamic-segments:" + RuleEncoder.encode(ruleId);
       return cacheRepository.lpush(key, coupons)
               .switchIfEmpty(Single.error(new RuntimeException("Error")));
   }

    private Single<String> writeDatabase(CustomerCoupon customerCoupon) {
        return customerCouponRepository.create(customerCoupon);
    }
}