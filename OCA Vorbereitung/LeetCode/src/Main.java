public class Main {
    public static void main(String[] args) {
//237. Delete Node in a Linked List
//[2,3,4,6,1]
        //HOMEWORK
        int val=4;
Node first=new Node(2);
Node second=new Node(3);
Node third=new Node(4);
Node fourth=new Node(8);
first.next=second;
second.next=third;
third.next=fourth;

if (first.data==val){
    first=first.next;
    return;
}

if (second.data==val){
    second=second.next;
}
if (third.data==val){
    third=third.next;

}

Node current=first;
while (current!=null){
    System.out.println(" "+current.data);
        current=current.next;
    }

}

    }