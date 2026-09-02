import java.util.Scanner;

public class e_arthimaticexpeiton {
    static void cal() {
        // make a simple calculator using switch case
        Scanner s = new Scanner(System.in);
        float a, b;

        while (true) {
            try {
                System.out.print("enter first number :");
                a = s.nextFloat();
                break;
            } catch (Exception e1) {
                System.out.println("............invalid input in a .............");
                s.nextLine();
            }

        }

        while (true) {
            try {
                System.out.print("enter second number :");
                b = s.nextFloat();
                break;
            } catch (Exception e1) {
                System.out.println("............invalid input in b .............");
                s.nextLine();
            }

        }

        int choice;
        while (true) {
            try {
                System.out.println("enter your choice :");
                System.out.println("1.addition");
                System.out.println("2.subtraction");
                System.out.println("3.multiplication");
                System.out.println("4.division");
                choice = s.nextInt();
                break;
            } catch (Exception e1) {
                System.out.println("............invalid input in choice .............");
                s.nextLine();
            }
        }

        switch (choice) {
            case 1:
                System.out.println("addition of two number is :" + (a + b));
                break;
            case 2:
                System.out.println("subtraction of two number is :" + (a - b));
                break;
            case 3:
                System.out.println("multiplication of two number is :" + (a * b));
                break;
            case 4:
                
                    System.out.println("division of two number is :" + (a / b));
                
                break;
            default:
                System.out.println("invalid input");
        }

    }

    public static void main(String[] args) {
        cal();
        System.out.println("...................aaaaaaaaaaaaaaa................");
    }
}