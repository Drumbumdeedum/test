package RegExExperiments;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

  public static void main(String[] args) {
    Pattern mobilePhoneNumberPatternHU = Pattern.compile("^([\\+]{1}[36]{1}[\\-]{1}[0-9]{2}[\\-]{1}[0-9]{3}[\\-]{1}[0-9]{4})$");
    Matcher mobileMatcher = mobilePhoneNumberPatternHU.matcher("+36-20-210-4851");
    System.out.println(mobileMatcher.find());
  }
}
