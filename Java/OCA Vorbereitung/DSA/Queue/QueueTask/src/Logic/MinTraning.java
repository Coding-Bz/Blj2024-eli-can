package Logic;

import java.util.ArrayList;

public class MinTraning {

    private String taskName;
    private int priorty;

    public MinTraning(String taskName, int priorty){
        this.taskName=taskName;
        this.priorty=priorty;

    }

    public boolean isSchedulerEmpty(ArrayList<MinTraning>List){
        boolean check=false;
       if (List.size()==0) {
           check=true;
       }
        return check;
    }

    public void getTaskCount(ArrayList<MinTraning>checkCount){
        System.out.println("-------------------");
        if (isSchedulerEmpty(checkCount)){
            System.out.println("Your list is empty!");
        }
        System.out.println("You have "+ checkCount.size()+" tasks.");

    }
    public ArrayList peekNextTask(ArrayList<MinTraning>myList){
        System.out.println("-------------------");
        if (isSchedulerEmpty(myList)){
            System.out.println("Your list is empty!");
        }
        int minNum=myList.get(0).priorty;
        String taskName = "";
        for (int i=0; i<myList.size(); i++){
            if (myList.get(i).priorty<minNum){
                minNum=myList.get(i).priorty;
                taskName=myList.get(i).taskName;
            }
        }


        System.out.println("---Getting the first Value---");
        System.out.println("Task name: "+taskName+" Priority: "+minNum);

        System.out.println("Printing everything out!");
        for (int i=0; i<myList.size();i++){
            System.out.println("Task name: "+myList.get(i).taskName+" the priorty: "+myList.get(i).priorty);

        }
return myList;
    }
    public void getNextTask(ArrayList<MinTraning>myList){
        System.out.println("-------------------");
        System.out.println("---Showing and removing the first index");
        myList=peekNextTask(myList);
        myList.remove(0);
        System.out.println("Now the first data is: "+myList.get(0).taskName+" and the priority is: "+myList.get(0).priorty);

    }

    public void showingEverything(ArrayList<MinTraning>myList){
        System.out.println("-------------------");
        myList=peekNextTask(myList);
        System.out.println("Printing everything out!");
        for (int i=0; i<myList.size();i++){
            System.out.println("Task name: "+myList.get(i).taskName+" the priorty: "+myList.get(i).priorty);

        }

    }
    }




