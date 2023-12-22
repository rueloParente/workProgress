package domain.house;

public class HouseManager {
    private House house;

    public HouseManager(House house) {
        this.house = house;
    }

    public void addRoomToHouse(Room room) throws IllegalArgumentException {
        for (Room existingRoom : house.listRooms()) {
            if (existingRoom.getName().equals(room.getName())) {
                throw new IllegalArgumentException("The room " + room.getName() + " already exists.");
            }
        }
        house.listRooms().add(room);
    }
}
