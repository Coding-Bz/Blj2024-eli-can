public class Employees {

    private String name;
    private String address;
    private double salary;
    private String job_title;
    private String performane;
    private String task;


    public Employees(String name, String adress, double salary, String job_title,String performane,String task){
        this.name=name;
        this.address=adress;
        this.salary=salary;
        this.job_title=job_title;
        this.performane=performane;
        this.task=task;

    }

    public String Bonus(){
        int newSalary=(int) (salary*1.1);
        return job_title+" : Bonus "+newSalary;
    }

    public  String Performance(){
        return "Performance report for: "+name +" : "+performane;
    }
    public String Task(){
        return job_title+" "+name+" "+task;
    }



}
