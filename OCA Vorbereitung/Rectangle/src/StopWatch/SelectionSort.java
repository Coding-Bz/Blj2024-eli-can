package StopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    private double[]myArray;


    public SelectionSort(){

    }
    public SelectionSort(double[]myArray){
        this.myArray=myArray;

    }

    public void SelectionSorting(double []myArray){
double temp;
        for (int j=0; j< myArray.length; j++){
        for (int i=0; i< myArray.length; i++){

           if (myArray[j]<myArray[i]){
               temp=myArray[j];
               myArray[j]=myArray[i];
               myArray[i]=temp;
           }



        }}
        System.out.println(Arrays.toString(myArray));


    }

    public double[] getMyArray() {
        return myArray;
    }

    public void setMyArray(double[] myArray) {
        this.myArray = myArray;
    }
}
