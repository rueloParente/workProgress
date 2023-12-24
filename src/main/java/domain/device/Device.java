package domain.device;

import domain.deviceType.DeviceTypes;
import domain.house.Room;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private String name;
    private Room location;
    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public Device(String name, Room location, List<Sensor> sensors, List<Actuator> actuators) {
        this.name = name;
        this.location = location;
        this.sensors = sensors;
        this.actuators = actuators;
    }

}
