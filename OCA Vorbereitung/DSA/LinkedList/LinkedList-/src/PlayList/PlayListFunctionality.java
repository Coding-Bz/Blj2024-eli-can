package PlayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class PlayListFunctionality {

    private LinkedList<String>myLList;

public PlayListFunctionality(LinkedList<String>myLList){
    this.myLList=myLList;
}

public void printWhole(ArrayList <String> myList){
    Node first=new Node(myList.get(0));
    Node second=new Node(myList.get(1));
    Node third=new Node(myList.get(2));
    Node fourth=new Node(myList.get(3));
    Node fifth=new Node(myList.get(4));
    first.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    //fifth.next=first;
    Node current=first;
    System.out.println("---Your Playlist-----");
    while (current!=null){
        System.out.println("Adding "+current.data+" to your Playlist");
        current=current.next;
    }
    current=first;
    System.out.println("Current Playlist");
    while (current!=null){
        System.out.println(current.data);
        current=current.next;
    }

}

public LinkedList<String>myList(ArrayList<String>myArrayList){
    LinkedList<String>myLinkedList=new LinkedList<>();
    String currentData=myLinkedList.get(0);
    int i=0;
  for (int j=0; j<myArrayList.size(); j++){
      myLinkedList.add(myArrayList.get(j));
      System.out.println("With method: "+myArrayList.get(j));
  }
  this.myLList=myLinkedList;
 return myLinkedList;

}


public void NextSong(){

}
public void SongBefore(){

}
public void CurrentSong(){
    System.out.println("Your current Song is: "+myLList.get(0));
}
public void showWhole(){


}


}
