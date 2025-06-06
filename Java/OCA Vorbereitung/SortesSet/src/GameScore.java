public class GameScore {

    private ScorePlayer[] myList = new ScorePlayer[10];
    private int Size;

    public GameScore() {

    }

    public ScorePlayer[] add(ScorePlayer sp) {
        System.out.println("---Adding a player---");
        System.out.println();
        boolean controll = false;
        for (int z = 0; z < myList.length; z++) {
            if (myList[z] != null && myList[z].getName().equalsIgnoreCase(sp.getName())) {
                controll = true;
            }
        }
        if (controll == true) {
            System.out.println("This player already exists in the list");
            return null;
        }

        if (myList[0] == null) {
            myList[0] = sp;
            System.out.println("Player: "+sp.getName()+" Score: "+sp.getScore()+" was added.");
            return myList;
        } else {
            int check = -1;
            for (int b = 0; b < myList.length; b++) {
                if (myList[b] == null) {
                    check = b;
                    break;
                }
            }
            if (check == -1) {
                System.out.println("List is full.");
                return null;
            }
            myList[check] = sp;
        }

        System.out.println("Player: "+sp.getName()+" Score: "+sp.getScore()+" was added.");
        Sorting(myList);

        return myList;
    }

    public void getTopPlayers(int count) {
        System.out.println("---Get Top Players---");
        System.out.println();
        int printed = 0;
        for (int b = 0; b < myList.length && printed < count; b++) {
            if (myList[b] != null) {
                System.out.println("Player name: " + myList[b].getName() + " score: " + myList[b].getScore());
                printed++;
            }
        }
    }

    public void getPlayerRank(String name) {
        System.out.println("---Get player Rank---");
        System.out.println();
        for (int z = 0; z < myList.length; z++) {
            if (myList[z] != null && myList[z].getName().equalsIgnoreCase(name)) {
                System.out.println("Your player's Rank is: " + (z + 1));
            }
        }
    }

    public ScorePlayer[] Sorting(ScorePlayer[] myList) {
        int validLength = 0;
        for (ScorePlayer p : myList) {
            if (p != null) validLength++;
        }

        for (int i = 0; i < validLength; i++) {
            int check = i;
            for (int j = i + 1; j < validLength; j++) {
                int niveauJ = myList[j].getScore();
                int niveauChcek = myList[check].getScore();
                if (niveauJ < niveauChcek) {
                    check = j;
                }
            }
            Object tempNiveau = myList[i].getScore();
            Object tempNmae = myList[i].getName();
            myList[i].setScore(myList[check].getScore());
            myList[i].setName(myList[check].getName());
            myList[check].setScore((Integer) tempNiveau);
            myList[check].setName((String) tempNmae);
        }

        return myList;
    }

    public ScorePlayer[] getMyList() {
        return myList;
    }

    public void setMyList(ScorePlayer[] myList) {
        this.myList = myList;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }
}
