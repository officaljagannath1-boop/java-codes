 import  java.util.Scanner;
 class lightonof 
{
    public static void main(String[] args)
 { 
    Scanner s= new Scanner(System.in);
    System.out.print(" enter value in us :");
    int us=s.nextInt();

    if ( us==0 && us==0)
    {

        if(us==1)
        {
            System.out.println(" light is on ");

        }
        else
        {
            System.out.println(" light is of");
        }


    }
    else
        {
            System.out.println(" enter only 'one' or 'zero' ");
        }   

 }


}