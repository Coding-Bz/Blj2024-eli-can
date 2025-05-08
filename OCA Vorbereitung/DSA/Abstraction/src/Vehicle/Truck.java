package Vehicle;

public class Truck extends Vehicle{

private String fueltype;
    public Truck(String model, String fueltype) {
        super(model);
        this.fueltype=fueltype;
    }

    @Override
    String getfuelType() {
        return "Truck's fueltype is: "+fueltype;
    }

    @Override
    void startEngine() {
        System.out.println("Truck engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Truck engine stopped");
    }
}
