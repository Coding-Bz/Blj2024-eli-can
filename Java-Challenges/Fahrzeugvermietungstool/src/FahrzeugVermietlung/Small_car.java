package FahrzeugVermietlung;

import javax.xml.validation.Validator;

public class Small_car extends Vehicle {


    private int seatNumber;

    public Small_car(String licensePlate, double price, String brand, int seatNumber){

        super(licensePlate, price, brand);
        this.seatNumber=seatNumber;
    }

    @Override
    public String description() {
        return super.description() + " | Anzahl Plätze: " + seatNumber;
    }


}
