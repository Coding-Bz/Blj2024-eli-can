
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Clockminutes computeHourHandAngle=new Clockminutes();
Clockwork computeMinuteHandAngle=new Clockwork();


        double Angle;
Scanner scanner=new Scanner(System.in);
        System.out.println("hour?");
        computeHourHandAngle.hour= scanner.nextInt();
        System.out.println("minutes?");
        computeHourHandAngle.minute= scanner.nextInt();
        computeMinuteHandAngle.minute= computeHourHandAngle.minute;
        computeHourHandAngle.computeHourHandAngle();
        computeMinuteHandAngle.computeMinuteHandAngle();
    }
}