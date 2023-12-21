package domain;

import java.util.List;

public class SupportedTypes {
    private List<NewType> types;

    public SupportedTypes(NewType type) {
        this.types.add(type);
    }
}
