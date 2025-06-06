package FahrzeugVermietlung;

public class Luxury_Cars extends Vehicle{


    private char classNiveau;

    public Luxury_Cars(String licensePlate, double price, String brand, char classNiveau){

        super(licensePlate, price, brand);
        this.classNiveau=classNiveau;
    }

    @Override
    public String description() {
        return super.description() + " | KlassNiveau: " + classNiveau ;
    }

}
