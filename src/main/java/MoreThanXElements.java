import java.util.ArrayList;
import java.util.Arrays;

public class MoreThanXElements {

  public static void main(String[] args) {

    ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.out.println(hasMoreThanFiveElements(numberList));
  }

  public static boolean hasMoreThanFiveElements(ArrayList<Integer> list) {
    int counter = 0;
    for (Integer number: list) {
      counter++;
      System.out.println(number);
      if (counter > 5) {
        break;
      }
    }
    return counter > 5;
  }
}
