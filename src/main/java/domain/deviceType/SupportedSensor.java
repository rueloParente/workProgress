package domain.deviceType;

import java.util.ArrayList;
import java.util.List;

public class SupportedSensor {
    //We will be storing the supported types in a list, we will keep a list for supported sensor types,
    // and another for supported actuator types, and we will be able to add new types to the list.
    private List<SensorType> types;

    public SupportedSensor() throws IllegalArgumentException {
        types = new ArrayList<>();
    }
    public void addType(SensorType type) {
        // throws iligal argument if type already on list
        if (types.contains(type)) {
            throw new IllegalArgumentException("The type " + type.getName() + " is already supported.");
        }
        types.add(type);
    }
    public List<SensorType> getSensorTypes() {
        return types;
    }
}
