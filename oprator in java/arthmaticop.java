import java.util.Scanner;
class arthmaticop{
    public static void main(String[] args) 
    {
        Scanner n= new Scanner(System.in);
        System.out.print("enter value in a :");
        Float a = n.nextFloat();
        System.out.print("enter value in b :");
        Float b= n.nextFloat();
        
    
        System.out.println("sum  "+( a+b));
        System.out.println("sub  "+( a-b));
        System.out.println("mul  "+( a*b));
        System.out.println("dev  "+( a/b));
        System.out.println("modules  "+( a%b));

    }
}