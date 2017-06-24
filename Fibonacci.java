import java.util.Scanner;

public class Fibonacci {
  public static void main (String[] args) 
    int fib1 = 0;
    int fib2 = 1;
    int fibSum = 0;
    int InputNum = 0;
    InputNum = Scan(InputNum);
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
  
public static int Scan(int i) {
  System.out.println("Enter any positive number");
    Scanner number = new Scanner( System.in );
    i = number.nextInt();
    return i;
  }
}   
 
