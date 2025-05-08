package Task_2;

public class Main {
    public static void main(String[] args){

        Universty universty=new Universty("MIT");

        Department department=new Department("Computer Science","Dr. James");
        Department department1=new Department("Communication","Prof. Willhelm");


universty.addDepartment(department);
universty.addDepartment(department1);

for (Department d : universty.getDepartment()){
    System.out.println("The department's head: "+d.getHead()+" and the name"+d.getName());
}

        System.out.println();



    }



}
