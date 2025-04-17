package FahrzeugVermietlung;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Person {
Scanner sc=new Scanner(System.in);

private LocalDate birthYear;
private boolean denylisted;
private String adress;
private String name;


public  Person(LocalDate birthYear, boolean denylisted, String adress, String name){
    this.birthYear=birthYear;
this.denylisted=denylisted;
    this.adress=adress;
    this.name=name;

}




/*public LocalDate  getBirthYear() {

    LocalDate dateBirth;
    try {
        System.out.println("Year");
        int year = sc.nextInt();
        System.out.println("Month");
        int month = sc.nextInt();
        System.out.println("Day");
        int day = sc.nextInt();
        dateBirth = LocalDate.of(year, month, day);
        return dateBirth;
    } catch (Exception a) {
        System.out.println("Wrong datatype");
    } finally {
        System.out.println("Try again with the correct datatypes");
    }

} */


public int getAge(){
   int currentYear=LocalDate.now().getYear();
   return  currentYear - birthYear.getYear();
}

    public LocalDate getBirthYear() {
        return birthYear;
    }



    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }


    public boolean isDenied(){
        return denylisted;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isDenylisted() {
        return denylisted;
    }

    public void setDenylisted(boolean denylisted) {
        this.denylisted = denylisted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
