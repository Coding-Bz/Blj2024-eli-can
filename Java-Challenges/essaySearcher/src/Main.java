import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

HashMap<String, Integer> hellooamericaa=new HashMap<>();
        File file = new File("C:\\Blj2024-eli-can\\Java-Challenges\\essaySearcher\\src\\script.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = "";
        String line;
        while ((line = br.readLine()) != null) {

            st = st + line;


        }
        ArrayList<String> words = essaycontroll(st);
        System.out.println(words.size());
        System.out.println(words);
        for (String cryingoutloud : words){
            hellooamericaa.put(cryingoutloud, hellooamericaa.getOrDefault(cryingoutloud,0)+1);

        }
        System.out.println(hellooamericaa);
        System.out.println(hellooamericaa.size());
        System.out.println(hellooamericaa.keySet());
        System.out.println(hellooamericaa.values());

    }

    public static ArrayList essaycontroll(String essay) {


        String name = "";
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i <= essay.length() - 1; i++) {



            if (essay.charAt(i) == ' ') {
                if (essay.charAt(i + 1) == ' ') {
                    i = i + 1;
                }
                words.add(name);
                name = "";
            }



            if (essay.charAt(i) != ' ') {

                int value=essay.charAt(i);
                if ((value>=65 && value <=90) ||
                        (value >= 97 && value <= 122) ||
                        (value >= 196 && value <= 252) ||
                        value == 223) {
                    name = name + essay.charAt(i);
                }

            }

        }
        return words;
    }
}



