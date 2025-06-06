package PlayList;

public class Songs {
    private String songName;
    private int songIDkey;

    public Songs(String songName, int songIDkey){
        this.songIDkey=songIDkey;
        this.songName=songName;

    }

    public int getSongIDkey() {
        return songIDkey;
    }

    public String getSongName() {
        return songName;
    }
}
