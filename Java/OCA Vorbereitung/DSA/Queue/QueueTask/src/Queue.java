public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public class ListNode{
        private ListNode next;
        private String data;


        public ListNode(String data){
            this.data=data;
            next=null;
        }

    }

    public boolean isQueueEmpty(){
        return  length==0;
    }

    public boolean isQueueFull(){
        return length>=10;
    }

    public void adding(String data){
        System.out.println();
        System.out.println("--- Adding the documents ---");
        System.out.println();
        ListNode newDocument=new ListNode(data);
        if (isQueueFull()){
            System.out.println("The capacity is reached!");
            return;
        }
        if (length<1){
            front=newDocument;
            rear=newDocument;
            System.out.println(newDocument.data);
        }
        else {
            rear.next=newDocument;
            rear=newDocument;
            System.out.println(newDocument.data);
        }
        length++;

    }

public void printing(){
    System.out.println();
    System.out.println("--- Printing documnets ---");
    System.out.println();
        if (length==0){
            System.out.println("Not found any data to print");
            return;
        }
        ListNode current=front;
        while (current!=null){
            System.out.println("File: "+current.data);
            current=current.next;
        }

}
public void deleting(){

    System.out.println();
    System.out.println("--- Deleting documents ---");
    System.out.println();


    if (length==0){
        System.out.println("The Queue is already empty");
    }
    else {
        front=front.next;
        length--;
        if (front==null){
            rear=null;
        }
        System.out.println("The first in elemt was succesfully deleted");

    }
}


}
