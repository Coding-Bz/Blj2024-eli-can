package PlayList;

import java.util.ArrayList;

public class SongWhole {

    private ArrayList<Songs> playListU;
    private ArrayList<Songs> getPlayListAll;

    public  SongWhole( ){
        this.playListU =new ArrayList<Songs>();
        this.getPlayListAll=new ArrayList<Songs>();
    }

    public ArrayList<Songs> playSongs(String songName){
        System.out.println("You are playing the song:"+songName);
        System.out.println();
        int key=idGenerator(songName);
        Songs sg=new Songs(songName, key);
        getPlayListAll.add(sg);
        boolean check=false;
        for (int b = 0; b< playListU.size(); b++){
            if (playListU.get(b).getSongIDkey()==key){
                check=true;
            }

        }

        if (check==true){
            return  null;
        }
            playListU.add(sg);
        return  playListU;
    }

    public  int idGenerator(String songname){
        int num=0;
        for (int a=0; a<songname.length(); a++){
            num+=songname.charAt(a);
        }
        return num;
    }


    public void CountingUniqueSongs(){
        System.out.println("--Counting unique songs--");
        System.out.println();
        System.out.println("You have song:"+playListU.size());;
    }


    public void CountingAllSong(){
        System.out.println("--Counting all songs--");
        System.out.println();
        System.out.println("You have song:"+getPlayListAll.size());;
    }
}
