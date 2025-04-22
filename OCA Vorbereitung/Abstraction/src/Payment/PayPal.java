package Payment;

public class PayPal extends  Payment{
    public PayPal(double amount) {
        super(amount);
    }

    @Override
    void Processing() {
        System.out.println("Processing PayPal payment of $50.0\n" +
                "Authenticating user...\n" +
                "Payment successful.");
    }
}
