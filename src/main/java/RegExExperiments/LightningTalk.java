package RegExExperiments;

import java.util.regex.Pattern;

public class LightningTalk {

  private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
      Pattern.compile("^[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  private static final Pattern VALID_PASSWORD_REGEX =
      Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&'()*+,-./:;<=>?@^_`{|}~])(?=\\S+$)(?=^\\S.*).{8,}");

  public static void main(String[] args) {

  }
}
