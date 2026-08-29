
class student {
    public String name = "jp";

    public void display() {
        System.out.println("name = " + name);
    }
}
  class student1{
    private int mark=90;
    void display(){
        System.out.println("mark ="+mark);
    }
}
class student2{
    int age=17;
    void display(){
        System.out.println("age ="+age);
    }
}

public class type_class {
    public static void main(String[] args) {
        student s=new student();
        s.display();
        student1 s1=new student1();
        s1.display();
         student2 s2=new student2();
        s2.display();
        
    }

}
