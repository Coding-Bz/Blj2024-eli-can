package Vehicle;

public class Motorcycle extends Vehicle{

    private String fueltype;
    public Motorcycle(String model,String fueltype) {
        super(model);
        this.fueltype=fueltype;
    }

    @Override
    String getfuelType() {
        return "Motorcycles fueltype is: "+fueltype;
    }

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped");

    }
}
