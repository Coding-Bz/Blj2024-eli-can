package MaxPriorty;

import java.util.ArrayList;

public class SubstitutionManager<T> {
private T playerName;
private T playerNiveau;

public SubstitutionManager(T playerName, T playerNiveau){
    this.playerName=playerName;
    this.playerNiveau=playerNiveau;
}

public void printingEveryuser(ArrayList<SubstitutionManager>myList){
    System.out.println();
    System.out.println("---Printing every Player---");
    System.out.println();
    for (int i=0; i<myList.size();i++){
        System.out.println("Name: "+myList.get(i).playerName+" ,niveuau: "+myList.get(i).playerNiveau);
    }

}

    public ArrayList<SubstitutionManager> Sorting(ArrayList<SubstitutionManager> myList) {
        for (int i = 0; i < myList.size(); i++) {
            int check = i;
            for (int j = i + 1; j < myList.size(); j++) {

                int niveauJ = (int) myList.get(j).playerNiveau;
                int niveauCheck = (int) myList.get(check).playerNiveau;

                if (niveauJ > niveauCheck) {
                    check = j;
                }
            }


            Object tempNiveau = myList.get(i).playerNiveau;
            Object tempName = myList.get(i).playerName;
            myList.get(i).playerNiveau = myList.get(check).playerNiveau;
            myList.get(i).playerName = myList.get(check).playerName;
            myList.get(check).playerNiveau = tempNiveau;
            myList.get(check).playerName = tempName;

        }
        return myList;
    }

public void countingPlayers(ArrayList<SubstitutionManager>myList){
    System.out.println("You have "+myList.size()+" players.");

}

    public ArrayList<SubstitutionManager> Deleting(ArrayList<SubstitutionManager> myList){
        System.out.println();
        System.out.println("Removing the player with the highest niveau");
        System.out.println();
        myList.removeFirst();
        return myList;
    }


}