package domain.device;

import domain.deviceType.SupportedTypes;

public class Sensor {
    private String name;
    private SupportedTypes type;
    private boolean state;
    private String description;

    public Sensor(String name, SupportedTypes type, boolean state, String description) {
        this.name = name;
        this.type = type;
        this.state = state;
        this.description = description;
    }
    protected SupportedTypes getType() {
        return this.type;
    }

}
