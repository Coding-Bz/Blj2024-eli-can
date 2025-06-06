import java.util.LinkedList;
import java.util.Scanner;

public class ListControll {

    private LinkedList<String>theList;


    public LinkedList<String> firstPage() {
        Scanner scanner = new Scanner(System.in);
        theList = new LinkedList<>();
        System.out.println("Choose your Songs");
        String SongName = "";
        do {
            System.out.println("Enter songname if you wanna stop enter 'stop' ");
            SongName = scanner.next();
            theList.add(SongName);
        } while (!SongName.equalsIgnoreCase("stop"));
        System.out.println("All Songs are added");
        return theList;
    }


    public LinkedList<String> getTheList() {
        return theList;
    }

    public void setTheList(LinkedList<String> theList) {
        this.theList = theList;
    }
}
