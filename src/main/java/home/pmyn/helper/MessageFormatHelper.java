package home.pmyn.helper;

import org.slf4j.helpers.MessageFormatter;

public final class MessageFormatHelper {

  public static String format(String format, Object... params) {
    return MessageFormatter.arrayFormat(format, params).getMessage();
  }

}
