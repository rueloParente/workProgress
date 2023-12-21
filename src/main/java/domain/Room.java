package domain;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int floor;
    private double length;
    private double width;
    private double height;
    private List<Device> devices;
    private List <User> rommOwners;

    public Room (String name, int floor, double length, double width, double height){
        this.name = name;
        this.floor = floor;
        this.length = length;
        this.width = width;
        this.height = height;
        this.devices = new ArrayList<>();
        this.rommOwners = new ArrayList<>();
    }
}
