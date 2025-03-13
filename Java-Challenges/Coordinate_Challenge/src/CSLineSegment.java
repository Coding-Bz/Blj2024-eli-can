public class CSLineSegment {

  private CSPoint start;
  private CSPoint end;

  public  CSLineSegment(CSPoint start,CSPoint end){

      this.end=end;
      this.start=start;
  }



 public CSPoint getStart(){
      return start;

 }

 public CSPoint getEnd(){
      return end;
 }


 @Override
    public String toString(){
      return "CSLineSegment, Start:" +start +"End:"+end;
 }

}
