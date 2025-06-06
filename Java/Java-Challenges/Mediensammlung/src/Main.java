public class Main {
    public static void main(String[] args) {

        Bücher buch =new Bücher("Crime and Punishment","12.34.5678","russisch","Dostojevski");
        Filme film=new Filme("three idiots","203.349.34.34","indisch","2h");
        CD cd=new CD("die Farbe","23.45.6789","deutsch","2h");
        Videospiele spiel=new Videospiele("Clash Royal","425.32.34","englisch","Mr. Montag");

        System.out.println("Bücher");
        buch.azeigen();
        System.out.println("Filme");
        film.azeigen();
        System.out.println("CD");
        cd.azeigen();
        System.out.println("Videospiele");
        spiel.anzeigen();



    }
}