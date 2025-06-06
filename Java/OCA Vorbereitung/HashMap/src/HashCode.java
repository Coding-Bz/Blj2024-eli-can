import java.util.ArrayList;
import java.util.HashMap;

public class HashCode<T> {

    private int key;
    private String value;
    private ArrayList<Declaration>myList;
    private ArrayList<String>allList;

    public HashCode(String value){
        this.value=value;
        this.key=key;
        this.myList = new ArrayList<>();
this.allList=new ArrayList<>();
    }



    public int createKey(String value){
        int myValue=0;
        for (int i=0; i<value.length();i++){
            int temp=value.charAt(i);
            myValue+=temp;
        }
        if (myValue==0){
            System.out.println("Value declined");
            return -1;
        }
        return myValue;

    }

public ArrayList<Declaration> add(String value){
        allList.add(value);
    System.out.println();
    System.out.println("---Adding a IP-adress started---");
      int key=  createKey(value);
        boolean check=true;
        for(int a=0; a<myList.size(); a++){
            if (myList.get(a).getKey()==key){
                System.out.println("This already exists!");
                return null;
            }
        }

 /*   if (myList.contains(dc)){
        System.out.println("This already exists!");
        return  null;
    }
*/
    Declaration dc=new Declaration(value,key);
        myList.add(dc);
    System.out.println("The adding process worked smoothly");
    System.out.println("You key is: "+key);
    this.myList=myList;
        return  myList;

}


public void print(){
    System.out.println();
    System.out.println("---Printing everything out---");
        for(int j=0; j <myList.size(); j++){
            System.out.println();
            System.out.println(myList.get(j).getValue());
        }
}

public void check(int key){

    System.out.println();
    System.out.println("---Value check for the value with the key: "+key+" started---");
    boolean check=true;
for (int b=0; b<myList.size(); b++){
    if (myList.get(b).getKey()==key){
        check=false;
        System.out.println("This value exists");
    }
}
    if (check==true){
        System.out.println("This data doesent exist in the list yet");
    }

    }

public void count(){
    System.out.println();
    System.out.println("Conting the number of unique values...");
    System.out.println("You have "+myList.size()+" unique values.");
    System.out.println("Conting the number of all values...");
    System.out.println("You have "+allList.size()+" values.");

}


}
