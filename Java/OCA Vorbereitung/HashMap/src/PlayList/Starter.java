package PlayList;

public class Starter {
    public static void main(String[] args){

        SongWhole sw=new SongWhole();
        System.out.println();
        System.out.println("--- Song History Tracker ---");
        System.out.println();
        sw.playSongs("Vivaldi");
        sw.playSongs("Mozart");
        sw.playSongs("Mozart");
        sw.playSongs("Beethoven");
        sw.CountingAllSong(); //Expected 4
        sw.CountingUniqueSongs(); //Exopected 3


    }
}
