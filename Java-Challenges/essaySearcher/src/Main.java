import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> allValues = new HashMap<>();
        File file = new File("C:\\Blj2024-eli-can\\Java-Challenges\\essaySearcher\\src\\script.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = "";
        String line;

        while ((line = br.readLine()) != null) {
            st = st + line;

        }
        ArrayList<String> words =  Creating_a_list_of_words.essaycontroll(st);
        System.out.println(words.size());
        System.out.println(words);
        for (String valueCounting : words) {
            allValues.put(valueCounting, allValues.getOrDefault(valueCounting, 0) + 1);

        }
        The_most_frequent_word.findthmostFrequentword(allValues);
        String theword = The_most_frequent_word.findthmostFrequentword(allValues);
        String name = creating_a_list_hashmap.listmaker(allValues);
        Output.filemaker(words, theword, allValues, name);


    }

}






