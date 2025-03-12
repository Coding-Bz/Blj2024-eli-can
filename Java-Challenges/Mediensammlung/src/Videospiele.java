public class Videospiele extends  Medien {

    public String Developer;


    public Videospiele(String titel, String erscheinungsjahr, String sprache, String s) {
        super(titel, erscheinungsjahr, sprache);
        this.Developer=Developer;
    }

    public String getAutor() {
        return Developer;
    }

    @Override
    public void azeigen(){

        super.anzeigen();
        System.out.println("Autor: " + Developer);
    }



}
