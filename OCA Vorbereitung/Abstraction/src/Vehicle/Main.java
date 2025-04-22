package Vehicle;

public class Main {
    public static void main(String[] args){


Vehicle car=new Car("Mercedes","Diesel");
Vehicle motorcycle=new Motorcycle("BMW","Benzin");
Vehicle truck=new Truck("Toyota","Diesel");

        System.out.println(car.getfuelType());
        System.out.println(motorcycle.getfuelType());
        System.out.println(truck.getfuelType());

        car.startEngine();
        motorcycle.startEngine();
        truck.startEngine();

        car.stopEngine();
        motorcycle.stopEngine();
        truck.stopEngine();


    }

}
