import java.io.*;
import java.util.*;

public class Solution<T> {

    public void  printArray(T []myList){
        for(int i=0; i<myList.length; i++){
            System.out.println(myList[i]);
        }


    }
    public static void main(String[] args) {

String []myArray={"1","2","3","Hello","World"};
        Solution solution=new Solution<>();
        solution. printArray(myArray);

    }


}