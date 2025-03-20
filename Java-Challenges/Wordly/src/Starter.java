import java.util.ArrayList;

public class Starter {


    public static void Starter(String userAnswer, ArrayList words, ArrayList userWord, String Word, ArrayList rightWord){
        int attempts = 0;
        do {
            userAnswer = theProgram.mainProgram(words, rightWord, userWord, Word);
            if (userAnswer.equalsIgnoreCase(Word)) {
                System.out.println("Congratulations! You guessed the word.");
                return;
            }
            input_Check.imputCheck(userAnswer, Word);
            attempts++;
        } while (attempts < 5);
        System.out.println("Game Over! The correct word was: " + Word);
    }




    }



