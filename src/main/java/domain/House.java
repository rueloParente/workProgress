package domain;
import java.util.ArrayList;
import java.util.List;

public class House {
    private String adress;
    private String zipCode;
    private String gpsLocation;
    private List<Room> roomList;
    private List <User> userList;
    public House (String adress, String zipCode, String gpsLocation){
        this.zipCode = zipCode;
        this.adress = adress;
        this.gpsLocation = gpsLocation;
        this.roomList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }
    //set adress
    public void setAdress (String adress){
        this.adress = adress;
    }
    //set zipCode
    public void setZipCode (String zipCode){
        this.zipCode = zipCode;
    }
    //set gpsLocation
    public void setGpsLocation (String gpsLocation){
        this.gpsLocation = gpsLocation;
    }
    // still due adding room with check to see if room present
    //get list of rooms
    public List<Room> getRoomList (){
        List <Room> roomList = List.copyOf(this.roomList);
        return roomList;
    }

    //protected
    protected String getAdress () {
        String adress = this.adress;
        return adress;
    }
    protected String getZipCode (){
        String zipCode = this.zipCode;
        return zipCode;
    }
    protected String getGpsLocation (){
        String gpsLocation = this.gpsLocation;
        return gpsLocation;
    }

}
