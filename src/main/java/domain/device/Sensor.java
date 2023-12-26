package domain.device;


import domain.deviceType.SupportedSensor;
import domain.deviceType.SensorType;

public class Sensor {
    private String name;
    private SensorType type;
    private boolean state;
    private String description;
    private SupportedSensor supportedSensor;

    public Sensor(String name, SensorType sensorType, String description, SupportedSensor supportedSensor) {
        if (supportedSensor.getSensorTypes().contains(sensorType)) {
            this.type = sensorType;
        } else {
            throw new IllegalArgumentException("The type " + sensorType.getName() + " is not supported.");
        }
        this.name = name;
        this.description = description;
    }
}
