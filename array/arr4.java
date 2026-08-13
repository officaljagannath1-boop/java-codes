import java.util.Scanner;
class arr4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter value in to store value :");
        int n=sc.nextInt();
        int arr []= new int [n];
        for (int i = 0;  i< n; i++) {

            System.out.print("enter velue in arr ["+i+"]  :");
            arr[i]=sc.nextInt();
            
        }
        System.out.println("values in array are :");
        for (int i = 0;  i< n; i++) {
            System.out.print("arr ["+i+"]  :");
            System.out.println(arr[i]);
        }


        
    }
}