import java.util.Scanner;
class leapyear {
    public static void main(String[] args) {
 Scanner s = new Scanner (System.in);
  System.out.print(" enter value in year :");
 int year = s.nextInt();
 if (year%4==0 || year%100==0 || year%400==0)
 {
    System.out.print((year)+" = leap year");
 }
 else
 {
     System.out.print((year)+"=  not leap year");
 }
        
    }
}