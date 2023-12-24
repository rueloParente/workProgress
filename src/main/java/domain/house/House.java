package domain.house;
import domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class House {
    private Location location;
    private List<Room> rooms;
    private List<User> users;
    public House(Location location) {
        this.location = location;
        this.rooms = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    public void addRoom(Room room) throws IllegalArgumentException {
        if (this.rooms.contains(room)) {
            throw new IllegalArgumentException("Room already exists.");
        }
        else this.rooms.add(room);
    }
    public List<Room> listRooms() {
        return List.copyOf(this.rooms);
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}
