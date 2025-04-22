package Printing;

public class Book implements  PrintDetails{

    private String title;
    private String author;

    public Book(String title, String author){
        this.author=author;
        this.title=title;

    }



    @Override
    public String printDetails() {
        return "Book details:\n" +
                "The title is: " + title + " and the author is: " + author;
    }
}
