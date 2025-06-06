import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        System.out.println("What should you start balance be?");
        double startBalance=scanner.nextDouble();
        System.out.println("What is your name?");
        String name= scanner.next();

       Account account=new Account("23",startBalance,name);

        char userAnswer;
        int i=-1;
     do {
i++;
         if (i >= account.getTransactionHistory().length) {
             System.out.println("Transaction history is full.");
             account.displayHistory();
             return;
         }
        do {
            System.out.println("D=deposit, W=withdraw Q=Quit");
            userAnswer=sc.next().charAt(0);
            if (userAnswer=='Q'){
                account.displayHistory();
                return;
            }
        }while (userAnswer !='W'&&userAnswer!='D');

        ATM atm=new ATM(account.getAccountNumber(),account.getBalance(),account.getHolderName());
        atm.performTransaction(account,userAnswer,i);
        System.out.println("Your new balance: "+account.getBalance());

    }while (userAnswer!='Q');


}
}