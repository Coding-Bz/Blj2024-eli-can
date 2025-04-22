import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vehicle vc=new Vehicle();
Truck truck=new Truck(5,"Nissan","diesel","25.11.2012",200,200,30);
Motorcycle motorcycle=new Motorcycle('A',"BMW","Benzin","23.03.2022",120,200,100);
Car car=new Car(5,"Mercedes","gasoline","12.06.2019",160,200,200);


        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(truck);
        vehicles.add(motorcycle);
        vehicles.add(car);

        for (Vehicle v : vehicles) {
            System.out.println(v.description());
            v.fuelEffciency(v.getUsedFuel(), v.getDistanceTraveled());
        }


    }
}