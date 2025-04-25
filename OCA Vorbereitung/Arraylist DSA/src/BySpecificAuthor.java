import java.util.ArrayList;
import java.util.Scanner;

public class BySpecificAuthor {
    public void findSpecificAuthor(ArrayList<Library> myLibrary){
        Scanner scanner=new Scanner(System.in);
        try {


            System.out.println("Is there a specific author you want?");
            String userAuthor = scanner.nextLine();
            boolean check = false;
            for (Library l : myLibrary) {
                if (l.getAuthor().equals(userAuthor)) {
                    check = true;
                    System.out.println("Title: " + l.getTitle() + " Author: " + l.getAuthor() + " ISBN: " + l.getIsbn());
                }

            }
            if (check==false){
                throw new AuthorNotFoundException("The author was not found");
            }


            }catch (AuthorNotFoundException e){
            System.out.println("Searches author not in the library" +e.getMessage());
        }

        Menu m=new Menu(myLibrary);
        m.Menu(myLibrary);

    }

}
