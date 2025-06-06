package MathodTesting;

import java.util.Queue;

public class Starter {
    public static void main(String[] args) {
       MyStack myStack=new MyStack();


       myStack.offer("Cat");
       myStack.offer("Dog");
       myStack.offer("Bird");
       myStack.print();
       myStack.print();
       myStack.offer("Lion");
       myStack.print();
       myStack.poll();
       myStack.removeFull();


    }
}
