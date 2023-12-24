package domain.house;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomDimensionsTest {
    @Test
    void testConstructor_validInput() {
        // Arrange
        double width = 2;
        double length = 4;
        double height = 6;

        // Act
        RoomDimensions roomDimensions = new RoomDimensions(width, length, height);

        // Assert
        assertNotNull(roomDimensions);
        assertEquals(roomDimensions.getWidth(), width);
        assertEquals(roomDimensions.getLength(), length);
        assertEquals(roomDimensions.getHeight(), height);
    }

    @Test
    void testConstructor_invalidWidth() {
        // Arrange
        double width = -5;
        double length = 5;
        double height = 5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new RoomDimensions(width, length, height));
    }

    @Test
    void testConstructor_invalidZeroWidth() {
        // Arrange
        double width = 0;
        double length = 5;
        double height = 5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new RoomDimensions(width, length, height));
    }

    @Test
    void testConstructor_invalidLength() {
        // Arrange
        double width = 5;
        double length = -5;
        double height = 5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new RoomDimensions(width, length, height));
    }
    @Test
    void testConstructor_invalidZeroLength() {
        // Arrange
        double width = 5;
        double length = 0;
        double height = 5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new RoomDimensions(width, length, height));
    }

    @Test
    void testConstructor_invalidHeight() {
        // Arrange
        double width = 5;
        double length = 5;
        double height = -5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new RoomDimensions(width, length, height));
    }
    @Test
    void testConstructor_validZeroHeight() {
        // Arrange
        double width = 5;
        double length = 5;
        double height = 0;

        // Act
        RoomDimensions roomDimensions = new RoomDimensions(width, length, height);
        // Assert
        assertNotNull(roomDimensions);
        assertEquals(roomDimensions.getWidth(), width);
        assertEquals(roomDimensions.getLength(), length);
        assertEquals(roomDimensions.getHeight(), height);
    }

    @Test
    void testSetHeight_negativeImputShouldThrowExeption() {
        // Arrange
        RoomDimensions roomDimensions = new RoomDimensions(5, 5, 5);
        double height = -5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> roomDimensions.setHeight(height));
    }
    @Test
    void testSetHeight_zeroShouldUpdateValue() {
        // Arrange
        double height = 0;
        RoomDimensions roomDimensions = new RoomDimensions(3, 4, 5);
        // Act
        roomDimensions.setHeight(height);
        // Assert
        assertEquals(3, roomDimensions.getWidth());
        assertEquals(4, roomDimensions.getLength());
        assertEquals(roomDimensions.getHeight(), height);
    }

    @Test
    void testSetLength_validInput() {
        // Arrange
        double length = 4;

        RoomDimensions roomDimensions = new RoomDimensions(4, 5, 5);

        // Act
        roomDimensions.setLength(length);

        // Assert
        assertEquals(roomDimensions.getLength(), length);
        assertEquals(roomDimensions.getWidth(), 4);
        assertEquals(roomDimensions.getHeight(), 5);
    }

    @Test
    void testSetLength_negativeImputShouldThrowExeption() {
        // Arrange
        RoomDimensions roomDimensions = new RoomDimensions(5, 5, 5);
        double length = -5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> roomDimensions.setLength(length));
    }
    @Test
    void testSetLength_zeroImputShouldThrowExeption() {
        // Arrange
        double length = 0;
        RoomDimensions roomDimensions = new RoomDimensions(3, 4, 5);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> roomDimensions.setLength(length));
    }
    @Test
    void testSetWidth_validInput() {
        // Arrange
        double width = 6;

        RoomDimensions roomDimensions = new RoomDimensions(4, 5, 5);

        // Act
        roomDimensions.setWidth(width);

        // Assert
        assertEquals(roomDimensions.getWidth(), width);
        assertEquals(roomDimensions.getLength(), 5);
        assertEquals(roomDimensions.getHeight(), 5);
    }

    @Test
    void testSetWidth_negativeImputShouldThrowExeption() {
        // Arrange
        RoomDimensions roomDimensions = new RoomDimensions(5, 5, 5);
        double width = -5;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> roomDimensions.setWidth(width));
    }
    @Test
    void testSetWidth_zeroImputShouldThrowExeption() {
        // Arrange
        double width = 0;
        RoomDimensions roomDimensions = new RoomDimensions(3, 4, 5);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> roomDimensions.setWidth(width));
    }
}