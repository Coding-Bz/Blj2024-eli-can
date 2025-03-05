import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String useranswer;

do {
    System.out.println("Gebe den ersten Zahl ein");
    int n1 = scanner.nextInt();
    System.out.println("Gebe den zweiten Zahl ein");
    int n2 = scanner.nextInt();

    int result = (n2 * (n2 + 1)) / 2 - (n1 * (n1 + 1)) / 2 + n1; //GauschenSummenformel
    System.out.println(result);
    System.out.println("Willst du es nochmals spielen ja oder nein?");
    useranswer=scanner.next();
    System.out.println(useranswer);

}
while (useranswer .equals("ja"));

if (useranswer .equals("nein")){
    System.out.println("Das Spiel ist zu Ende! Vielen Dank fürs speieln!");
}










        }


    }
    
