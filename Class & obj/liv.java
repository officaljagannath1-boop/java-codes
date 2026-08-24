
class livingorg {
    void poforg() {
        System.out.println(" this is suuper class 'living organisms'");

    }
}

class canimal extends livingorg {
    void manimal() {

        System.out.println(" this is animal class ");
    }
}

class cplants extends livingorg {

    void mpants() {
        System.out.println(" this is plant class");
    }
}

public class liv {
    public static void main(String[] args) {
        canimal a = new canimal();
        a.poforg();
        a.manimal();
        cplants p = new cplants();
        p.poforg();
        p.mpants();
    }
    // this is example of hierarchical inheritance in java.
    // In hierarchical inheritance, multiple classes are derived from a single
    // parent class. In this example, the livingorg class is the parent class,
    // and the canimal and cplants classes are derived from it. The canimal
    // class represents animals, while the cplants class represents plants.
    // Both classes inherit the poforg() method from the livingorg class,
    // which prints a message indicating that they are living organisms.
    // The manimal() method in the canimal class and the mpants() method in the
    // cplants class print messages specific to their respective classes.
}
