// Datei: Hallo.java
//Von Elif
package ch.Demo0;
import java.util.Scanner;

import java.util.ArrayList;

public class Hallo {
    public static void main(String[] args) {
        ArrayList<Person> PersonList = new ArrayList<>();
        PersonList.add(new Person(2, "Deutsch", "Aufgabe"));
        PersonList.add(new Person(1, "Deutsch", "Aufgabe"));
        PersonList.add(new Person(2, "Deutsch", "Aufgabe"));

        // Ausgabe der Liste
        System.out.println(PersonList);
        System.out.println("Willst du etwas einfügen falls ja, schreibe 1, wenn nicht 2");

        int hoehe;

        Scanner scanner = new Scanner(System.in);
        hoehe = scanner.nextInt();
        if (hoehe <= 0 | hoehe >2) {                 //Fehlerbehandlung
            System.out.println("Leider ungültige Antwort🥶");
        }
        System.out.println("very thank you");
    }
}
