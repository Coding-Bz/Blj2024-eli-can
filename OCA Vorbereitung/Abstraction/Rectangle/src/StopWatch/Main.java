package StopWatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

CreatingArray create=new CreatingArray();
SelectionSort selecting=new SelectionSort();
StopWatch base=new StopWatch();

        System.out.println("What should the Array Size be?");
int n=sc.nextInt();
create.setArray(create.generatingArray(n));


System.out.println("The starttime is: "+base.start());

selecting.SelectionSorting(create.getArray());

System.out.println("The endtime of the process: "+base.end());
System.out.println("The whole process took: " + (base.getElapsedTime(base.getStartTime(), base.getEndTime()) / 1000.0) + " seconds");







    }
}
