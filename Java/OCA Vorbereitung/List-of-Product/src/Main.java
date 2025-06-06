public class Main {
    public static void main(String[] args) {
    UniqueProducts up=new UniqueProducts();
    Product p1=new Product("Eggs",20);
    Product p2=new Product("Milk",10);
    Product p3=new Product("Butter",9.5);
    Product p4=new Product("Strawberry",12.8);
    Product p5=new Product("Melon",3.8);

    up.add(p1);
    up.add(p2);
    up.add(p3);
    up.add(p4);
    up.add(p5);

    up.getCheapestPrice();
    up.getHighestPrice();
    up.getTopPlayers(5);






    }
}