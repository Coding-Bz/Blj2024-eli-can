import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> userWord = new ArrayList<>();
        ArrayList<Character> rightWord = new ArrayList<>();
        ArrayList<String> words = fileArray.fileArray();

        System.out.println("Hello Mr. Montag, guess the word which is 5 letters long");
        int n1 = (int) (Math.random() * words.size());
        String Word = words.get(n1).toUpperCase();
        for (int i = 0; i < 5; i++) {
            rightWord.add(Word.charAt(i));
        }

        String userAnswer=theProgram.mainProgram(words,rightWord,userWord,Word);
        Starter.Starter(userAnswer, words,userWord,Word,rightWord);


    }
}
