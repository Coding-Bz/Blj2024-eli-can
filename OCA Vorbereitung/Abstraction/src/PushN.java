public class PushN extends  Notifier{
    public PushN(String Recipient) {
        super(Recipient);
    }


    @Override
    public void sendMessage() {
        System.out.println("Sending push notification to device123: Update");

    }

}
