class c4 {
    // this is mehtod overriding
    static class over {
        // method overriding is a feature that allows a subclass to provide a specific
        // implementation
        // of a method that is already defined in its superclass.
        // The method in the subclass must have the same name, return type, and
        // parameters
        // as the method in the superclass.
        void sum(int a, int b) {
            System.out.println("Sum of two numbers: " + (a + b));
        }

        void sum(int a, int b) {
            System.out.println("Sum of two numbers: " + (a + b));
        }
    }

    public static void main(String[] args) {
        over s = new over();
        s.sum(10, 20);
        s.sum(10, 20);
    }
}
