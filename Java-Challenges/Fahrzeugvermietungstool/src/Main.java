import FahrzeugVermietlung.Contract;
import FahrzeugVermietlung.Person;
import FahrzeugVermietlung.Vehicle;
import FahrzeugVermietlung.VehicleRentalManager;

import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        Person person=new Person(LocalDate.of(2000,2,10));
        VehicleRentalManager manager=new VehicleRentalManager();
        Vehicle vehicle=new Vehicle();

        Contract contract=new Contract(person, vehicle, LocalDate.now(), LocalDate.now().plusMonths(6));


        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";


        System.out.println(PURPLE + "╔═══════════════════════════════════════╗");
        System.out.println("║           " + CYAN + "WELCOME TO THE" + RESET + PURPLE + "              ║");
        System.out.println("║           " + GREEN + "EBC CARSTUDIO" + RESET + PURPLE + "               ║");
        System.out.println("╚═══════════════════════════════════════╝" + RESET);

String userAnswer;
        do {
            System.out.println("If you wnat to rent a car please say START");
            userAnswer= sc.next();
        }while (!userAnswer.equalsIgnoreCase("Start"));









    }
}