package FahrzeugVermietlung;

import java.time.LocalDate;

public class Contract {

    private Person person;
    private Vehicle vehicle;
    private String conditions;
    private LocalDate startdate;
    private LocalDate endDate;

    public Contract(Person person, Vehicle vehicle, LocalDate startdate, LocalDate endDate, String conditions){
        this.person=person;
        this.vehicle=vehicle;
        this.conditions=conditions;
        this.startdate=startdate;
        this.endDate=endDate;

    }


    public void validateContract(){


    }
    public void checkAge(int age) throws MinorAgeException {

if(age<18){
    throw new MinorAgeException("You have to be at least 18 to rent a vehicle.");
}

    }

    public void  checkOverlap(){


    }







}
