package Payment;

public class Main {
    public static void main(String[] args){

CreditCrad cc=new CreditCrad(200);
PayPal pp=new PayPal(300);
BankTransfer bt=new BankTransfer(200);

cc.Processing();
pp.Processing();
bt.Processing();



    }
}
