package WhileDoWhile;

public class WileLoopTest {

  public static void main(String[] args) {

    int count = 1;

    // creates and infinite loop
    while(true) {
      // creates a way to break out of it
      if(count == 6) {
        break;
      }
      System.out.println(count);
      count++;
    }
  }
}
