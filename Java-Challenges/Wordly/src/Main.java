import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> userWord=new ArrayList<>();
        ArrayList<Character> rightWord=new ArrayList<>();
        String Word="hello";
        for (int i=0; i<=4; i++){
           rightWord.add((Word.toUpperCase().charAt(i)));}

        System.out.println("Hello Mr. Montag, guess the word wich is 5 letters long");
        String userAnswer= scanner.next();
        if (Word.equalsIgnoreCase(userAnswer)){
            System.out.println(userAnswer);
            System.out.println("Korrekt geraten");
            return;

        }

        for (int i=0; i<=4; i++){
            int value= userAnswer.charAt(i);
            if (userAnswer.length() != 5 || !userAnswer.matches("[a-zA-Z]+"))
            {
                do {
                    System.out.println("Please enter a word with 5 letters");
                    System.out.println(userAnswer.length());
                    userAnswer = scanner.next();
                    value = userAnswer.charAt(i);
                }
                while (value > 96);
            }
            userWord.add((userAnswer.toUpperCase().charAt(i)));}
        boolean Controll=false;
        int j=0;
int i=0;
        System.out.println();
        while (i<5 || j<5){

String naming="";


if (userAnswer.charAt(i)==Word.charAt(i)){
    naming="\u001B[32m"+userAnswer.charAt(i)+"\u001B[0m";
    System.out.print(naming);
}
                if (userAnswer.charAt(i)==Word.charAt(j)){
                    naming="\u001B[33m"+userAnswer.charAt(i)+"\u001B[0m";
                    System.out.print(naming);

                    j++;
                }
                else {

                  naming="\u001B[31m"+userAnswer.charAt(i)+"\u001B[0m";
                    System.out.print(naming);

                   i++;
                }

            }
        System.out.println();
        System.out.println(userWord+"   "+rightWord);
    }

}
