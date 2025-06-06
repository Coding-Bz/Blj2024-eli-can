import java.util.ArrayList;
import java.util.Scanner;

public class AddNewBook {

    private ArrayList<Library>myLibrary;



    public void addBook(ArrayList<Library> myLibrary) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want to add a new book");
        String userChoice=scanner.next();
        if (userChoice.equalsIgnoreCase("yes")){
            scanner.nextLine();
            System.out.println("Title?");
            String title= scanner.nextLine();
            System.out.print("Author?");
            String author=scanner.nextLine();
            System.out.print("ISBN?");
            String isbn=scanner.next();
            Library item4=new Library(title,author,isbn);
            myLibrary.add(item4);

        }

        Menu m=new Menu(myLibrary);
        m.Menu(myLibrary);
    }


}
