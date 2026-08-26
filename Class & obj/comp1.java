class ranimal{

    void sound(){
        System.out.println(" animals class dfgfg");

    }
} 
class doges extends ranimal{
    void sound(){
        System.out.println(" this is doges bhi class");
    }
}

public class comp1 {
    public static void main(String[] args) {
        // this is runtime polymorphism - method overriding
        doges d =new doges();
        d.sound();
        ranimal a=new doges();
        a.sound();
    }
}
