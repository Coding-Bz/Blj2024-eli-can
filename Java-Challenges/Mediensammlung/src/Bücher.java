public class Bücher extends Medien {


    public String autor;


    public Bücher(String titel, String erscheinungsjahr, String sprache, String dostojevski) {
        super(titel, erscheinungsjahr, sprache);
        this.autor=autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void azeigen(){

        super.anzeigen();
        System.out.println("Autor: " + autor);
    }



}
