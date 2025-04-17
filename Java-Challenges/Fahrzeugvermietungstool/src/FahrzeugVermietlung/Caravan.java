package FahrzeugVermietlung;

public class Caravan extends Vehicle{


    private double size;

    public Caravan(String licensePlate, double price, String brand, double size){

        super(licensePlate, price, brand);
        this.size=size;
    }

    @Override
    public String description() {
        return super.description() + " | Wohnwagen: " + size;
    }


}
