public abstract  class Notifier {

   private String Recipient;
    public Notifier(String Recipient){
        this.Recipient=Recipient;
    }

    public abstract void sendMessage();


    public String getRecipient() {
        return Recipient;
    }
}
