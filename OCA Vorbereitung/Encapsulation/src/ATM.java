import java.util.Scanner;

public class ATM extends Account{
Scanner sc=new Scanner(System.in);

    public ATM(String accountNumber, double balance, String holderName) {
        super(accountNumber, balance, holderName);
    }
    public void performTransaction(Account account,char operation,int i){

        if (operation=='D'){
            account.deposit(i);
        }
        if (operation=='W'){
            account.withdraw(i);
        }
    }

}
