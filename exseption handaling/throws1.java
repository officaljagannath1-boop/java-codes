public class throws1 {
    static void divison() throws ArithmeticException {
        int a = 45, b = 0;
        int c = a / b;
        System.out.println("Result = " + c);
    }
    public static void main(String[] args) {
        try {
            divison();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught ehrwryhwrty .............: " );
        }
        System.out.println("hii am jp");
        // use of throws keyword to declare an exception
        // The throws keyword is used in the method signature to declare that a method may 
        // throw one or more exceptions.
    }
}
