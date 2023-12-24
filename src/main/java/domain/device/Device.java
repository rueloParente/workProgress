package domain.device;

import domain.deviceType.DeviceTypes;
import domain.deviceType.Type;
import domain.house.Room;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private String name;
    private Room location;
    private DeviceTypes deviceType;
    private Type type;
    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public Device(String name, Type type, DeviceTypes deviceType, Room location, List<Sensor> sensors, List<Actuator> actuators) throws IllegalArgumentException {
        if (deviceType.getDeviceTypes().contains(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("The type " + type.getName() + " is not supported.");
        }
        this.name = name;
        this.location = location;
        this.sensors = sensors;
        this.actuators = actuators;
    }

}
