import java.util.InputMismatchException;
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.print("enter your age :");
            int age = s.nextInt();
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException i) {
            System.out.println("\t\t\tinvalid user input\n\t\t\tplease try again........\n");
    
             
        }
        System.err.println("runnig .......................");

    }
}
