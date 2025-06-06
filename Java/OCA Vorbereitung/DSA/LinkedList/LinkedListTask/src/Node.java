class CircularSinglyLinkedList {
    private Node head;
    private int size;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularSinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }


    public void countPlayers(){
        System.out.println("--Players count--");
        if (head==null){
            System.out.println("No players right now");
        }
        int count = 1;
        Node current = head;
        while (current.next != head) {
            count++;
            current = current.next;
        }
        System.out.println("There are: " + count + " players.");
    }

    public void addPlayer(String data){
        System.out.println("--Adding new players--");
Node userNode=new Node(data);
        if (head == null) {
            head = userNode;
            head.next = head;}
        else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = userNode;
            userNode.next = head;
        }
        size++;

    }

    public void deletePlayer(String data) {
        System.out.println("Deleting a player--");
        if (head == null)
            System.out.println("No players avaliable");;
        Node current = head;
        Node prev = null;
        Node right = head;
        boolean check = false;
        Node result = null;

        if (result == head) {
            if (head.next == head) {
                head = null;
            }
            do {
            if (right.data.equalsIgnoreCase(data)) {
                check = true;
                result = right;
                break;
            }
            prev = right;
            right = right.next;
        } while (right != head);

        if (check == false) {
            System.out.println("No player with that name");
            return;
        }

        if (result == head) {
            if (head.next == head) {
                head = null;
            } else {
                Node tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }
                head = head.next;
                tail.next = head;
            }
        } else {
            prev.next = result.next;
        }
        size--;
    }}


public void addPlayerIndex(String key, String info){
    System.out.println("--Adding a player at a specific index--");
    if (head == null) {
        System.out.println("They are no avaliable players!");
    }
    Node current = head;
    do {
        if (current.data.equalsIgnoreCase(info)) {
            Node userNode = new Node(key);
            userNode.next = current.next;
            current.next = userNode;
            size++;
            return;
        }
        current = current.next;
    } while (current != head);

}
public void traverse(){
    System.out.println("--Printing all users out--");
        Node current=head;
        if (head==null){
            System.out.println("No players to show!");
        }
      do {
          System.out.println("Player: "+current.data);
          current=current.next;

      }while (current!=head);

}

}