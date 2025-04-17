package FahrzeugVermietlung;

public class Truck extends Vehicle {


    private String cargoCapacaty;

    public Truck(String licensePlate, double price, String brand, String cargoCapacity){

super(licensePlate, price, brand);
this.cargoCapacaty=cargoCapacity;
    }

    @Override
    public String description() {
        return super.description() + " | Ladevolumen: " + cargoCapacaty + " Tonnen";
    }
}



