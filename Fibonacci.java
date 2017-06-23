import java.util.*;

public class Fibonacci {
  public static void main (String[] args) {
    int fib_sum = 0;
    int fib1 = 0;
    int fib2 = 1;
    boolean result = false;
    System.out.println ("Enter any positive integer");
    Scanner number = new Scanner ( System.in );
    int InputNum = number.nextInt();
    if (InputNum < 0) {
      System.out.println("You entered a negative number!!!");
    } else {
      while (fib_sum < InputNum) {
        fib_sum = fib1 + fib2;
        fib1 = fib2;
        fib2 = fib_sum;
      }
    }
    if (fib_sum == InputNum || fib_sum == fib1 || fib_sum == fib2) {
      result = true;
      System.out.println("It is the Fibonacci number");
    } else {
      System.out.println("It is not the Fibonacci number");
    }
  }
}   
 