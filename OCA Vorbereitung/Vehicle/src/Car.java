import java.util.Date;

final class Car extends Vehicle{


    private int seats;

    public Car(){

    }
    public Car(int seats, String model, String fueltype,String date, double distanceTraveled, int maximumSpeed, double usedFuel){
this.seats=seats;
        super(model, fueltype, date, distanceTraveled, maximumSpeed, usedFuel);
    }


    @Override
    public String description() {
        return super.description() +" the car has: "+seats+" seats";
    }
}

