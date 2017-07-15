public class IsPrime {

  public static void main(String[] args) {
    System.out.println("Is 1 a prime number? " + isPrime(1));
    System.out.println("Is 2 a prime number? " + isPrime(2));
    System.out.println("Is 4 a prime number? " + isPrime(4));
    System.out.println("Is 11 a prime number? " + isPrime(11));
    System.out.println("Is 16 a prime number? " + isPrime(16));
    System.out.println("Is 113 a prime number? " + isPrime(113));
  }

  public static boolean isPrime(int number) {
    if (number == 1) {
      return false;
    }
    for (int i = 2; i <= number/2 ; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
