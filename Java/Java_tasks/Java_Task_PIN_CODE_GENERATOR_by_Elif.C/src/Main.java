public class Main {
    public static void main(String[] args) {
        int zahl = 0; // Startwert

        do {
            String ZSM = "";


            if (zahl < 10) {
                ZSM = "000" + zahl;
            } else if (zahl < 100) {
                ZSM = "00" + zahl;
            } else if (zahl < 1000) {
                ZSM = "0" + zahl;
            } else {
                ZSM = "" + zahl;
            }

            System.out.println(ZSM);
            zahl++;

        } while (zahl <= 9999);

        System.out.println("END");
    }
}
 