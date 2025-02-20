package NSY.Aquarium.EC.Aquarium;

import java.util.Random;

public class Fish {
    private String name;
    private String wasser; // Wasserart
    private String aussehen;
    private int X; // Position X
    private int Y; // Position Y

    // Konstruktor
    public Fish(String name, String wasser, int koordinate_X, int koordinate_Y, String aussehen) {
        this.name = name;
        this.wasser = wasser;
        this.X = koordinate_X;
        this.Y = koordinate_Y;
        this.aussehen = aussehen;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", wasserart='" + wasser + '\'' +
                ", Koordinaten=(" + X + ", " + Y + ")";
    }

    // Getter und Setter
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public String getAussehen() {
        return aussehen;
    }

    public void randomMove(int[][] grid) {
        Random random = new Random();
        int newX, newY;
        do {
            newX = random.nextInt(grid.length);
            newY = random.nextInt(grid[0].length);
        } while (grid[newX][newY] != 0); // Stelle finden, die nicht belegt ist

        // Aktuelle Position freigeben
        grid[X][Y] = 0;

        // Neue Position setzen
        X = newX;
        Y = newY;
        grid[X][Y] = 1;
    }
}
