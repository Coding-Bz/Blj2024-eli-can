import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList history = new DoublyLinkedList();
        history.addNode("Apple");
        history.addNode("Grape");
        history.addNode("Strawberry");
        history.addNode("Blueberry");
        history.addNode("Rasberry");
        int userChoice = 0;
        while (userChoice != 12) {


            System.out.println("1=show list 2=show list backwards 3=search for a word 12=return");
            userChoice = scanner.nextInt();
            switch (userChoice) {


                case 1: {
history.prinForwards();
break;
                }
                case 2: {
history.printBackwards();
                    break;
                }
                case 3: {
                    System.out.println("Which word dou wanna search?");
                    String userWord= scanner.next();
history.CheckNode(userWord);
                    break;
                }
                default: {
                    System.out.println("Invalid answer");
                }
            }


        }

    }}
