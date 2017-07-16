package RegExExperiments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

  public static void main(String[] args) {

    // IMPORTANT LINK: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

    // STRINGS USED IN EXAMPLES:
    String example = "I am a string, and a regular expression aswell!";
    String alphaNumeric = "abcDeeeF12GhhIIIjjk99z";
    String alphaNumericUpperAndLower = "abcDeeeF12GhhIabcDeeeIIjjk99z";
    String hasWhiteSpaceTabAndNewLine = "I have blanks and \t a tab, and also a \n newline";

    // BASIC EXAMPLE:
    System.out.println("***** EXAMPLE 1: *****");
    String exampleReplace = example.replaceAll("I am", "You are");
    System.out.println(example);
    System.out.println("*Turns into:*");
    System.out.println(exampleReplace);
    System.out.println();

    // REPLACE ALL
    System.out.println("***** EXAMPLE 2: *****");
    System.out.println(alphaNumeric);
    System.out.println("*Replace all to Y:*");
    System.out.println(alphaNumeric.replaceAll(".", "Y"));
    System.out.println();

    // REPLACE FIRST MATCH (^)
    System.out.println("***** EXAMPLE 3: *****");
    System.out.println(alphaNumeric);
    System.out.println("*Replace first abcDeee with YYY:*");
    System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));
    System.out.println();

    // REPLACE ALL MATCHES
    System.out.println("***** EXAMPLE 4: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace all abcDeee wit YYY:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("abcDeee", "YYY"));
    System.out.println();

    // DOES IT MATCH?
    System.out.println("***** EXAMPLE 5: *****");
    System.out.println(alphaNumeric);
    System.out.println("*Does it match: abcDeeeF12GhhIIIjjk99z?");
    System.out.println(alphaNumeric.matches("^abcDeeeF12GhhIIIjjk99z"));
    System.out.println();

    // REPLACE ENDING:
    System.out.println("***** EXAMPLE 6: *****");
    System.out.println(alphaNumeric);
    System.out.println("*Replace ending:*");
    System.out.println(alphaNumeric.replaceAll("jjk99z$", "THE END"));
    System.out.println();

    // REPLACE ALL aei
    System.out.println("***** EXAMPLE 7: *****");
    System.out.println(alphaNumeric);
    System.out.println("*Replace aei with X:*");
    System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
    System.out.println();
    System.out.println(alphaNumeric);
    System.out.println("*Replace aei with LETTER REPLACED:*");
    System.out.println(alphaNumeric.replaceAll("[aei]", "LETTER REPLACED "));
    System.out.println();
    System.out.println(alphaNumeric);
    System.out.println("*Replace aei followed by FJ with X:*");
    System.out.println(alphaNumeric.replaceAll("[aei][FJ]", "X"));
    System.out.println();

    // LOWERCASE ALTERNATIVE SOLUTION
    System.out.println("***** EXAMPLE 8: *****");
    System.out.println("*Turns Harry to lowercase:*");
    System.out.println("Harry".replaceAll("[Hh]arry", "harry"));
    System.out.println();

    // REPLACE ALL EXCEPT ej
    System.out.println("***** EXAMPLE 9: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace all except ej:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("[^ej]", "X"));
    System.out.println();

    // REPLACE ALL abcdef345678
    System.out.println("***** EXAMPLE 10: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace all abcdef345678 with X:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("[abcdef345678]", "X"));
    System.out.println("*Same but different method:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("[a-f3-8]", "X"));
    System.out.println();

    // TURN OFF CASE SENSITIVITY WITH (?i)
    System.out.println("***** EXAMPLE 11: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Ignore case sensitivity with (?i):*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("(?i)[a-f3-8]", "X"));
    System.out.println();

    // REPLACE ALL NUMERIC CHARACTERS IN STRING
    System.out.println("***** EXAMPLE 12: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace all numeric chars with X:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("[0-9]", "X"));
    System.out.println("*Different approach:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("\\d", "X"));
    System.out.println();

    // REPLACE ALL NON-NUMERICS
    System.out.println("***** EXAMPLE 13: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace all non-numeric chars with X:*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("\\D", "X"));
    System.out.println();

    // REPLACE WHITESPACE TAB AND NEWLINE CHARS
    System.out.println("***** EXAMPLE 14: *****");
    System.out.println(hasWhiteSpaceTabAndNewLine);
    System.out.println("*Replace WHITESPACE TAB AND NEWLINE with empty string:*");
    System.out.println(hasWhiteSpaceTabAndNewLine.replaceAll("\\s", ""));
    System.out.println();

    //REPLACE TAB
    System.out.println("***** EXAMPLE 15: *****");
    System.out.println(hasWhiteSpaceTabAndNewLine);
    System.out.println("*Replace TAB with empty string:*");
    System.out.println(hasWhiteSpaceTabAndNewLine.replaceAll("\t", "X"));
    System.out.println();

    //REPLACE ALL NON-WHITESPACE CHARACTERS, TAB SPACE AND NEWLINE REMAINS
    System.out.println("***** EXAMPLE 16: *****");
    System.out.println(hasWhiteSpaceTabAndNewLine);
    System.out.println("*Replace all non-whitespace chars, tab space newline remains:*");
    System.out.println(hasWhiteSpaceTabAndNewLine.replaceAll("\\S", "X"));
    System.out.println();

    //REPLACE ALL A-Z, a-z, 0-9
    System.out.println("***** EXAMPLE 17: *****");
    System.out.println(alphaNumeric);
    System.out.println("*Replace all A-Z a-z 0-9 with X:*");
    System.out.println(alphaNumeric.replaceAll("\\w", "X"));
    System.out.println();
    System.out.println(hasWhiteSpaceTabAndNewLine);
    System.out.println(hasWhiteSpaceTabAndNewLine.replaceAll("\\w", "X"));
    System.out.println();

    // REPLACE ALL WHITESPACES WITH X
    System.out.println("***** EXAMPLE 18: *****");
    System.out.println(hasWhiteSpaceTabAndNewLine);
    System.out.println("*Replace all non-word characters with X:*");
    System.out.println(hasWhiteSpaceTabAndNewLine.replaceAll("\\W", "X"));
    System.out.println();

    // SURROUND TRICK:
    System.out.println("***** EXAMPLE 19: *****");
    System.out.println(hasWhiteSpaceTabAndNewLine);
    System.out.println("*Surround all words with X:*");
    System.out.println(hasWhiteSpaceTabAndNewLine.replaceAll("\\b", "X"));
    System.out.println();

    // QUANTIFIER:
    System.out.println("***** EXAMPLE 20: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace abcD and 3xe with YYY*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("^abcDe{3}","YYY"));
    System.out.println("*Replace abcD and all following e with YYY pt1:*");
    // LOOKING FOR 1+ 'e's
    System.out.println(alphaNumericUpperAndLower.replaceAll("^abcDe+","YYY"));
    System.out.println("*Replace abcD and all following e with YYY pt2:*");
    // HAVING THE e AT THE END IS OPTIONAL IN THIS CASE!!!!!!!!! LOOKING FOR 0+ 'e's
    System.out.println(alphaNumericUpperAndLower.replaceAll("^abcDe*","YYY"));
    System.out.println();

    // REPLACE BETWEEN 2-5 CHARACTERS
    System.out.println("***** EXAMPLE 21: *****");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println("*Replace abcD and 2-5's with YYY*");
    System.out.println(alphaNumericUpperAndLower.replaceAll("^abcDe{2,5}","YYY"));
    System.out.println();

    // REPLACE 1 c, 0 OR MORE D, FOLLOWED BY e:
    System.out.println("***** EXAMPLE 22: *****");
    System.out.println("*Replace 1x'c', 0<'D', followed by 'e' with Y:*");
    System.out.println(alphaNumericUpperAndLower);
    System.out.println(alphaNumericUpperAndLower.replaceAll("c+D*e","Y"));
    System.out.println();

    // EMAIL EXAMPLE
    System.out.println("***** EXAMPLE 23: *****");
    String validAddress = "john.doe@examplemail.com";
    String invalidAddress = "john.doeexamplemail.com";
    System.out.println(
        validateEmail(validAddress) ? validAddress + " is a valid address" : validAddress + " is not a valid address");
    System.out.println(
        validateEmail(invalidAddress) ? invalidAddress + " is a valid address" : invalidAddress + " is not a valid address");
    System.out.println();

    // PASSWORD EXAMPLE
    System.out.println("***** EXAMPLE 24: *****");
    String validPw = "AAaaBBbb!%66";
    String longPw = "AaaaBB33bbb///==+!..%%%ggggEEE";
    String allLowerCase = "aabb11+/.x";
    String allUpperCase = "AABB11+/.X";
    String tooShort = "Aa/.1";
    String noSpecChar = "AAaaaaBBBbbb33";
    String whiteSpace = "AA   BBB 333 // %";
    System.out.println(easyPwValidate(validPw));
    System.out.println(easyPwValidate(longPw));
    System.out.println(easyPwValidate(tooShort));
    System.out.println(easyPwValidate(allLowerCase));
    System.out.println(easyPwValidate(allUpperCase));
    System.out.println(easyPwValidate(noSpecChar));
    System.out.println(easyPwValidate(whiteSpace));
  }

  public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
      Pattern.compile("^[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  public static boolean validateEmail(String email) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
    return matcher.find();
  }

  public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");

  public static boolean validatePassword(String password) {
    Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
    return matcher.find();
  }

  public static String easyPwValidate(String inputPw) {
    return validatePassword(inputPw)? inputPw + " is a valid password" : inputPw + " is not a valid password";
  }
}
