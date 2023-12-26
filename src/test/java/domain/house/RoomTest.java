package domain.house;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Luisa
class RoomTest {
    Location location = new Location("Rua da Disney", "462 90", "920 46");
    House house = new House(location);
    RoomDimensions dimensions2 = new RoomDimensions(5, 5, 5);

    @Test
    void testRoomConstructor_InvalidName() {
        // Arrange
        String name = "";
        int floor = 1;
        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Room(name, floor, dimensions2, house));
        assertEquals("Please enter a valid name for the room.", exception.getMessage());
    }
    //Luisa
}