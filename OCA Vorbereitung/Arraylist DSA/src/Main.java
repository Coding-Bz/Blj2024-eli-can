import java.util.ArrayList;
import java.util.Scanner;

//Add Exceptions try catch

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Library item1=new Library("Clockwork","Anthonny Burgess","567f");
        Library item2=new Library("OrangeCat","Stefan Zweigli","6dgwu");
        Library item3=new Library("YellowCat","Schillher P.","t67s9");

        ArrayList <Library> myLibrary=new ArrayList<>();
        myLibrary.add(item1);
        myLibrary.add(item2);
        myLibrary.add(item3);


        System.out.println("Is there a specific author you want?");
        String userAuthor= scanner.next();
boolean check=false;
        for (Library l : myLibrary){
            System.out.println("Title: "+l.getTitle()+" Author: "+l.getAuthor()+" ISBN: "+l.getIsbn());
           if (l.getAuthor().equals(userAuthor)){
               check=true;
               System.out.println("Title: "+l.getTitle()+" Author: "+l.getAuthor()+" ISBN: "+l.getIsbn());
           }

        }
        if (check==false){
            System.out.println("Book not found");
        }
        System.out.println("Do you want to add a new book");
        String userChoice=scanner.next();
        if (userChoice.equalsIgnoreCase("yes")){
            System.out.println("Title?");
            String title= scanner.next();
            System.out.println("Author?");
            String author=scanner.next();
            System.out.println("ISBN?");
            String isbn=scanner.next();
            Library item4=new Library(title,author,isbn);
            myLibrary.add(item4);
        }

        System.out.println("Which specific book with the specific isbn do you wnat to delete?");
        String userISBN= scanner.next();
        for (Library l : myLibrary){
            if (l.getIsbn().equals(userISBN)){
                myLibrary.remove(l);
                System.out.println("Succefully removed");
            }


            //Printing all books
            System.out.println("All my books");
            for (Library a : myLibrary){
                System.out.println("Title: "+a.getTitle()+" Author: "+a.getAuthor()+" the isbn: "+a.getIsbn());
            }
        }

    }
}