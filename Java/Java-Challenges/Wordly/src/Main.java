import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> userWord = new ArrayList<>();
        ArrayList<Character> correctWord = new ArrayList<>();
        ArrayList wordsList = fileArray.fileArray();
        Starter.starter(wordsList,userWord,correctWord,wordsList);
    }
}
