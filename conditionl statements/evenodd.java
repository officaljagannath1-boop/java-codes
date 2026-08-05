import java.util.Scanner;
class evenodd
 {
    public static void main(String[] args) 
    {      System.out.print("enter value in i :");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i%2==0)
        {
            System.out.print((i)+" is even");
        }
        else
        {
            System.out.print((i)+" is odd");
        }


    }
}
