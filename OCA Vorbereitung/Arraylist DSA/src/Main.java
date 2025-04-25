import java.util.ArrayList;
import java.util.Scanner;

//Add Exceptions try catch

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Library item1=new Library("Clockwork","Anthonny Burgess","567f");
        Library item2=new Library("OrangeCat","Stefan Zweigli","6dgwu");
        Library item3=new Library("YellowCat","Schillher P.","t67s9");

        ArrayList<Library> myLibrary=new ArrayList<>();
        myLibrary.add(item1);
        myLibrary.add(item2);
        myLibrary.add(item3);

        Menu m = new Menu(myLibrary);
        m.Menu(myLibrary);

        }
}