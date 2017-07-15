public class FibonacciN {

  public static void main(String[] args) {
    System.out.println(getNthFibonacciNumber(6));
  }

  public static int getNthFibonacciNumber(int n) {
    if (n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
    }
  }
}
