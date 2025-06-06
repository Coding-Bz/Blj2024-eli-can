public class LibraryItem {

private String title;
private String author;
private String ISBN;
private String format;


    public LibraryItem() {
        this.author = "Unknown";
        this.title = "Unknown";
        this.format = "Unknown";
        this.ISBN = "Unknown";
    }


    public void displayItem(){
        System.out.println("The title is: "+title);
        System.out.println("The author is: "+author);
        System.out.println("The ISBN is: "+ISBN);

    }



    public String getTitle() {
        return title; }

    public void setTitle(String title) {
        this.title = title; }

    public String getAuthor() {
        return author; }

    public void setAuthor(String author) {
        this.author = author; }

    public String getISBN() {
        return ISBN; }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN; }
}
