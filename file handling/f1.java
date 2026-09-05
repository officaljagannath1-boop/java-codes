import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class f1 {
    public static void main(String[] args) 
    throws IOException {
        File f = new File("sample.txt");

        if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
        } else {
            System.out.println("File already exists : ........." + f.getName()+".......");
        }  
        try (FileWriter n = new FileWriter("sample.txt")) {
            n.write("hii am jp learning Java in TDS Institute");
        }

        String content = Files.readString(Path.of("sample.txt"));
        System.out.println(content);
    } 
}