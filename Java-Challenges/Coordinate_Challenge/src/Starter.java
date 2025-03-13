public class Starter {
    public static void main(String[] args) {
CoordinateSystem cs=new CoordinateSystem(900,900);

        cs.addPoint(new CSPoint(200,0));
        cs.addPoint(new CSPoint(12,40));


        CSRenderer renderer=new CSRenderer(cs);

        CSLineSegment line1=new CSLineSegment(new CSPoint(200,0),new CSPoint(12,40));

        cs.addLineSegment(line1);


        new CSRenderer(cs);



    }
}