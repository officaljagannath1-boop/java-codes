interface a {
    void ainfo();

}
interface b{
    void binfo();
}
class allinfo implements a,b{
    
    public void ainfo() {
        System.out.println("this is ainfo class");
        
    }
    
    public void binfo() {
        System.out.println("this is binfo class");
        
    }
    

    
}
public class interface2 {
    public static void main(String[] args) {
        // this is multiple inerface
        allinfo aa =new allinfo();
        aa.ainfo();
        aa.binfo();

    }

}
