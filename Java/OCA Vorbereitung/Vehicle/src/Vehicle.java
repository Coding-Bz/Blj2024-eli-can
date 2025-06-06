import java.util.Date;

public class Vehicle {


    private String model;
    private String fueltype;
    private String date;
private double distanceTraveled;
private int maximumSpeed;
private double usedFuel;
    public Vehicle(){

    }
    public Vehicle(String model, String fueltype, String date, double distanceTraveled, int maximumSpeed,double usedFuel){
        this.model=model;
        this.fueltype=fueltype;
        this.date=date;
this.maximumSpeed=maximumSpeed;
this.distanceTraveled=distanceTraveled;
this.usedFuel=usedFuel;
    }


    public void fuelEffciency(double usedFuel, double distanceTraveled){

double fuelEfficieny=distanceTraveled/usedFuel;
        System.out.println("Your fuel Eficcieny is: "+fuelEfficieny);

    }

   public String description(){

        return "model: "+model+" fueltype: "+fueltype+" relase date: "+date+" distance traveled: "+distanceTraveled+" max. speed "+maximumSpeed+" fuel Usage: "+usedFuel+" l";


   }


    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getUsedFuel() {
        return usedFuel;
    }

    public void setUsedFuel(double usedFuel) {
        this.usedFuel = usedFuel;
    }
}
