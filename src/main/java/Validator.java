import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

  public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
      Pattern.compile("^[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  public static final Pattern VALID_PASSWORD_REGEX =
      Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");

  public static void main(String[] args) {
    String validAddress = "john.doe@examplemail.com";
    String invalidAddress = "john.doeexamplemail.com";
    System.out.println(easyEmailValidation(validAddress));
    System.out.println(easyEmailValidation(invalidAddress));
  }

  public static boolean validateEmail(String email) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
    return matcher.find();
  }

  public static boolean validatePassword(String password) {
    Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
    return matcher.find();
  }

  public static String easyEmailValidation(String email) {
    if (validateEmail(email)) {
      return email + " - Valid email address.";
    }
    return email + " - The Email Address is in an invalid format.";
  }
}
