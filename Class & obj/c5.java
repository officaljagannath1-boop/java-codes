
class animal {

    void eat() {
        System.out.println("animal eat aa");
    }
}

class dog extends animal {

    void borks() {

        System.out.println("dog barks");
    }
}

class c5 {
    public static void main(String[] args) {
        dog s1 = new dog();
        s1.borks();
        s1.eat();// super class method

    }

}
