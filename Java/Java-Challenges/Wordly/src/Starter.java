import java.util.*;
public class Starter {


    public static void starter(ArrayList words, ArrayList userWord, ArrayList rightWord, ArrayList wordsList){
        int attempts = 0;
        System.out.println("Hello Mr. Montag, guess the word which is 5 letters long");
        int randomNumber = (int) (Math.random() * wordsList.size()+1);
        String word = wordsList.get(randomNumber).toString().toUpperCase();
        do {
            String userAnswer = theProgram.mainProgram(words, rightWord, userWord, word);
            if (userAnswer.equalsIgnoreCase(word)) {
                System.out.println("Congratulations! You guessed the word.");
                return;
            }
            input_Check.imputCheck(userAnswer, word);
            attempts++;
        } while (attempts < 5);
        System.out.println("Game Over! The correct word was: " + word);
    }




}



