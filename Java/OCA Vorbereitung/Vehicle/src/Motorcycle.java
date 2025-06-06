import java.util.Date;

final class Motorcycle extends Vehicle{

    private char type;


    public Motorcycle(char type, String model, String fueltype, String date, double distanceTraveled, int maximumSpeed, double usedFuel){
        this.type=type;
        super(model, fueltype, date, distanceTraveled, maximumSpeed, usedFuel);
    }

    @Override
    public String description() {
        return super.description() +" the motorcyle type is: "+type;
    }
}
