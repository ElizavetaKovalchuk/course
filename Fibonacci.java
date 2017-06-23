import java.util.Scanner;

public class Fibonacci {
  public static void main (String[] args) {
    int fibSum = 0;
    int fib1 = 0;
    int fib2 = 1;
    System.out.println("Enter any positive integer");
    Scanner number = new Scanner( System.in );
    int InputNum = number.nextInt();
    if (InputNum < 0) {
      System.out.println("You entered a negative number");
    } else {
      while (fibSum < InputNum) {
        fibSum = fib1 + fib2;
        fib1 = fib2;
        fib2 = fibSum;
      }
    }
    if (fib_sum == InputNum) {
      System.out.println("It is the Fibonacci number");
    } else {
      System.out.println("It is not the Fibonacci number");
    }
  }
}   
 
