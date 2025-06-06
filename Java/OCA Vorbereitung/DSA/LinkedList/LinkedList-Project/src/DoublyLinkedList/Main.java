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

    public void addLast(String data) {
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

    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public int getSize() {
        return size;
    }
}
