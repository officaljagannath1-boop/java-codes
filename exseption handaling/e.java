import java.util.InputMismatchException;
import java.util.Scanner;
class e{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int[] a = {1,2,3,4,5};
         System.out.print("enter value of Array index :");
         
         try {
            int i =sc.nextInt();
              System.out.println(a[i]);
         } catch(InputMismatchException i){
            System.out.println(" ...........input is  wrong .. please enter only integer values.......");
         }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  ...............invalid  arryindex please try again........");
         }
         System.out.println("\n\n------------------code is running---------------------------");
          // Access valid index (0-4)
         //ArrayIndexOutOfBoundsException will be thrown because index 6 is out of bounds
         // for the array of size 5.
    }
}