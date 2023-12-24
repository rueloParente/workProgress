package domain.house;

import domain.device.Device;
import domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int floor;
    private RoomDimensions dimensions;
    private List<Device> devices;
    private List<User> owners;
    private House house;

    public Room(String name, int floor, RoomDimensions dimensions, House house) throws IllegalArgumentException {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Please enter a valid name for the room.");
            }
        this.name = name;
        //Floor can be negative for basements
        this.floor = floor;
        //Constructor for dimensions alredy checks if dimensions are valid
        this.dimensions = dimensions;
        //Validation of house is done in the house class
        this.house = house;
        this.devices = new ArrayList<>();
        this.owners = new ArrayList<>();
    }
}
