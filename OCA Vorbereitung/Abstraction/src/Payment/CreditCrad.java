package Payment;

public class CreditCrad extends Payment {


    public CreditCrad(double amount) {
        super(amount);
    }

    @Override
    void Processing() {
        System.out.println("Processing credit card payment of"+
                "Validating card details...\n" +
                "Payment successful.");
    }
}
