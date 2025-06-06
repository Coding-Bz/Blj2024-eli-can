// Datei: Person.java
//Von Elif
package ch.Demo0;

public class Person {
    private int Prioritaetstufe;
    private String Fach;
    private String name;

    // Konstruktor
    public Person(int Prioritaetstufe, String Fach, String name) {
        this.Prioritaetstufe = Prioritaetstufe;
        this.Fach = Fach;
        this.name = name;
    }

    // Getter und Setter
    public int getPrioritaetstufe() {
        return Prioritaetstufe;
    }

    public void setPrioritaetstufe(int prioritaetstufe) {
        Prioritaetstufe = prioritaetstufe;
    }

    public String getFach() {
        return Fach;
    }

    public void setFach(String fach) {
        Fach = fach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Prioritaetstufe=" + Prioritaetstufe +
                ", Fach='" + Fach + '\'' +
                ", Name='" + name + '\'' +
                '}';
    }
}
