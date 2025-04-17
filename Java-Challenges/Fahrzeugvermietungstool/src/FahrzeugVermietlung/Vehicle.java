package FahrzeugVermietlung;

public class Vehicle {

    private String licensePlate;
    private double price;
    private String brand;


public  Vehicle(String licensePlate, double price, String brand){

    this.licensePlate = licensePlate;
    this.price = price;
    this.brand=brand;
}


public String description(){
    return "Marke: "+brand+" Preis: "+price+" Kennzeichen: "+licensePlate;


}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
