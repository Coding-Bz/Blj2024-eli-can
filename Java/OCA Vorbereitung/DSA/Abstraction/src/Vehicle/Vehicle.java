package Vehicle;

abstract class Vehicle {


    private String model;

    public  Vehicle(String model){

        this.model=model;
    }

abstract String getfuelType();
abstract void startEngine();
abstract void stopEngine();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
