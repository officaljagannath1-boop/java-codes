public class c2 {
    static class student
    // this is single inheritance use of inheritance is to reuse the code of parent
    // class in child class.
    {
        void a() {
            System.out.println(" am student");

        }
    }

    static class result extends student {
        void b() {

            System.out.println("result is pass");
        }
    }

    public static void main(String[] args) {
        result r1 = new result();
        r1.a();
        r1.b();

    }
}