class Node {
    String data;
    Node prev;
    Node next;

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

public void CheckNode(String data){
        Node current=head;
        boolean check=false;
while (current != null){

    if (current.data.equalsIgnoreCase(data)){
        check=true;
    }
    current=current.next;
}
if (check==true){
    System.out.println("True: is in the list");
}
else {
    System.out.println("Not in the list");
}

}
public void prinForwards(){
    Node current=head;
        while (current != null){
            System.out.println("--"+current.data+"--");
            current=current.next;
        }
}
public void printBackwards(){
        Node current=tail;
        while (current!=null){
            System.out.println("--"+current.data+"--");
            current=current.prev;
        }

}


}
