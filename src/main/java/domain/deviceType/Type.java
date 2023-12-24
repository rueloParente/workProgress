package domain.deviceType;

public class Type {
    private String name;
    private String units;
    private boolean digital;
    private String description;
    //add a list of domain (if this type aplies to a sensor, actuator or both) device type can be infered from sensores and actuators that compose it.
    public Type(String name, String units, boolean digital, String description) {
        this.name = name;
        this.units = units;
        this.digital = digital;
        this.description = description;
    }
    public String getName() {
        return name;
    }
}
