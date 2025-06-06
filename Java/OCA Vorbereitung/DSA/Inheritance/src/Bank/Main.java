package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
BankAccount BA=new BankAccount();
SavingsAccount SA=new SavingsAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("How much money dou want to have in your Account");
        double startStatus= sc.nextDouble();
        int userAnswer;
        do {
            System.out.println("Deposit=0; Withdraw=1;");
            userAnswer= sc.nextInt();
        }while (userAnswer !=1 && userAnswer !=0);

        if (userAnswer==1){
            System.out.println("How much do you want to withdraw? ");
            double withdrawValue= sc.nextDouble();
SA.WithDraw(startStatus,withdrawValue);
        }
        if (userAnswer==0){

System.out.println("How much do you wanna deposit? ");
double depositValue= sc.nextDouble();
BA.Deposit(startStatus,depositValue);
        }




    }
}
