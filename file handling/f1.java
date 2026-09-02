import java.io.File;
import java.io.IOException;

class f1 {
    public static void main(String[] args) 
    throws IOException {
        File f = new File("sample.txt");

        if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}