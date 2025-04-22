package StopWatch;

public class CreatingArray {

    private double[]Array=new double[100000];

    public CreatingArray(){

    }

    public CreatingArray(double[]Array){

        this.Array=Array;
    }



    public double[] generatingArray(int n){
      double[]Array=new double[n];
        for (int i=0; i< Array.length; i++){
            Array[i]=Math.random()*1000;
        }

        return  Array;
    }


    public double[] getArray() {
        return Array;
    }

    public void setArray(double[] array) {
        Array = array;
    }
}
