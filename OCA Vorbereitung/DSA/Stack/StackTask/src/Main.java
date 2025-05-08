public class Main {
    public static void main(String[] args) {


        CustomStack stack=new CustomStack(10);
        System.out.println("--- Browser History Navigation ---");
        System.out.println();
        System.out.println();
        System.out.println("--Your current history--");
        stack.pushData("www.Google.com");
        stack.pushData("www.preply.com");
        stack.pushData("www.abacus.com");
        stack.pushData("www.pbz.com");


        System.out.print("My current page: "); stack.peek();
        System.out.println(" And the index number is: "+stack.top);


        stack.search("www.Google.com");
        stack.stepBack();
stack.stepBack();
stack.stepBack();
stack.stepBack();
stack.stepForward();
stack.stepForward();
stack.stepForward();
stack.stepForward();
stack.deletingEverything();

    }
}