package Printing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Book book=new Book("The human being","Leo Tolstoi");
        Car car=new Car("Yellow","Mercedes A2");
        Employee employee=new Employee("Mike",20000);

        ArrayList<PrintDetails> myObjects = new ArrayList<>();

        myObjects.add(book);
        myObjects.add(car);
        myObjects.add(employee);

        for (int i=0; i<myObjects.size(); i++){
            System.out.println(myObjects.get(i).printDetails());
        }





    }


}
