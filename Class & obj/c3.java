class c3 {
    // this is method overloading               
     static class over {
        // method overloading is a feature that allows a class to have more than one
        // method with the
        // same name, but different parameters (different type or number of parameters).
        void sum(int a, int b) {
            System.out.println("Sum of two numbers: " + (a + b));
        }

        void sum(int a, int b, int c) {
            System.out.println("Sum of three numbers: " + (a + b + c));
        }
    }

    public static void main(String[] args) {
        over s = new over();
        s.sum(10, 20);
        s.sum(10, 20, 30);
    }
}