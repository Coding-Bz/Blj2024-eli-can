package SimatedBuisness;

public class Inventory {

    String ItemID;
    int quantity;


    public Inventory(String ItemID, int quantity){

        this.ItemID=ItemID;
        this.quantity=quantity;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
