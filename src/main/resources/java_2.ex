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
}