package Task_Aggrogation;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;


    public Library(String name, ArrayList<Book> books){
        this.name=name;
        this.books=books;
    }

    public void addBooks(Book book){
        this.books.add(book);
        System.out.println("adding a book "+book.getTitle()+" and the author is "+book.getAuthor());

    }


    public ArrayList<Book> getBooks() {

        return books;

    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
