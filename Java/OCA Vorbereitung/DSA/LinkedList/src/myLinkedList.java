public class myLinkedList {

Node myElement;

public void myList(int data, int otherData){


    if (myElement==null){ //Bas bossa
        myElement=new Node(data);
    }
    else {
        Node newNode = new Node(otherData); //doluysa o verlien deger yinede kunlaniliyor ve bbas ikinci yere atiliror
        newNode.next = myElement;
        myElement = newNode;

    }
    System.out.println(myElement);

}}
