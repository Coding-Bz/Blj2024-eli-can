package MaxPriorty;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
SubstitutionManager sm1=new SubstitutionManager<>("James",2);
SubstitutionManager sm2=new SubstitutionManager<>("Leon",5);
SubstitutionManager sm3=new SubstitutionManager<>("Lisa",1);
SubstitutionManager sm4=new SubstitutionManager<>("Laura",4);
        ArrayList<SubstitutionManager>myList=new ArrayList<>();
        ArrayList<SubstitutionManager>newList=new ArrayList<>();
        myList.add(sm1);
        myList.add(sm2);
        myList.add(sm3);
        myList.add(sm4);
        System.out.println();
        System.out.println("--- Football Team Substitution Manager ---");

sm1.printingEveryuser(myList);
newList=sm1.Sorting(myList);
sm1.printingEveryuser(newList);
sm1.countingPlayers(myList);
newList=sm1.Deleting(myList);
sm1.printingEveryuser(newList);
sm1.Sorting(newList);





    }

}
