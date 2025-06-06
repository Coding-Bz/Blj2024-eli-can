package Payment;

public class BankTransfer extends  Payment{
    public BankTransfer(double amount) {
        super(amount);
    }

    @Override
    void Processing() {
        System.out.println("Processing bank transfer of $200.0\n" +
                "Initiating bank transfer...\n" +
                "Payment successful.");
    }
}
