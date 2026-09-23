import java.util.Scanner;
public class ladder {
    public static void main(String[] args) {
        System.out.print("enter marks of student :");
        Scanner s = new Scanner(System.in);
        float m =s.nextFloat();
        if (m>=90||m<=100)
        {
            System.out.print(" student passed by A gread");
        
        }
         else if (m>=80||m<=100)
        {
            System.out.print(" student passed by B gread");
        }
          else if (m>=60||m<=100)
        {
            System.out.print(" student passed by C gread");
        }
          else if (m>=35||m<=100)
        {
            System.out.print(" student passed by D gread");
        }
          else if (m<=34||m<=0)
        {
            System.out.print(" student  Fail");
        }
        else
        {
            System.out.println(" invalid input");
        }
        



        
    }
    
}
