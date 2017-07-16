package RegExExperiments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExContainsMethod {

  public static void main(String[] args) {

    String mixedCase = "Example String 123 %/!";
    String upperCase = "EXAMPLE STRING 123 %/!";
    String lowerCase = "example string 123 %/!";

    Pattern pattern = Pattern.compile("(?=.*[a-z])");
    Matcher matcherMixed = pattern.matcher(mixedCase);
    Matcher matcherUpper = pattern.matcher(upperCase);
    Matcher matcherLower = pattern.matcher(lowerCase);

    System.out.println(mixedCase + " - contains lowercase letters: " + matcherMixed.find());
    System.out.println(upperCase + " - contains lowercase letters: " + matcherUpper.find());
    System.out.println(lowerCase + " - contains lowercase letters: " + matcherLower.find());
  }
}
