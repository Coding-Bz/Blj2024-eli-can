import java.util.ArrayList;
import java.util.Scanner;

public class AddNewBook {

    private ArrayList<Library>myLibrary;



    public void addBook(ArrayList<Library> myLibrary)  throws BookAlreadyExistingException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want to add a new book");
        String userChoice=scanner.next();
        if (userChoice.equalsIgnoreCase("yes")){
            System.out.println("Title?");
            String title= scanner.nextLine();
            System.out.println("Author?");
            String author=scanner.nextLine();
            System.out.println("ISBN?");
            String isbn=scanner.next();
            Library item4=new Library(title,author,isbn);
            myLibrary.add(item4);
            if (myLibrary.contains(item4)){
                throw new BookAlreadyExistingException("This book is already in the library!");
            }
        }

        Menu m=new Menu(myLibrary);
        m.Menu(myLibrary);
    }


}
