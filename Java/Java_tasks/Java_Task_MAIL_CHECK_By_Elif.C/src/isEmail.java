public class isEmail {

String Passwort;


    public  void ultramegacool(){


        boolean Voraussetzung000= Passwort.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n");



        if (Voraussetzung000 ){
            System.out.println("Ja sehr gut Bravoooooooo!!!");
        }

        else {
            System.out.println("Falsch");
        }
    }
}
