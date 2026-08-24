 class c1 {
 static class student {

    String name ;
    int age;
    int roll;
   
       
   void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }
    
 }
 public static void main(String[] args) {
    student s1 = new student();
    s1.name = "John";
    s1.age = 20;
    s1.roll = 101;
    s1.display();
     
 }
}
