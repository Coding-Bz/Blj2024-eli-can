package Task_Aggrogation;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        Book book1 = new Book("Crime and punishment", "Dostojewski");
        Book book2 = new Book("The phyisicans", "Friedrich Dürrenmatt");

        Library library = new Library("PBZ", new ArrayList<Book>());
library.addBooks(book);
library.addBooks(book1);
library.addBooks(book2);

library.getBooks();



    }
}