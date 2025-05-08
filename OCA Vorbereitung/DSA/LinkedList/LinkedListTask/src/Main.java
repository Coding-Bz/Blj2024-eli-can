

public class Main {
    public static void main(String[] args) {



        CircularSinglyLinkedList csl=new CircularSinglyLinkedList();
        csl.addPlayer("Thomas Müller");
        csl.addPlayer("Ronaldo");
        csl.addPlayer("Arda Güler");
        csl.addPlayer("Messi");
        csl.traverse();
        csl.addPlayerIndex("Ronaldo","NewPlayer");
        csl.traverse();
        csl.countPlayers();
        csl.deletePlayer("Messi");
        csl.traverse();
        csl.addPlayer("James");
        csl.traverse();


    }
}
