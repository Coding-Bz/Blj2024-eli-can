public class Circle implements Sortable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Integer createArea() {
        return (int) (radius * radius * Math.PI);
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof Circle) {
            Circle other = (Circle) object;
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
        return "Circle: radius " + radius + ", Area: " + createArea();
    }
}
