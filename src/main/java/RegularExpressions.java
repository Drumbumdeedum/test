public class RegularExpressions {

  public static void main(String[] args) {
    String example = "I am a string, and a regular expression aswell!";
    String exampleReplace = example.replaceAll("I am", "You are");
    System.out.println(exampleReplace);

    String alphanumeric = "abcDeeeF12GhhIIIjjk99z";
    System.out.println(alphanumeric.replaceAll(".", "Y"));
    System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

    String alphanumeric2 = "abcDeeeF12GhhIabcDeeeIIjjk99z";
    System.out.println(alphanumeric2.replaceAll("abcDeee", "YYY"));

    System.out.println(alphanumeric.matches("^abcDeeeF12GhhIIIjjk99z"));

    System.out.println(alphanumeric.replaceAll("jjk99z$", "THE END"));
    System.out.println(alphanumeric.replaceAll("[aei]", "X"));
    System.out.println(alphanumeric.replaceAll("[aei]", "LETTER REPLACED "));
    System.out.println(alphanumeric.replaceAll("[aei][FJ]", "X"));
  }
}
