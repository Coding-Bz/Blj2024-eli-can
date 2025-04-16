package FahrzeugVermietlung;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


public class VehicleRentalManager {

    private ArrayList <Person> customerList;
    private ArrayList <Person> denylist;
    private ArrayList <Vehicle> vehicles;
    private ArrayList <Contract> contracts;




    public VehicleRentalManager(){

        this.customerList=new ArrayList<>();
        this.vehicles=new ArrayList<>();
        this.contracts=new ArrayList<>();
        this.denylist=new ArrayList<>();
    }



    public void addPersonToDenylist(Person Person){
        denylist.add(Person);
        customerList.remove(Person);

    }

    public Contract createContract(Person person, Vehicle vehicle){
LocalDate startDate= LocalDate.now();
LocalDate endDate= startDate.plusMonths(6);
Contract contract=new Contract(person,vehicle, startDate, endDate, vehicle);
contracts.add(contract);
return contract;
    }





}
