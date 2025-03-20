import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class fileArray {


    public static ArrayList fileArray() throws IOException {



        File file = new File("C:\\Blj2024-eli-can\\Java-Challenges\\Wordly\\src\\wordlist.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String lt="";
        String line;


        while ((line = br.readLine()) != null) {
            lt = lt + line+" " ;

        }

        return Generator.essaycontroll(lt);
    }


}
