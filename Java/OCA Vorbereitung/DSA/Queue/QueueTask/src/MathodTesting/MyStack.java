package MathodTesting;

import java.util.LinkedList;

public class MyStack {

    private LinkedList<String> queue = new LinkedList<>();

    public boolean offer(String data){
        System.out.println();
        System.out.println("---Adding the value "+data+" ---");
        System.out.println();
        return queue.add(data);
    }
    public void print(){
        System.out.println();
        System.out.println("---Printing the values---");
        System.out.println();
        for (int i=0; i<queue.size(); i++){
            System.out.println(queue.get(i));
        }
    }

    public String poll(){
        System.out.println();
        System.out.println("---Removing the first value "+queue.get(0)+" ---");
        System.out.println();
      return queue.poll();
    }
    public void removeFull(){
        System.out.println("---Removing process Started---");
        while (!queue.isEmpty()){
            System.out.println("Removing: "+queue.poll());
        }
    }


    }

