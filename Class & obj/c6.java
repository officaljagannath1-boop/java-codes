class animal1 {
    void eat1() {
        System.out.println("animal eats faa ");
    }
}

class dog1 extends animal1 {
    void bas1() {

        System.out.println("dog bark");
    }
}

class puppi1 extends dog1 {
    void play1() {

        System.out.println(" puppi plays with humans");
    }
}

public class c6 {
    public static void main(String[] args) {
        puppi1 s1 = new puppi1();
        s1.eat1();
        s1.bas1();
        s1.play1();

    }
    // this is example of multilevel inheritance in java. In multilevel inheritance,
    // a class is derived from another class, which is also derived from another
    // class. In this example, the animal1 class is the base class, the dog1 class
    // is derived from the animal1 class, and the puppi1 class is derived from the
    // dog1 class. The eat1() method is inherited by both the dog1 and puppi1
    // classes,
    // while the bas1() method is inherited by the puppi1 class. The play1() method
    // is specific to the puppi1 class.
}
