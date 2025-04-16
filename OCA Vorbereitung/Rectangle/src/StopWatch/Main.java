package StopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){



CreatingArray create=new CreatingArray();
SelectionSort selecting=new SelectionSort();
StopWatch base=new StopWatch();



create.setArray(create.generatingArray());


System.out.println("The starttime is: "+base.start());

selecting.SelectionSorting(create.getArray());

System.out.println("The endtime of the process: "+base.end());
System.out.println("The whole process took: " + (base.getElapsedTime(base.getStartTime(), base.getEndTime()) / 1000.0) + " seconds");







    }
}
