package domain.house;

import domain.device.Device;
import domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int floor;
    private double length;
    private double width;
    private double height;
    private List<Device> devices;
    private List<User> owners;

    public Room(String name, int floor, double length, double width, double height) {
        this.name = name;
        this.floor = floor;
        this.length = length;
        this.width = width;
        this.height = height;
        this.devices = new ArrayList<>();
        this.owners = new ArrayList<>();
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }
    public String getName() {
        return name;
    }

/*    public void addOwner(User user) {
        this.owners.add(user);
    }*/
}
