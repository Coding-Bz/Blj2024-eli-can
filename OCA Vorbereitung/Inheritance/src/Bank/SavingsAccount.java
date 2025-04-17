package Bank;

public class SavingsAccount extends BankAccount{


public  SavingsAccount(){



}

    @Override
    public void WithDraw(double startStatus, double withdrawValue) {
        if (startStatus<100){
            System.out.println("Not possible your balance is too low");
            return;
        }
        super.WithDraw(startStatus, withdrawValue);

    }
}




