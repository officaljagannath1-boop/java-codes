import  java.util.Scanner;
public class nestedif1 
{
    public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number :");
        int num = s.nextInt();
        if (num>0)
        {
            System.out.println("number is positive");
            if (num%2==0)
            {
                System.out.println("number is even");
            }
            else
            {
                System.out.println("number is odd");
            }
        }
        else
        {
            System.out.println("number is negative");
        }
        
    }
}