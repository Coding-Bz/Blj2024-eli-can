import java.util.ArrayList;
import java.util.Scanner;

public class DeleteBook {

    public void deleteBook(ArrayList<Library> myLibrary){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which specific book with the specific isbn do you wnat to delete?");
        String userISBN= scanner.next();
       try {
           boolean check = false;

           for (Library l : myLibrary) {
               if (l.getIsbn().equals(userISBN)) {
                   check = true;
                   myLibrary.remove(l);
                   System.out.println("Succefully removed");
               }
           }
           if (check==false){
               throw new ISBNNotFoundException("this ID doesen't exist");
           }
       }catch (ISBNNotFoundException e){
           System.out.println("ID not found " +e.getMessage());

       }
        Menu m=new Menu(myLibrary);
        m.Menu(myLibrary);

    }
}
