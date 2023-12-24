package domain.device;


import domain.deviceType.SensorTypes;
import domain.deviceType.Type;

public class Sensor {
    private String name;
    private  Type type;
    private boolean state;
    private String description;
    private SensorTypes sensorTypes;

    public Sensor(String name, Type type, String description, SensorTypes sensorTypes) {
        if (sensorTypes.getSensorTypes().contains(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("The type " + type.getName() + " is not supported.");
        }
        this.name = name;
        this.description = description;
    }
}
