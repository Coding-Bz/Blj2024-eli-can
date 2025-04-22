package Printing;

public class Car implements PrintDetails{


    private String color;
    private String model;

    public Car(String color,String model){
        this.color=color;
        this.model=model;
    }


    @Override
    public String printDetails() {
        return "Car details:\n"+
                "The color of the car is: "+color+" and the model is: "+model;
    }
}
