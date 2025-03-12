public class CD extends Medien {

    public int Laufzeit;

    public CD(String titel, String erscheinungsjahr, String sprache, String s){

        super(titel,erscheinungsjahr,sprache);
        this.Laufzeit=Laufzeit;
    }



    @Override

    public void azeigen(){

        super.anzeigen();
        System.out.println("Laufzeit:"+ Laufzeit);
    }


}
