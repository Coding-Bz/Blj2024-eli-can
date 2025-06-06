public class Influence {

    public void Move(int above,int side,Object[][]gameField){
        int length=0;
        int height=0;
        for (int i=0; i<gameField.length; i++){
            for (int j=0; j<gameField.length-1; j++){
                if (gameField[i][j].equals(5)){
                    length=i;
                    height=j;
                }
            }

        }
if (!gameField[length+side][height+above].equals(1)){
        Object temp=gameField[length][height];
        gameField[length][height]=gameField[length+side][height+above];
        gameField[length+side][height+above]=temp;}

    }
    }



