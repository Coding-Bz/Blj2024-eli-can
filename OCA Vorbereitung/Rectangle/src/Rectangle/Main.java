package Rectangle;

public class Main {
    public static void main(String[] args) {


Rectangle propertyRectangle=new Rectangle(20.2, 10);
Rectangle propertyDefault=new Rectangle();
        System.out.println("The perimeter: "+propertyRectangle.getPerimeter(propertyRectangle.getWidth(), propertyRectangle.getHeight()));
        System.out.println("The area: "+propertyRectangle.getArea(propertyRectangle.getWidth(), propertyRectangle.getHeight()));
        System.out.println(propertyRectangle.toString(propertyRectangle.getWidth(),propertyRectangle.getHeight()));
        System.out.println("The perimeter: "+propertyDefault.getPerimeter(propertyDefault.getWidth() ,propertyRectangle.getHeight()));
        System.out.println("The area: "+propertyDefault.getArea(propertyRectangle.getWidth(), propertyDefault.getHeight()));
        System.out.println(propertyDefault.toString(propertyDefault.getWidth(), propertyDefault.getHeight()));




    }
}