import java.awt.*;
import java.util.*;

public class Starter {
    public static void main(String[] args) {
        CoordinateSystem cs = new CoordinateSystem(900, 900);
        Scanner scanner = new Scanner(System.in);
        int numberpointers;
        ArrayList<CSLineSegment> belief = new ArrayList<>();
        ArrayList<Integer> hope = new ArrayList<>();
        boolean controll = false;
        String useranswer;

        System.out.println("Welcome to this program 😀");


        while (!controll) {
            System.out.println("Please enter 'start' for the example:");
            useranswer = scanner.next();
            if (useranswer.equalsIgnoreCase("Start")) {
                controll = true;
            }
        }

      /*  System.out.println("Wich color should the lines be? 1=rot, 2=blau, 3=schwarz");
        int Ihateusers = scanner.nextInt();
        switch (Ihateusers) {
            case 1:
                @Override

                        g2d.setColor(Color.RED);
            case 2:
                @Override
                        g2d.setColor(Color.BLUE);
            case 3:
                @Override
                        g2d.setColor(Color.BLACK);

        }*/
                do {
                    System.out.println("How many points do you want to draw?");
                    numberpointers = scanner.nextInt();
                    controll = true;

                    if (numberpointers == 0 || numberpointers == 1) {
                        System.out.println("That is not possible.");
                        System.out.println("Try again.");
                        controll = false;
                    }
                } while (!controll);

                for (int i = 0; i < numberpointers; i++) {
                    String ID = "";
                    for (int j = 0; j < 10; j++) {
                        char first = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
                        ID += first;
                    }

                    System.out.println("Enter coordinates for point 1 (x, y):");
                    int userchoicex = scanner.nextInt();
                    int userchoicey = scanner.nextInt();

                    System.out.println("Enter coordinates for point 2 (x, y):");
                    int userchoicex2 = scanner.nextInt();
                    int userchoicey2 = scanner.nextInt();

                    CSLineSegment line = new CSLineSegment(new CSPoint(userchoicex, userchoicey),
                            new CSPoint(userchoicex2, userchoicey2));
                    belief.add(line);
                    cs.addLineSegment(line);
                }

                CSRenderer renderer = new CSRenderer(cs);
        }
    }
