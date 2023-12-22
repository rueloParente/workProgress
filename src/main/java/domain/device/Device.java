package domain.device;

import domain.deviceType.SupportedTypes;
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

    public List<SupportedTypes> getType() {
        List<SupportedTypes> list = new ArrayList<>();
     for (Sensor sensor : sensors) {
         if (sensor.getType() != null) {
             list.add(sensor.getType());
         }
     }
        for (Actuator actuator : actuators) {
            if (actuator.getType() != null) {
                list.add(actuator.getType());
            }
        }
        return list;
    }
}
