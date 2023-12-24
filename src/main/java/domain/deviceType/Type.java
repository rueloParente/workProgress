package domain.deviceType;

public class Type {
    private String name;
    private String units;
    private boolean digital;
    private String description;
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
