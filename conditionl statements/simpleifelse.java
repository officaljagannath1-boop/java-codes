import java.util.Scanner;
class simpleifelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num > 0) {
            System.out.println("The number is positive.");

        }
    
       else
         {
            System.out.println("The number is negative.");
        }
    }
}
