package Shapes;

public class Triangle implements Calculation{


    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.height=height;
    }


    @Override
    public String calculateArea() {
        int Area= (int) ((int)sideA*height*0.5);
        return "Triangle \n"+
                "The Area: "+Area;
    }

    @Override
    public String calculatePerimeter() {
        int Perimeter=sideA+sideB+sideC;
        return "The Perimeter: "+Perimeter;
    }

}
