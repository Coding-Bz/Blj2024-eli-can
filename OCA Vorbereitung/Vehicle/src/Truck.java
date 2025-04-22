import java.util.Date;

final class Truck extends Vehicle{

  private double capacity;


  public Truck (double capacity,String model, String fueltype, String date, double distanceTraveled, int maximumSpeed, double usedFuel){
      this.capacity=capacity;
      super(model, fueltype, date, distanceTraveled, maximumSpeed, usedFuel);
  }


    @Override
    public String description() {
        return super.description() + " The capacity of the truck is "+capacity;
    }
}
