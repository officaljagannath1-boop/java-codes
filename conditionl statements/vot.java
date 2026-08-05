import  java.util.Scanner;
class vot {
    public static void main(String[] args) {

        System.out.println("/tcheak you are elegebel for vote or not/n/n");
        Scanner s = new Scanner(System.in);
        System.out.print("enter your age :");
        int age = s.nextInt();
        if(age>=18)
        {
            System.out.print("you are elegebel for vote");
        }
        else
        {
            System.out.print("you are not elegebel for vote"); // this for git commit
        }

    }
    
}
