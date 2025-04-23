package SimatedBuisness;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory item1 = new Inventory("47GUD", 20);
        Inventory item2 = new Inventory("zvd78J", 30);
        Inventory item3 = new Inventory("367dgj", 10);
        Inventory item4 = new Inventory("48fgui", 40);

        ArrayList<Inventory> myItems = new ArrayList<Inventory>();
        myItems.add(item1);
        myItems.add(item2);
        myItems.add(item3);
        myItems.add(item4);

        int check = 0;

        System.out.println("Hello print out the ItemID of the item you wanna buy.");
        String userOrder = scanner.next();

        try {
           int order = 0;
            for (Inventory i : myItems) {
                if (i.getItemID().equals(userOrder)) {
                    check = 1;
                 order=i.getQuantity();
                    break;
                }
            }

            if (check == 0) {
                throw new NotInInventoryException("This item doesn't exist");
            }

            System.out.println("Item found!");
            System.out.println("How many do you want from this specific item?");
            int orderSize=scanner.nextInt();

            if (order<orderSize){
throw new InsufficientStockException("Not enough items in stock");

            }
           LocalDateTime time =LocalDateTime.now();
            System.out.println("Payment processing....");
            System.out.println(time);
            System.out.println("Please enetr your name");
            String name=scanner.next();
            System.out.println("Enter your card details");
            String cardDetails= scanner.next();
            LocalDateTime timeEnd =LocalDateTime.now();
            System.out.println(timeEnd);
            System.out.println(timeEnd.compareTo(time));
            if (timeEnd.compareTo(time)>2){
                throw new PaymentProcessingException("Time limit reached");
            }
        } catch (NotInInventoryException e) {
            System.out.println("Not in the inventory: " + e.getMessage());
        }
        catch (InsufficientStockException e){
            System.out.println("The required amount couldn't be matched: "+e.getMessage());
        } catch (PaymentProcessingException E){
            System.out.println("The given time limit was reached by the customer"+E.getMessage());
        }finally {
            System.out.println("Process done!");
        }
    }
}
