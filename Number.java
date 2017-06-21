public class OutputOfNumbers {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i ++){
            if (i % 3 == 0 && i % 5 == 0)
               System.out.print("Tutti-Frutti\n");
            else
            if (i % 3 == 0 )
                System.out.print("Tutti\n");
            else
            if (i % 5 == 0)
               System.out.print("Frutti\n");
            else
                System.out.println(i);
        }
    }
}
