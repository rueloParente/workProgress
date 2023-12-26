package domain.deviceType;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeTest {
    @Test
    void testTypeConstructor_ValidInput() {
        // Arrange
        String name = "Lamp";
        String units = "Watts";
        boolean digital = true;
        String description = "A lamp that can be turned on and off.";

        // Act
        SensorType type = new SensorType(name, units, digital, description);

        // Assert
        assertNotNull(type);
        assertEquals(name, type.getName());
    }
    @Test
    void testTypeConstructor_InvalidName() {
        // Arrange
        String name = "";
        String units = "Watts";
        boolean digital = true;
        String description = "A lamp that can be turned on and off.";

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new SensorType(name, units, digital, description));
        assertEquals("Please enter a valid name for the device type.", exception.getMessage());
    }
    @Test
    void testTypeConstructor_InvalidUnits() {
        // Arrange
        String name = "Lamp";
        String units = "";
        boolean digital = true;
        String description = "A lamp that can be turned on and off.";

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new SensorType(name, units, digital, description));
        assertEquals("Please enter a valid unit for the device type.", exception.getMessage());
    }
    @Test
    void testTypeConstructor_InvalidDescription() {
        // Arrange
        String name = "Lamp";
        String units = "Watts";
        boolean digital = true;
        String description = "";

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new SensorType(name, units, digital, description));
        assertEquals("Please enter a valid description for the device type.", exception.getMessage());
    }
}