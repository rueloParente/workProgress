package domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    @Test
    void listRooms() {
        //Arrange
        House mickeyHouse = new House("Rua da Disney", "420-69", "69.420, 420.69");
        String roomName = "Mini Room";
        int floor = 1;
        double length = 5;
        double width = 5;
        double height = 5;
        Room room = new Room(roomName, floor, length, width, height);
        String roomName2 = "Pluto Room";
        int floor2 = 2;
        Room room2 = new Room(roomName2, floor2, length, width, height);
        //Act
        mickeyHouse.addRoom(room);
        mickeyHouse.addRoom(room2);
        //Assert
        assertEquals(room, mickeyHouse.listRooms().get(0));
        assertEquals(room2, mickeyHouse.listRooms().get(1));
    }

}