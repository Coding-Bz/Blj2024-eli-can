import java.util.ArrayList;

public class CoordinateSystem  {

    public int height;
    private int width;
    private int line;
    private ArrayList<CSPoint> points;
    private ArrayList<CSLineSegment> lineSegments;
    public CoordinateSystem(int height, int width) {

       this.height=height;
       this.width=width;
       this.line=line;
       this.points=new ArrayList<>();
       this.lineSegments=new ArrayList<>();
        if (height%20!=0 || width %20 !=0){
            throw new IllegalArgumentException("Ungültig");
    }


}

public void addPoint(CSPoint p){
    this.points.add(p);

}


public int getCoordinateSystemSize(){
        return Math.max(this.height,this.width);
}


    public ArrayList<CSPoint> getAllPoints() {
        return points;
    }


    public  ArrayList<CSLineSegment> addinglines(){
        return lineSegments;

    }

    public ArrayList<CSLineSegment>getAlllineSegments() {
        return lineSegments;
    }


    public  void addLineSegment(CSLineSegment line){
        lineSegments.add(line);
    }
}

