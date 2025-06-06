public class Main {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second=new Node(30);
        Node fourth=new Node(20);
        first.next=second;
        second.next=fourth;
        Node current=first;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
Node therd=new Node(90);
        second.next=therd;
        therd.next=fourth;
        current=first;
        System.out.println("After adding a new Data in the middle");
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("After adding something a the Start");
        Node Head=new Node(40);
        Head.next=first;
current=Head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }

        System.out.println("After adding something a the End");
        Node newNull=new Node(10);
        fourth.next=newNull;
        current=Head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }



    }
}
