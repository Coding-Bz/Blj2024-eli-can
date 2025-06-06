import java.io.*;
import java.util.*;


public class fileArray {

    public static ArrayList fileArray() throws IOException {

        File file = new File("src\\wordlist.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String wordList="";
        String theWord;


        while ((theWord = br.readLine()) != null) {
            wordList = wordList + theWord+" " ;

        }

        return Generator.essaycontroll(wordList);
    }


}
