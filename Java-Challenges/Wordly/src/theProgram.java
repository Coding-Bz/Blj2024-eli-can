import java.util.*;
public class theProgram {

    public static String mainProgram(ArrayList<String> words, ArrayList<Character> rightWord,
                                     ArrayList<Character> userWord, String Word ) {

        Scanner scanner = new Scanner(System.in);
        String userAnswer;

        do {
            System.out.println("Please enter a word with 5 letters:");
            userAnswer = scanner.next();
        } while (!userAnswer.matches("[a-zA-Z]+") || userAnswer.length() != 5);


        for (int i = 0; i < 5; i++) {
            userWord.add(userAnswer.toUpperCase().charAt(i));
        }

        return userAnswer;

    }
}
