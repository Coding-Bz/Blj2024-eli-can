import java.util.ArrayList;
import java.util.List;

class House {
    private String model;
    private List<Room> rooms;

    public House(String model) {
        this.model = model;
        this.rooms = new ArrayList<>();
        System.out.println("Creating a house model \"" + model + "\".");
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
        System.out.println("Adding room: " + room.getName());
    }

    public String getModel() {
        return model;
    }

    public List<Room> getRooms() {
        return rooms;
    }}