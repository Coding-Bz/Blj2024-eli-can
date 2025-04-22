import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file); // FileNotFoundException
            int result = 10 / 0; // ArithmeticException
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) { // Catching a general Exception (should be last)
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}