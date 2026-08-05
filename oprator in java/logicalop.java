import java.util.Scanner;
    class logicalop {
    public static void main(String[] args) {
        Scanner  n = new Scanner( System.in);
        System.out.print("enter your marks :");
        Float mark = n.nextFloat();
        System.out.println(mark> 70 && mark > 71);
        System.out.println(mark> 70 || mark > 71);
        System.out.println(!(mark> 70 && mark > 71));
        System.out.println(!(mark> 70 || mark > 71));


    }
}
