package RegExExperiments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

  public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
      Pattern.compile("^[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  public static final Pattern VALID_PASSWORD_REGEX =
      Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&'()*+,-./:;<=>?@^_`{|}~])(?=\\S+$).{8,}");

  public static void main(String[] args) {
    String validAddress = "john.doe@examplemail.com";
    String invalidAddress = "john.doeexamplemail.com";
    System.out.println(easyEmailValidation(validAddress));
    System.out.println(easyEmailValidation(invalidAddress));
    System.out.println();

    String validPw = "AAaaBBbb!%66";
    String longPw = "AaaaBB33bbb///==+!..%%%ggggEEE";
    String tooShort = "Aa/.1";
    String allLowerCase = "aabb11+/.x";
    String allUpperCase = "AABB11+/.X";
    String noSpecChar = "AAaaaaBBBbbb33";
    String noNumbericChar = "AAbb%CCcccc";
    String whiteSpace = "AA   bbBBB 333 // %";
    System.out.println(easyPasswordValidation(validPw));
    System.out.println(easyPasswordValidation(longPw));
    System.out.println(easyPasswordValidation(tooShort));
    System.out.println(easyPasswordValidation(allLowerCase));
    System.out.println(easyPasswordValidation(allUpperCase));
    System.out.println(easyPasswordValidation(noSpecChar));
    System.out.println(easyPasswordValidation(noNumbericChar));
    System.out.println(easyPasswordValidation(whiteSpace));
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

  public static String easyPasswordValidation(String password) {
    if (validatePassword(password)) {
      return password + " - Valid password.";
    } else if (containsWhitespace(password)) {
      return password + " - Password contains whitespace character(s)!";
    } else if (noUppercaseLetter(password)) {
      return password + " - Password contains no uppercase letter!";
    } else if (noLowerCaseLetter(password)) {
      return password + " - Password contains no lowercase letter!";
    } else if (noNumericCharacter(password)) {
      return password + " - Password contains no numeric character!";
    } else if (noSpecialCharacter(password)) {
      return password + " - Password contains no special character";
    } else if (tooShort(password)) {
      return password + " - Password is too short, should be at least 8 characters long!";
    }
    return "Woops, something went wrong...";
  }

  private static boolean noUppercaseLetter(String password) {
    Pattern pattern = Pattern.compile("(?=.*[A-Z])");
    Matcher matcher = pattern.matcher(password);
    return !matcher.find();
  }

  private static boolean noLowerCaseLetter(String password) {
    Pattern pattern = Pattern.compile("(?=.*[a-z])");
    Matcher matcher = pattern.matcher(password);
    return !matcher.find();
  }

  private static boolean noNumericCharacter(String password) {
    Pattern pattern = Pattern.compile("(?=.*[0-9])");
    Matcher matcher = pattern.matcher(password);
    return !matcher.find();
  }

  private static boolean noSpecialCharacter(String password) {
    Pattern pattern = Pattern.compile("(?=.*[!#$%&'()*+,-./:;<=>?@^_`{|}~])");
    Matcher matcher = pattern.matcher(password);
    return !matcher.find();
  }

  private static boolean containsWhitespace(String password) {
    Pattern pattern = Pattern.compile("^(.*\\s+.*)+$");
    Matcher matcher = pattern.matcher(password);
    return matcher.find();
  }

  private static boolean tooShort(String password) {
    return password.length() < 8;
  }
}
