package Payment;

abstract class Payment {

    private double amount;

    public Payment(double amount){
        this.amount=amount;
    }


abstract void Processing();


    public double getAmount() {
        return amount;
    }
}
