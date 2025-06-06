import java.util.HashMap;
import java.util.Map;

public class The_most_frequent_word {

    public static String findthmostFrequentword(HashMap<String, Integer> allValues) {

        String Theword = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : allValues.entrySet()) {

            String word = entry.getKey();
            int count = entry.getValue();

            if (count > max) {
                max = count;
                Theword = word;

            }

        }



        return Theword;

    }




}
