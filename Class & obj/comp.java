class math1{
    void sum(int a, int b){
        System.out.println("a+b= "+(a+b));
        
    }
    void sum(int a, int b , int c){
        System.out.println("a+b+c= "+(a+b+c));
        
    }
}

public class comp {
    public static void main(String[] args) {
        // this is compile time polymorphism - method overloading
    math1 m=new math1();
    m.sum(11,22);
    m.sum(22,33,44);
    }
}
