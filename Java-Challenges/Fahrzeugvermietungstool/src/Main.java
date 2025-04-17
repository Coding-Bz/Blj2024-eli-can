import FahrzeugVermietlung.Contract;
import FahrzeugVermietlung.Person;
import FahrzeugVermietlung.Vehicle;
import FahrzeugVermietlung.VehicleRentalManager;

import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            String RESET = "\u001B[0m";
            String GREEN = "\u001B[32m";
            String PURPLE = "\u001B[35m";
            String CYAN = "\u001B[36m";
Scanner sc=new Scanner(System.in);

VehicleRentalManager VRM=new VehicleRentalManager();

        System.out.println(PURPLE + "╔═══════════════════════════════════════╗");
        System.out.println("║           " + CYAN + "WELCOME TO THE" + RESET + PURPLE + "              ║");
        System.out.println("║           " + GREEN + "EBC CARSTUDIO" + RESET + PURPLE + "               ║");
        System.out.println("╚═══════════════════════════════════════╝" + RESET);

String userAnswer;
        do {
            System.out.println("If you wnat to rent a car please say START");
            userAnswer= sc.next();
        }while (!userAnswer.equalsIgnoreCase("Start"));

Person p1=new Person(LocalDate.of(2024,3,2),true,"Winikerstrasse 3A","Abigailchan");
Vehicle v1=new Vehicle("HHD79SKO",398922,"Toyota");
            try {
                   VRM.createContract(p1, v1, "Das hatten wir noch nicht in Wirtschaft sorry.", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 25));
                    System.out.println("Vertrag für " + p1.getName() + " erfolgreich erstellt.");
            } catch (Exception e) {
                    System.out.println("Fehler: " + e.getMessage());
            }






    }
}