public class CompositionExample {
    public static void main(String[] args) {
        House myHouse = new House("Villa");
        Room livingRoom = new Room("Living Room");
        Room bedroom = new Room("Bedroom");
        Room kitchen = new Room("Kitchen");

        myHouse.addRoom(livingRoom);
        myHouse.addRoom(bedroom);
        myHouse.addRoom(kitchen);

// At this point, the 'myHouse' object holds references to the 'livingRoom',
// 'bedroom', and 'kitchen' objects. These Room objects were created and
// are managed within the context of the 'myHouse'.

// If we were to make the 'myHouse' object eligible for garbage collection,
// for example by setting it to null:
// myHouse = null;

        System.out.println("\n(Conceptual Explanation)");
        System.out.println("When the 'myHouse' object in the main method is no longer referenced (e.g., if 'myHouse = null;' was executed or the main method ends), the House object becomes eligible for garbage collection. Since the Room objects (\"Living Room\", \"Bedroom\", \"Kitchen\") were created within the House and are considered integral parts of it in this composition relationship, they would also become eligible for garbage collection along with the House. Their lifecycle is dependent on the House.");
    }
}
