
import java.util.Scanner;

class arr2d1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter value in  Row :");
      int R = sc.nextInt();
      System.out.print("enter value in Column :");
      int C = sc.nextInt();

      int a[][] = new int[R][C];
      for (int i = 0; i < R; i++) {

         for (int j = 0; j < C; j++) {
           System.out.print(" enter value in Row ["+i+"]  Column ["+j+"] :");
            a[i][j]=sc.nextInt();
              

         }
            System.out.println("");
      }
      System.out.println("\nvalues in array are :");
      for (int i = 0; i < R; i++) {
         
         for (int j = 0; j < C; j++) {
            System.out.print("Row ["+i+"]  Column ["+j+"] :");
            System.out.println(a[i][j]);
         }
         System.out.println("");
      }
      

   }

}
 //System.out.println(a+"array ["+i+"]");