package Printing;

public class Employee implements PrintDetails{

    private String name;
    private int salary;


    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }



    @Override
    public String printDetails() {
        return  "Employee details: \n"+
                "And the name is: "+name+" and the salary is: "+salary;
    }
}
