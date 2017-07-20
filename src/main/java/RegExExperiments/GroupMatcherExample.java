package RegExExperiments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMatcherExample {

  public static void main(String[] args) {

    StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
    htmlText.append("<h2>Sub-heading</h2>");
    htmlText.append("<p>This is a paragraph about something.</p>");
    htmlText.append("<p>This is another paragraph about something else.</p>");
    htmlText.append("<h2>Summary</h2>");
    htmlText.append("<p>Here is the summary.</p>");

    Pattern grouPattern = Pattern.compile("(<h2>.*?</h2>)");  // lazy quantifier example: .*?
    Matcher groupMatcher = grouPattern.matcher(htmlText);
    System.out.println(groupMatcher.matches());
    groupMatcher.reset();

    while(groupMatcher.find()) {
      System.out.println("Occurence: " + groupMatcher.group(1));
    }

    Pattern h2TextPattern = Pattern.compile("(<h2>)(.+?)(</h2>)");
    Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

    while(h2TextMatcher.find()) {
      System.out.println("Occurence: " + h2TextMatcher.group(1));
      System.out.println("Occurence: " + h2TextMatcher.group(2));
      System.out.println("Occurence: " + h2TextMatcher.group(3));
    }
  }
}
