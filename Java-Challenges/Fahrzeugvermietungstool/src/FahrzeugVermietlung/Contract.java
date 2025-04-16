package FahrzeugVermietlung;

import java.time.LocalDate;

public class Contract {

    private Person person;
    private Vehicle vehicle;
    private String conditions;
    private LocalDate startdate;
    private LocalDate endDate;

    public Contract(Person person, Vehicle vehicle, String conditions, LocalDate startdate, LocalDate endDate){
        this.person=person;
        this.vehicle=vehicle;
        this.conditions=conditions;
        this.startdate=startdate;
        this.endDate=endDate;

    }


    public void validateContract(){


    }
    public void checkAge(){

    }

    public void  checkOverlap(){


    }







}
