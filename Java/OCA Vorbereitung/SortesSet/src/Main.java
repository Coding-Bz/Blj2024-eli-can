public class Main {
    public static void main(String[] args){

      GameScore gs=new GameScore();
      ScorePlayer sp1=new ScorePlayer("James",2);
      ScorePlayer sp2=new ScorePlayer("Jackson",4);
      ScorePlayer sp3=new ScorePlayer("Sophia",1);
      ScorePlayer sp4=new ScorePlayer("Leon",5);
      gs.add(sp1);
      gs.add(sp2);
      gs.add(sp3);
      gs.add(sp4);

      gs.getTopPlayers(4);
      gs.getPlayerRank("Leon");
      gs.getPlayerRank("Linda");




    }
}
