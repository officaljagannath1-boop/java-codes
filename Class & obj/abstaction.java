abstract class animal {
    abstract void sound();

    void eat() {
        System.out.println(" animal follow food chain");
    }

}

class dogi extends animal {
    void bo() {
        System.out.println("dogesh bhai class");
    }
    
    @Override
    void sound() {
        System.out.println("dog sound");
    }
}

public class abstaction {
    public static void main(String[] args) {
        dogi d = new dogi();
        d.eat();

        d.bo();
        // this is abstract class - we can not create object of abstract class
        //use of abstract class is to achieve abstraction and multiple inheritance in java
        
    }

}
