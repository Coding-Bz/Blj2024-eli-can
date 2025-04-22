public class Rectangle implements Sortable {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Integer createArea() {
        return (int)(height * width);
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof Rectangle) {
            Rectangle other = (Rectangle) object;
            int area1 = this.createArea();
            int area2 = other.createArea();

            if (area1 == area2) {
                System.out.println("equals");
                return 0;
            } else if (area1 < area2) {
                System.out.println("less than");
                return -1;
            } else {
                System.out.println("greater than");
                return 1;
            }
        }

        return Integer.MIN_VALUE;
    }

    @Override
    public String toString() {
        return "Rectangle: " + height + "x" + width + ", Area: " + createArea();
    }
}
