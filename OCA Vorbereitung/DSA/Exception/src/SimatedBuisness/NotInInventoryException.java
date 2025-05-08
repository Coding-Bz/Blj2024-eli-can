package SimatedBuisness;

class NotInInventoryException extends Throwable {
    public NotInInventoryException (String message) {
        super(message);
    }
}