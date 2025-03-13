public class CSPoint extends java.awt.Point {

int ID;

private  static int nextId=1;
private int id;



public CSPoint(){
    this(0,0);
}
public CSPoint(int x, int y){
    super(x,y);
    this.id=nextId++;
}





@Override
    public String toString(){
return "THE CSPOINT ID:"+id+"x:"+x+"y:"+y;

}
    }
