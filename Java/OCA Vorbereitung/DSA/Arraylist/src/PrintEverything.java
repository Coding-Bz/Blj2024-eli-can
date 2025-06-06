import java.util.ArrayList;

public class PrintEverything {

    public void printEverything(ArrayList<Library>myLibrary){
        System.out.println("These are all the books in the library");
        for (Library l : myLibrary){
            System.out.println("Title: "+l.getTitle()+" Author: "+l.getAuthor()+" ISBN: "+l.getIsbn());
        }
        Menu m=new Menu(myLibrary);
        m.Menu(myLibrary);
    }
}
