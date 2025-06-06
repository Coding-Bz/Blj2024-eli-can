public class Main {
    public static void main(String[] args) {
        EmailN email=new EmailN("Email");
        SMSN sms=new SMSN("SMS");
        PushN push=new PushN("Push");
        email.sendMessage();
        sms.sendMessage();
        push.sendMessage();


        System.out.println(email.getRecipient());
        System.out.println(push.getRecipient());
        System.out.println(sms.getRecipient());
    }
}