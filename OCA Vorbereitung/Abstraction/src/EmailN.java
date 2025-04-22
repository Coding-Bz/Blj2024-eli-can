public class EmailN extends Notifier{

    public EmailN(String Recipient) {
        super(Recipient);
    }


    @Override
    public void sendMessage() {
        System.out.println("Sending email to user@example.com: Hello!");

    }
}
