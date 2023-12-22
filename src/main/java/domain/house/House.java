package domain.house;
import domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private String zipCode;
    private String gpsLocation;
    private List<Room> rooms;
    private List<User> users;

    public House(String address, String zipCode, String gpsLocation) {
        this.address = address;
        this.zipCode = zipCode;
        this.gpsLocation = gpsLocation;
        this.rooms = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public List<Room> listRooms() {
        return this.rooms;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

}
