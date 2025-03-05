import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Compute computeGarmentSize = new Compute();
        System.out.println("What is your height?");
       computeGarmentSize.length=scanner.nextInt();
        System.out.println("Waist?");
       computeGarmentSize.waist=scanner.nextInt();
        System.out.println("What is your gender? (Female, Male)");
       computeGarmentSize.Gender=scanner.next();




        computeGarmentSize.computeGarmentSize();
    }
}
