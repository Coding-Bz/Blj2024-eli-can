import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryItem [] items=new LibraryItem[4];

        for (int i=0; i<items.length; i++){
        int userChoice;
        do {
            System.out.println("Hello user 1= book 2= dvd 3= magazine");
            userChoice = sc.nextInt();
        } while (userChoice != 1 && userChoice != 2 && userChoice != 3);

        sc.nextLine();

        switch (userChoice) {
            case 1: {
items [i]=new Book() ;
                break;
            }
            case 2: {
items[i]=new DVD();
                break;
            }
            case 3: {
items[i]=new Magzine();
                break;
            }
        }
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            items[i].setTitle(title);

            System.out.print("Enter author: ");
            String author = sc.nextLine();
            items[i].setAuthor(author);

            System.out.print("Enter ISBN: ");
            String ISBN = sc.nextLine();
            items[i].setISBN(ISBN);
    }

        for (LibraryItem item : items) {
            item.displayItem();
            System.out.println();
        }
}

}
