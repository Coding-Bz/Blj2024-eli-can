import javax.swing.*;

public class Game {

    private Object[][] gameField;
    Influence influence = new Influence();
    JLabel label;

    public Game() {
        label = new JLabel("", SwingConstants.CENTER);
        label.setIcon(new ImageIcon("C:\\Blj2024-eli-can\\Java\\Java-Challenges\\Sokoban\\Human_Running.jpg"));
        gameField = new Object[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 4, 2, 3, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 3, 4, 1, 0, 0},
                {0, 1, 4, 1, 1, 3, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 4, 0, 1, 1, 0},
                {0, 1, 3, 0, label, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };


    }

    public void moveUp() {
        System.out.println("UP");
        influence.Move(0, -1, gameField);
    }

    public void moveDown() {
        System.out.println("DOWN");
        influence.Move(0, 1, gameField);
    }

    public void moveLeft() {
        System.out.println("LEFT");
        influence.Move(-1, 0, gameField);
    }

    public void moveRight() {
        System.out.println("RIGHT");
        influence.Move(1, 0, gameField);
    }

    public void resetGame() {
        System.out.println("ESC");
    }

    public Object[][] getField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }
}
