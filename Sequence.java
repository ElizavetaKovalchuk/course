import java.util.Scanner;

public class Sequence {
  public static void main (String[] args) {
    System.out.println("Enter numbers separated by a comma");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] number = input.split(",");
    int[] sequence = new int[number.length];
    for (int i = 0; i < number.length; i++) {
      try {
            sequence[i] = Integer.parseInt(number[i]);
          } catch (NumberFormatException e) {
            continue;
          }
    }   
    int n = 0;
    for (int i = 0; i < number.length; i++) {
      if (number[i] < number[i + 1]) {
        n++;
      }
    }
    if (n == number.length){
      System.out.println(" It is ascending sequence ");
    } else {
      System.out.println(" It is decreasing sequence");
    }  
  }
}           
