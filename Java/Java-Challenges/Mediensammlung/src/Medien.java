public abstract class Medien {

    private String titel;
    private String sprache;
    private String erscheiningsjahr;

    public Medien(String titel, String erscheinungsjahr, String sprache) {
     this.titel=titel;
    this.erscheiningsjahr =erscheinungsjahr;
     this.sprache=sprache;
    }



    public String getTitel() {
        return titel;
    }

    public String getSprache() {
        return sprache;
    }

    public  String getErscheiningsjahr(){
        return erscheiningsjahr;
    }


    public void anzeigen(){
        System.out.println("Titel:"+titel);
        System.out.println("Sprache:"+sprache);
        System.out.println("Erscheiningsjahr:"+erscheiningsjahr);

    }


    public abstract void azeigen();
}
