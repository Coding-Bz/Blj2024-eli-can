package NSY.Aquarium.EC;

import NSY.Aquarium.EC.Aquarium.Aqua;
import NSY.Aquarium.EC.Aquarium.Fish;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aqua aqua = new Aqua();
        for (int i = 0; i < 4 + 2; i++) {
            aqua.setTwoD_array(0, i);
            aqua.setTwoD_array(4 + 1, i);
        }
        for (int i = 0; i < 4 + 2; i++) {
            aqua.setTwoD_array(i, 0);
            aqua.setTwoD_array(i, 4 + 1); 
        }

        // Eigenschaften
        ArrayList<Fish> fishList = new ArrayList<>();
        fishList.add(new Fish("O'brian Jackson Liebert Fortner", "Salz", 0, 3, "><(((º>"));
        fishList.add(new Fish("Hans Peter", "Süss", 0, 2, "><((º>"));
        fishList.add(new Fish("Zarvondo Quixar Milan Dragovic", "Salz", 1, 1, "><(º>"));

        Fish fischelif = new Fish("Fischi", "Salz", 1, 3, "><((º>");

        System.out.println(fishList); // Liste der Fische ausgeben

        // Aquarium erstellen und Fische hinzufügen
        aqua.setFishes(fishList); // Alle Fische ins Aquarium setzen
        aqua.setTwoD_array(fischelif.getX(), fischelif.getY());


        aqua.printArray();

        for (Fish fish : fishList) {
            fish.randomMove(aqua.getTwoD_array());
        }

        aqua.printArray();
    }
}
