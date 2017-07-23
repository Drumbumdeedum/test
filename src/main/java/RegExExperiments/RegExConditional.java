package RegExExperiments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExConditional {

  public static void main(String[] args) {

    // OR operator
    System.out.println( "Harry".replaceAll("[H|h]arry", "Larry"));
    System.out.println( "harry".replaceAll("[H|h]arry", "Larry"));

    // NOT operator
    String findTV = "tstvtktz";
    //Pattern tNotFollowedByVPattern = Pattern.compile("t[^v]");   // these 2 lines are exchangable
    Pattern tNotFollowedByVPattern = Pattern.compile("t(?!v)");    // these 2 lines are exchangable
    Matcher tNotFollowedByVMatcher = tNotFollowedByVPattern.matcher(findTV);

    // prints location of 't's that are not followed by 'v'
    while(tNotFollowedByVMatcher.find()) {
      System.out.println("Occurence start: " + tNotFollowedByVMatcher.start());
      System.out.println("Occurence end: " + tNotFollowedByVMatcher.end());
    }
  }
}
