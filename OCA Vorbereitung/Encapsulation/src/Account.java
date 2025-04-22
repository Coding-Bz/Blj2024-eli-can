import java.util.Scanner;

public class Account {
    private String accountNumber;
    private  double balance;
    private String holderName;
    private String [] transactionHistory;

    public  Account(String accountNumber, double balance, String holderName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.holderName=holderName;
        this.transactionHistory = new String[100];
    }
Scanner sc=new Scanner(System.in);

    public double deposit(int i){
        System.out.println("How much? ");
        double amount=sc.nextDouble();
        transactionHistory[i]="current amount:"+balance+"deposit: "+amount;
        this.balance=balance+amount;
        return  balance;
    }
    public double withdraw(int i){
        System.out.println("How much? ");
        double amount=sc.nextDouble();
        transactionHistory[i]="current amount:"+balance+"withdraw: "+amount;
        this.balance=balance-amount;
        return  balance;

    }
public void displayHistory(){
    System.out.println("Your account history: ");
    for (String transaction : transactionHistory) {
        if (transaction != null) {
            System.out.println(transaction);
        }}
}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String[] getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(String[] transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}
