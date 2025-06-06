import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListControll lc = new ListControll();
        Menu menu = new Menu();
        Redirection rd = new Redirection();
        LinkedList<String> newList = lc.firstPage();

        boolean check = true;
        Scanner scanner = new Scanner(System.in);

        while (check) {
            menu.printingMenu();
            rd.reDirection(newList);
        }
    }
}
