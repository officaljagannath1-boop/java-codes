import java.util.Scanner;
public class throw1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your age :");
        int age=sc.nextInt();
        if(age <=18)
        {
            throw new ArithmeticException ("------not eligeble for voting---------");
            // use of throw keyword to throw an exception
            //throw exception is used to explicitly throw an exception in Java.
            //  It allows you to create and throw your own exceptions based on specific
            //  conditions in your code.

        }else{
            System.out.println(".............elligible for voting..................");
        }
        System.out.println("hii am jp");
    }
}
