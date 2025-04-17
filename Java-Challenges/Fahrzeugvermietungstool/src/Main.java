import FahrzeugVermietlung.*;


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
int userChoice;

        List<Truck> trucks = Arrays.asList(new Truck("dhgu3689",19000,"Honda","25l"),
                new Truck("duei78392",30000,"Nissan","10l"),
                new Truck("bvzu83w2s",15000,"Suzuki","18l"),
                new Truck("bdhcj2678",20000.0,"Suzuki","20 l"));
        List<Small_car> smallCar=Arrays.asList(    new Small_car("udie789",3000,"Lexus",2),
                new Small_car("deuhui79",3600,"Subaru",3),
                new Small_car("bdei7638",45000,"Acura",4),
                new Small_car("dbuze793",30000,"Toshiba",3));
        List<Caravan> caravans=Arrays.asList( new Caravan("hui894",20000,"Toyota",200),
                new Caravan("bzude789", 23999,"Isuzu",30),
                new Caravan("neu8393",89000,"Daihatsu",300),
                new Caravan("heui9839",78000,"Toyota",250));
        List<Luxury_Cars> luxury_carsList=Arrays.asList( new Luxury_Cars("bhue789",300000,"Scion",'A'),
                new Luxury_Cars("BGZUE769",40000,"Isuzu",'B'),
                new Luxury_Cars("dz6e78GZU",2400000,"Nissan",'A'),
                new Luxury_Cars("GZUIE89",280000,"Mitsuoka",'C'));



        Person p1=new Person(LocalDate.of(2024,3,2),true,"Winikerstrasse 3A","Abigailchan");




        Vehicle v1=new Vehicle("HHD79SKO",398922,"Toyota");
        do {
            System.out.println("What kind of a vehicle do you want to check out? 0=Truck 1=SmallCar 2=Caravan 3=LuxuryCar ");
           userChoice= sc.nextInt();
        }while (userChoice !=0 && userChoice !=1 && userChoice !=2 && userChoice !=3);


        switch (userChoice){
            case 0:{

                for (Truck truck : trucks) {
                    System.out.println(truck);
                }

                System.out.println("Give the ID of the vehicle you want to buy");
                int userVehicle=sc.nextInt();

                Truck truck=new Truck(trucks.get(userVehicle).getLicensePlate(),trucks.get(userVehicle).getPrice(),trucks.get(userVehicle).getBrand(),"590");
                try {
                    VRM.createContract(p1, truck, "min. 18, nicht in denylist", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 25));
                    System.out.println("Vertrag für " + p1.getName() + " erfolgreich erstellt.");
                } catch (Exception e) {
                    System.out.println("Fehler: " + e.getMessage());
                }
                break;
            }

            case 1:{
                for (Small_car smallCars : smallCar) {
                    System.out.println(smallCars);
                }
                System.out.println("Give the ID of the vehicle you want to buy");
                int userVehicle=sc.nextInt();

                trucks.get(userVehicle);
                Small_car smallcar=new Small_car(smallCar.get(userVehicle).getLicensePlate(),smallCar.get(userVehicle).getPrice(),smallCar.get(userVehicle).getBrand(),2);


                try {
                    VRM.createContract(p1, smallcar, "Das hatten wir noch nicht in Wirtschaft sorry.", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 25));
                    System.out.println("Vertrag für " + p1.getName() + " erfolgreich erstellt.");
                } catch (Exception e) {
                    System.out.println("Fehler: " + e.getMessage());
                }


                break;
            }
            case 2:{
                for (Caravan caravan: caravans){
                    System.out.println(caravan);
                }
                System.out.println("Give the ID of the vehicle you want to buy");
                int userVehicle=sc.nextInt();


              Caravan caravan =new Caravan(caravans.get(userVehicle).getLicensePlate(),caravans.get(userVehicle).getPrice(),caravans.get(userVehicle).getBrand(),200);
                try {
                    VRM.createContract(p1, caravan, "Das hatten wir noch nicht in Wirtschaft sorry.", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 25));
                    System.out.println("Vertrag für " + p1.getName() + " erfolgreich erstellt.");
                } catch (Exception e) {
                    System.out.println("Fehler: " + e.getMessage());
                }

                break;
            }
            case 3:{
                for (Luxury_Cars luxury_cars : luxury_carsList){
                    System.out.println(luxury_cars);
                }
                System.out.println("Give the ID of the vehicle you want to buy");
                int userVehicle=sc.nextInt();

                Luxury_Cars luxurycars=new Luxury_Cars(luxury_carsList.get(userVehicle).getLicensePlate(),luxury_carsList.get(userVehicle).getPrice(),luxury_carsList.get(userVehicle).getBrand(),'A');


                try {
                    VRM.createContract(p1, luxurycars, "Das hatten wir noch nicht in Wirtschaft sorry.", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 25));
                    System.out.println("Vertrag für " + p1.getName() + " erfolgreich erstellt.");
                } catch (Exception e) {
                    System.out.println("Fehler: " + e.getMessage());
                }
                break;
            }

        }

/*
        switch (userChoice){
            case 0:{
                String name="truck";

            }
            case 1:{
                String name="smallcar";
            }
            case 3:{
                String name="luxurycars";
            }
            case 2:{
                String name="caravan";
            }
        }
*/




    }
}