package NSY.Aquarium.EC.Aquarium;

import java.util.List;

public class Aqua {
    private int[][] twoD_array = new int[4 + 2][4 + 2]; // 6x6 Raster
    private List<Fish> fishes; // Liste von Fischen im Aquarium

    // Methode, um eine Liste von Fischen zu setzen
    public void setFishes(List<Fish> fishes) {
        this.fishes = fishes;
        for (Fish fish : fishes) {
            setTwoD_array(fish.getX(), fish.getY());
        }
    }

    public void setTwoD_array(int x, int y) {
        twoD_array[x][y] = 1;
    }

    public int[][] getTwoD_array() {
        return twoD_array;
    }

    public void printArray() {
        for (int row = 0; row < twoD_array.length; row++) {
            for (int col = 0; col < twoD_array[row].length; col++) {
                // Prüfen, ob ein Fisch an dieser Position ist
                boolean hasFish = false;
                if (fishes != null) {
                    for (Fish fish : fishes) {
                        if (fish.getX() == row && fish.getY() == col) {
                            System.out.print("  " + fish.getAussehen() + "  "); // Fischmuster drucken
                            hasFish = true;
                            break;
                        }
                    }
                }
                if (!hasFish) {
                    System.out.print("|        .");
                }
            }
            System.out.println();
        }
    }
}
