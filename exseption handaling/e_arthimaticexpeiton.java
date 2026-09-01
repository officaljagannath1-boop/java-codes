import  java.util.Scanner;

public class e_arthimaticexpeiton{
    static  void cal(){
         // make a simple calculator using switch case
        Scanner s = new Scanner(System.in);
        System.out.print("enter first number :");
        float a = s.nextFloat();
        System.out.print("enter second number :");
        float b = s.nextFloat();
        System.out.println("enter your choice :");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.print(" choice = :");
        char choice = s.next().charAt(0);
     if(choice=='+'||choice=='-'||choice=='*'||choice=='/')
       {
           
          switch (choice) {
            case '+':
                System.out.println("addition of two number is :" + (a + b));
                break;
            case '-':
                System.out.println("subtraction of two number is :" + (a - b));
                break;
            case '*':
                System.out.println("multiplication of two number is :" + (a * b));
                break;
            case '/':
                System.out.println("division of two number is :" + (a / b));
                break;
            default:
                System.out.println("invalid input");
            }
        }else{
            System.out.println("..........invalid input ..enter only '+','-','*','/'.........");
        }


 }
 public static void main(String[] args) {
     cal();
     System.out.println("...................faaaaaaaaaaaaaaa................");
 }
}