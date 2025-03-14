import java.util.ArrayList;

public class Creating_a_list_of_words {

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

                int value = essay.charAt(i);
                if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122) || (value >= 196 && value <= 252) || value == 223) {
                    name = name + essay.charAt(i);
                }
            }

        }
        return words;
    }








}
