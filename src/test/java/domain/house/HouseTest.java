package domain.house;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    House house = new House(new Location("Rua do ISEP", "402-96", "96-402"));
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    RoomDimensions bigRoom = new RoomDimensions(5, 2, 0);
    Room room = new Room("Room", 0, smallRoom, house);
    Room room2 = new Room("Room2", 0, bigRoom, house);
    @Test
    void testHouse() {
        //Act
        House house = new House(new Location("Rua do ISEP", "402-96", "96-402"));
        //Assert
        assertNotNull(house);
    }
    @Test
    void addRoom() {
        //Act
        house.addRoom(room);
        //Assert
        assertTrue(house.listRooms().contains(room));
    }
    @Test
    void addRoomAlreadyExists() {
        //Act
        house.addRoom(room);
        //Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> house.addRoom(room));
        //Assert message
        assertEquals("Room already exists.", thrown.getMessage());
    }
    @Test
    void listRooms() {
        //Act
        house.addRoom(room);
        house.addRoom(room2);
        //Assert
        assertEquals(2, house.listRooms().size());
    }

}