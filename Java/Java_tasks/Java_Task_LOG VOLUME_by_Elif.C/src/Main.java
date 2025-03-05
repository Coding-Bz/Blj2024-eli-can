import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the length in meters");
        int length=scanner.nextInt();
        System.out.println("now enter the middle diameter in centimeters");
        int middle_diameters=scanner.nextInt();
        double Volume= Math.PI/4*(middle_diameters*middle_diameters)*length/10000;
        System.out.println("Your Volume is "+Volume);

    }
}