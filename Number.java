public class Number{
    public static void main(String args[]){
        for(int i = 0; i <= 100; i ++){
            if (i % 3 != 0 ){
                System.out.print(i);
            } else {
                if (i % 3 == 0)
                System.out.print(i * 3);
         }
    System.out.println();
        }
    }
}