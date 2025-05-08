public class SMSN extends  Notifier{
    public SMSN(String Recipient) {
        super(Recipient);
    }



    @Override
    public void sendMessage() {
        System.out.println("Sending SMS to +1234567890: Welcome!");

    }
}
