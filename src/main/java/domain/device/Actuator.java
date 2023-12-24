package domain.device;

import domain.deviceType.ActuatorTypes;
import domain.deviceType.DeviceTypes;
import domain.deviceType.Type;

public class Actuator {
    private String name;
    private ActuatorTypes actuatorTypes;
    private Type type;
    private boolean state;
    private String description;

    public Actuator(String name, Type type, ActuatorTypes actuatorTypes, boolean state, String description)throws IllegalArgumentException {
        if (actuatorTypes.getActuatorTypes().contains(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("The type " + type.getName() + " is not supported.");
        }
        this.name = name;
        this.type = type;
        this.state = state;
        this.description = description;
    }
}
