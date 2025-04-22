package Shapes;

public class Square implements Calculation{

private int side;


public Square(int side){
    this.side=side;
}


    @Override
    public String calculateArea() {
    int Area=side*side;
        return "Square: \n"+
                "The Area:"+Area;
    }

    @Override
    public String calculatePerimeter() {
    int Perimeter=side*4;
        return "The Perimeter: "+Perimeter;
    }

}
