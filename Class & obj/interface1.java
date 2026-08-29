interface animal11 {
    void sound();

}

class doges11 implements animal11 {

    
    public void sound() {
       System.out.println("this is dogesh bhai class sjdfnhkj");

    }
}

public class interface1 {
    public static void main(String[] args) {
        doges11 d = new doges11();
        d.sound();
        // single interface example
        // interface is a blueprint of class
        // it has static constants and abstract methods
        // it is used to achieve abstraction and multiple inheritance in java
        // it can be implemented by any class, from any inheritance tree.
        // an interface is not a class, it is a collection of abstract methods and
        // static constants.
        // an interface can be implemented by any class, from any inheritance tree.
        // an interface can be extended by another interface.
        // an interface can have default and static methods.
        // an interface can have private methods.
    }
}
