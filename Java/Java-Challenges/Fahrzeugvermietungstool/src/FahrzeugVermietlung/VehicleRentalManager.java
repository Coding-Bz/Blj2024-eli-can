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
public void createContract(Person person, Vehicle vehicle, String conditions, LocalDate startdate, LocalDate endDate)

throws MinorAgeException, DenylistedPersonException, LeaseLengthException {

        if (denylist.contains(person)){
            throw new DenylistedPersonException("You are in the denylist"); }

        if (person.getAge()<18){
            throw new MinorAgeException("Your a minor");
        }
Contract newContract=new Contract(person,vehicle,startdate,endDate,conditions);





}

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public ArrayList<Person> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Person> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Person> getDenylist() {
        return denylist;
    }

    public void setDenylist(ArrayList<Person> denylist) {
        this.denylist = denylist;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void checkLeap(){



}





}
