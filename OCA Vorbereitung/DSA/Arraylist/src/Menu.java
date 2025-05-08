import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

private ArrayList<Library>myLibrary;
    public Menu(ArrayList<Library> myLibrary) {
        this.myLibrary = myLibrary;
    }

    public ArrayList<Library> getMyLibrary() {
        return myLibrary;
    }

    public void setMyLibrary(ArrayList<Library> myLibrary) {
        this.myLibrary = myLibrary;
    }

    public void Menu(ArrayList<Library> myLibrary){
        Scanner scanner=new Scanner(System.in);
        System.out.println("------------------------\n"+
                "Delete = 1\n"+
                "Search sepcific author=2\n"+
                "Add=3\n"+
                "Print everything out=4");
        int userChoice=scanner.nextInt();
        switch (userChoice){

            case 1:{
                DeleteBook db=new DeleteBook();
                db.deleteBook(myLibrary);
            }
            case 2:{
                BySpecificAuthor bsa=new BySpecificAuthor();
                bsa.findSpecificAuthor(myLibrary);
            }
            case 3:{
                AddNewBook anb=new AddNewBook();
                anb.addBook(myLibrary);

            }
            case 4:{
                PrintEverything pe=new PrintEverything();
                pe.printEverything(myLibrary);
            }
            int [] array=new int [10];
        }




    }
}
