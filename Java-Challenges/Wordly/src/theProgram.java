import java.util.ArrayList;
import java.util.Scanner;
public class theProgram {

    public static String mainProgram(ArrayList<String> words, ArrayList<Character> rightWord,
                                     ArrayList<Character> userWord, String Word ) {
        Scanner scanner=new Scanner(System.in);
        String userAnswer = scanner.next();
        if (Word.equalsIgnoreCase(userAnswer)) {
            System.out.println(userAnswer);
            System.out.println("Korrekt geraten");

        }

        for (int i = 0; i <= 4; i++) {
            if (userAnswer.length() != 5 || !userAnswer.matches("[a-zA-Z]+")) {
                do {
                    System.out.println("Please enter a word with 5 letters");
                    System.out.println(userAnswer.length());
                    userAnswer = scanner.next();

                }
                while (!userAnswer.matches("[a-zA-Z]+") || userAnswer.length() != 5);
            }
            userWord.add((userAnswer.toUpperCase().charAt(i)));
        }

        return userAnswer;
    }
}
