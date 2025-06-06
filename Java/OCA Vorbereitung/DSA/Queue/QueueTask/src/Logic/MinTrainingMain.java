package Logic;

import java.util.ArrayList;

public class MinTrainingMain {
    public static void main(String[] args){

        MinTraning check=new MinTraning("",0);
     MinTraning task1=new MinTraning("English Homework",2);
     MinTraning task2=new MinTraning("OCA Training",3);
     MinTraning task3=new MinTraning("Chemistry Exam",5);
     MinTraning task4=new MinTraning("Script project",1);
     MinTraning task5=new MinTraning("German Homework",6);

        ArrayList<MinTraning>myList=new ArrayList<>();
        myList.add(task1);
        myList.add(task2);
        myList.add(task3);
        myList.add(task5);
        check.peekNextTask(myList);

check.getNextTask(myList);
check.getTaskCount(myList);
        myList.add(task4);
        check.getTaskCount(myList);
    }

}
