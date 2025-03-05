public class Leapyear {
    boolean year; // Speichert das Ergebnis
    int yearim;

    public void setYear(int yearim) {
        this.yearim = yearim;

        if (yearim % 400 == 0) {
            this.year = true;
        }
        else if (yearim % 4 == 0 && yearim % 100 != 0) {
            this.year = true;
        }
        else {
            this.year = false;
        }
        if (this.year){
            System.out.println("That's a leap year");
        }
        else {
            System.out.println("That's not leap year");
        }
    }
}
