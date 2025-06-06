public class Filme extends Medien{

public String Regisseur;
public int Laufzeit;

public Filme(String titel, String erscheinungsjahr, String sprache, String number){

    super(titel,erscheinungsjahr,sprache);
    this.Regisseur=Regisseur;
    this.Laufzeit=Laufzeit;
}

    public String getRegisseur() {
        return Regisseur;
    }



    @Override

    public void azeigen(){

        super.anzeigen();
        System.out.println("Regisseur: " + Regisseur);
        System.out.println("Laufzeit:"+ Laufzeit);
    }


}



