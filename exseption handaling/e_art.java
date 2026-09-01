
import java.util.Scanner;


public class e_art {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter first number :");
        int a =s.nextInt();
        System.out.print("enter second number :");
        int b =s.nextInt();
        try {
            int c = a / b;
            System.out.println("division of two number is :" + c);
        } catch (ArithmeticException e) {
            System.out.println("...........invalid input please enter only non zero value for second number........");
        }

        
    }
}
