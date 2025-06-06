package PlayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want to insert some songs? Max:5");
        String userAnswer= scanner.next();
        LinkedList<String>myList=new LinkedList<>();
    PlayListFunctionality plf=new PlayListFunctionality(myList);

    ArrayList <String> myLIst=new ArrayList<>();
        if (userAnswer.equalsIgnoreCase("yes")){
        for(int i=0; i<5; i++){
            System.out.println("Next Song");
            String usersSong=scanner.next();
        myLIst.add(usersSong);
        }}
        if (myLIst!=null){
            plf.printWhole(myLIst);
        }
        plf.CurrentSong();
    }

}
