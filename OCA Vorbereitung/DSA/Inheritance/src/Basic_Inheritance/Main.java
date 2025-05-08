package Basic_Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rc=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("What should be the width? ");
double width= sc.nextDouble();
        System.out.println("What should be the height");
        double height=sc.nextDouble();
        rc.getArea(height, width);





    }
}