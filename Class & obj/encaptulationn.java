class school{
  private  String name;
  private int age;

    // setor methods
        public void setname(String name){
            this.name=name;


         }
        public void setage(int age){
             this.age=age;

        }
        //geter methods
        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }
}
public class encaptulationn { 
    public static void main(String[] args) {
        school s=new school();
        s.setname("jagannath");
        s.setage(14);
       System.out.println( s.getname() );
       System.out.println( s.getage() );
    }
    
}
