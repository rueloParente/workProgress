package domain.house;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Location location = new Location("Rua da Disney", "462 90", "920 46");
    House house = new House(location);
    RoomDimensions dimensions = new RoomDimensions(5, 5, 5);

    @Test
    void testRoomConstructor_ValidInput() {
        // Arrange
        String name = "Living Room";
        int floor = 1;;

        // Act
        Room room = new Room(name, floor, dimensions, house);


        // Assert
        assertNotNull(room);
        assertEquals(dimensions.getLength(), room.getDimensions().getLength());
        assertEquals(dimensions.getWidth(), room.getDimensions().getWidth());
        assertEquals(dimensions.getHeight(), room.getDimensions().getHeight());
    }

    @Test
    void testRoomConstructor_InvalidName() {
        // Arrange
        String name = "";
        int floor = 1;
        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Room(name, floor, dimensions, house));
        assertEquals("Please enter a valid name for the room.", exception.getMessage());
    }
}