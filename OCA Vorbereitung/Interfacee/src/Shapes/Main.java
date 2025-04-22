package Shapes;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(10);
        Triangle triangle = new Triangle(20, 30, 10, 5);


        Calculation [] myObjects=new Calculation[2];
        myObjects[0]=square;
        myObjects[1]=triangle;

        for (int i=0; i<myObjects.length; i++){
            System.out.println(myObjects[i].calculateArea());
            System.out.println(myObjects[i].calculatePerimeter());
        }





    }
}