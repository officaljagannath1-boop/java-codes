import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class my_info {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter file name to store your info : ");
        String fname = sc.nextLine();

        File f = new File(fname);

        if (f.createNewFile()) {
            System.out.println("..........File created  [ " + f.getName() + " ].......");
        } else {
            System.out.println("File already exists : .........[ " + f.getName() + " ].......");

        }
        try (FileWriter fr = new FileWriter(fname);) {

            System.out.print("enter data to write in " + f.getName() + "  :");
            String d = sc.nextLine();
            
            fr.write(d);
        } 
        System.out.println("\n...........file Reading started now ......\n\n");
        try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
    }
}
