import java.util.Scanner;

class arr_exception {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int R, C;
      while (true) { 
        try {
            System.out.print("enter value in  Row :");
          R = sc.nextInt();
          break;
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            sc.nextLine(); // Clear the invalid input
        }
          
      }
      while (true) { 
        try {
            System.out.print("enter value in Column :");
             C = sc.nextInt();
             break;
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            sc.nextLine(); // Clear the invalid input
        }
      }
      
      
      int a[][] = new int[R][C];
      for (int i = 0; i < R; i++) {

         for (int j = 0; j < C; j++) {
            while (true) { 
                try {
                    System.out.print(" enter value in Row ["+i+"]  Column ["+j+"] :");
                    a[i][j]=sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine(); // Clear the invalid input
                }
            }

         }
            System.out.println("");
      }
      System.out.println("\nvalues in array are :");
      for (int i = 0; i < R; i++) {
         
         for (int j = 0; j < C; j++) {
            System.out.print("Row ["+i+"]  Column ["+j+"] :");
            System.out.println(a[i][j]);
         }
         System.out.println("Mximum value in array  :"+ M);
      }
      

   }

}
 //System.out.println(a+"array ["+i+"]");