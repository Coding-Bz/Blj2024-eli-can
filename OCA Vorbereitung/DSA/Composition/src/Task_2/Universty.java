package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Universty {
    private String name;
    private List<Department>department;

    public Universty(String name){

        this.name=name;
        this.department=new ArrayList<>();
    }

    public void addDepartment(Department department){
        this.department.add(department);
        System.out.println("The added department: "+department.getName());

    }


    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public List<Department> getGetDepartment() {
        return department;
    }

    public void setGetDepartment(List<Department> Department) {
        this.department = Department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
