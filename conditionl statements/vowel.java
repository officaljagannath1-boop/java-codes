import java.util.Scanner;
class vowel {
   public static void main(String[] args)
 {
     Scanner s = new Scanner(System.in);
    System.out.print(" enter any alfabet ");
 char a =s.next().charAt(0);

    if(a=='a'|| a=='e'|| a=='o' || a=='u'
    || a=='A'|| a=='E'|| a=='O' || a=='U')
    {
        System.out.print((a)+"is vowel");
    }
}
}
