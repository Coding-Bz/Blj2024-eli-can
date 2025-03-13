import java.util.ArrayList;

public class CoordinateSystem  {

    public int height;
    private int width;
    private ArrayList<CSPoint> points;
    public CoordinateSystem(int height, int width) {

       this.height=height;
       this.width=width;
       this.points=new ArrayList<>();
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
}

