import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileWrite {
    public static void main(String[] args) throws IOException {

        File keyFile = new File("C:\\Users\\svos14\\Documents\\key.txt");
        File inFile = new File("C:\\Users\\svos14\\Documents\\ord.txt");


        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFile));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        }
        catch(FileNotFoundException e1) {
            System.out.println("Ingen fil hittad!");
        }

    }

}