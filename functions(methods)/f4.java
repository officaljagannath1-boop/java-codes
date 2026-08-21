class f4 {
    // function with return type and with no parameter
    static int sum() {
        int a = 5;
        int b = 10;
        int c = 15;
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        // second vey
        int x = sum();
        System.out.println(x);
    }
}