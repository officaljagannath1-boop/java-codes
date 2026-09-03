import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class f1 {
    public static void main(String[] args) 
    throws IOException {
        File f = new File("sample.txt");

        if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
        } else {
            System.out.println("File already exists : ........." + f.getName()+".......");
        }  
        FileWriter n=new FileWriter(" j.txt");
        n.write(" hii am  jp learnig java in tds institud"); 
        n.close();
    } 
}