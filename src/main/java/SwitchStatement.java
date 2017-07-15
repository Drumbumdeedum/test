public class SwitchStatement {

  public static void main(String[] args) {

    // NEVER!!! forget the break; statement, could cause a huge mess!!!

    // EXAMPLE 1:

    int switchValue = 1;
    switch(switchValue) {
      case 1:
        System.out.println("Value was: " + switchValue);
        break;

      case 2:
        System.out.println("Value was: " + switchValue);
        break;

      default:
        System.out.println("Value was not " + switchValue + ".");
        break;
    }


    // EXAMLPE 2;

    char testValue = 'E';
    switch(testValue) {
      case 'A':case 'B':case 'C':case 'D':case 'E':
        System.out.println("Char was: " + testValue);
        break;

      default:
        System.out.println("Char was not A, B, C, D or E.");
        break;
    }

  }
}
