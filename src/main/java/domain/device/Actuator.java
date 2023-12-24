package domain.device;

import domain.deviceType.DeviceTypes;

public class Actuator {
    private String name;
    private DeviceTypes type;
    private boolean state;
    private String description;

    public Actuator(String name, DeviceTypes type, boolean state, String description) {
        this.name = name;
        this.type = type;
        this.state = state;
        this.description = description;
    }
    protected DeviceTypes getType() {
        return this.type;
    }
}
