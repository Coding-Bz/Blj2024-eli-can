public class Starter {
    public static void main(String[] args) {
CoordinateSystem cs=new CoordinateSystem(600,200);

        cs.addPoint(new CSPoint(20,4));
        cs.addPoint(new CSPoint(12,40));
        cs.addPoint(new CSPoint(-2,8));

        CSRenderer renderer=new CSRenderer(cs);

    }
}