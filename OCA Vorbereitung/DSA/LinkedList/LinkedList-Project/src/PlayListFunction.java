import java.util.LinkedList;

public class PlayListFunction {
    private LinkedList<String>mySongs;

   public PlayListFunction(LinkedList<String>mySongs){
       this.mySongs=mySongs;
   }


   public LinkedList addSong(String newSong){
       mySongs.add(newSong);
       return mySongs;
   }

   public void printPlaylist(){
           for (int i = 0; i < mySongs.size(); i++) {
               System.out.println(mySongs.get(i));
           }

   }


   public LinkedList deleteSong(String songName){
       mySongs.remove(songName);
       return mySongs;
   }

   public void startPlaylist(){
       System.out.println("--You started the Playlist--");
       System.out.println("Current song: "+mySongs.get(0));
   }

   public void choosingSong(int i){
       System.out.println("--Next Song---");
       System.out.println("The Song: "+mySongs.get(i));
   }
   public void SongStop(){
       System.out.println("Song stopped");
   }
   public void SongStart(){
       System.out.println("Song started");
   }


}
