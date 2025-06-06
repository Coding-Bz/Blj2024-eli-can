package Vehicle;

public class Car extends Vehicle{
    private String fueltype;
    public Car(String model,String fueltype) {
        super(model);
        this.fueltype=fueltype;
    }

    @Override
    String getfuelType() {
        return "Car's fueltype is: "+fueltype;
    }

    @Override
    void startEngine() {

    }

    @Override
    void stopEngine() {

    }
}
