package domain.house;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @BeforeAll
    Location location = new Location("Rua da Disney", "462 90", "920 46");
    House house = new House(location);

    @Test
    void testRoomConstructor_ValidInput() {
        // Arrange
        String name = "Living Room";
        int floor = 1;
        RoomDimensions dimensions = new RoomDimensions(5, 5, 5);

        // Act
        Room room = new Room(name, floor, dimensions, house);

        // Assert
        assertNotNull(room);

    }
}