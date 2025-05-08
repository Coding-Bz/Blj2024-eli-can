public class Main {
    public static void main(String[] args) {

Developer developer=new Developer("Jackson","peters str. 17",20000,"Developer","Good","developing new features");
Manager manager=new Manager("Abigail","Wikicity 12",30000,"manager","Good","managing the team");
Programmer programmer=new Programmer("Mert","newcity 3A",40000,"Programmer","Excellence","programming a new feature");


        System.out.println(developer.Bonus());
        System.out.println(manager.Bonus());
        System.out.println(programmer.Bonus());
            System.out.println();
        System.out.println(developer.Performance());
        System.out.println(manager.Performance());
        System.out.println(programmer.Performance());
            System.out.println();
        System.out.println(developer.Task());
        System.out.println(manager.Task());
        System.out.println(programmer.Task());




    }
}