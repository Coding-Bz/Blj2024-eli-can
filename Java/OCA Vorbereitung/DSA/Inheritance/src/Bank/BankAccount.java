package Bank;

public class BankAccount {

    public BankAccount(){

    }
public void Deposit(double startStatus, double depositValue){
 double newStatus=startStatus+depositValue;
    System.out.println("You new balance is: "+ newStatus);

}

public  void WithDraw(double startStatus, double withdrawValue){

        double newStatus=startStatus-withdrawValue;
    System.out.println("Your new balance is: "+ newStatus);

}





}
