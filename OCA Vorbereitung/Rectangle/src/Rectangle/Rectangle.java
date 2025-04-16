package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        this.height=0.0;
        this.width=0.0;

    }
    public Rectangle(double width, double height){
        this.height=height;
        this.width=width;
    }


public double getArea(double width, double height){

    return width*height; //Should I inline, this is what the compiler recommends

}
    public double getPerimeter(double width, double height){

        return 2*(width+height);

    }
    public String toString(double width, double height){

        return "The width: "+width+" , The height: "+height;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }




}
