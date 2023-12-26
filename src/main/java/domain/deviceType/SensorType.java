package domain.deviceType;

public class SensorType {
    private String name;
    private String units;
    private boolean digital;
    private String description;
    public SensorType(String name, String units, boolean digital, String description) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the device type.");
        }
        this.name = name;
        if (units == null || units.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid unit for the device type.");
        }
        this.units = units;
        this.digital = digital;
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid description for the device type.");
        }
        this.description = description;
    }
    public String getName() {
        return name;
    }
}
