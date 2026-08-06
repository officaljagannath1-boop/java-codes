 import  java.util.Scanner
 ;
 class fort {
    public static void main(String[] args)  
    {     System.out.print(" enter number for print table :");
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(t+"*"+i+"="+i*t);
        }
    } 
}
