package domain.deviceType;

import java.util.List;

public class SensorTypes {
    //We will be storing the supported types in a list, we will keep a list for supported sensor types,
    // and another for supported actuator types, and we will be able to add new types to the list.
    private List<Type> types;

    public SensorTypes(Type type) throws IllegalArgumentException {
        // throws iligal argument if type already on list
        for (Type existingType : types) {
            if (existingType.getName().equals(type.getName())) {
                throw new IllegalArgumentException("The type " + type.getName() + " already exists.");
            }
        }
        types.add(type);
    }
    public List<Type> getSensorTypes() {
        return types;
    }
}
