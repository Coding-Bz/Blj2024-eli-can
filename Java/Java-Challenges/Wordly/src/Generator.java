import java.util.*;

public class Generator {

    public static ArrayList essaycontroll(String lt) {
        ArrayList<String> words = new ArrayList<>();
        String singleWord = "";

        for (int i = 0; i <= lt.length() - 2; i++) {
            if (lt.charAt(i) == ' ') {
                if (lt.charAt(i + 1) == ' ') {
                    i = i + 1;
                }
                words.add(singleWord);
                singleWord = "";

            }
            if (lt.charAt(i) != ' ') {


                singleWord = singleWord + lt.charAt(i);

            }

        }
        if (words.isEmpty()) {
            System.out.println("Error: The word list is empty.");
        }
            return words;
        }}