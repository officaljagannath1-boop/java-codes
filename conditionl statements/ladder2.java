import java.util.Scanner;
class ladder2 
{
    public static void main(String[] args)
 {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = s.nextInt();
       if ( age >=18)
        {
         System.out.println("you are eligible for voting");

        }
       else if (age >= 18 && age <= 40)
            {
                System.out.println("you are adult");
            }
      else if (age > 60)
            {
                System.out.println("you are senior citizen");
            }
        
        
        }
}
    
}
