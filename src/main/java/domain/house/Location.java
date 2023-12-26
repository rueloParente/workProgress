package domain.house;

public class Location {
    private String address;
    private String zipCode;
    private String gpsLocation;
    public Location(String address, String zipCode, String gpsLocation)throws IllegalArgumentException {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid address for the house.");
        }
        if (zipCode == null || zipCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid zip code for the house.");
        }
        if (gpsLocation == null || gpsLocation.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid GPS location for the house.");
        }

        this.address = address;
        this.zipCode = zipCode;
        this.gpsLocation = gpsLocation;
    }

    public void setAddress(String address) throws IllegalArgumentException {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid address for the house.");
        }
        this.address = address;
    }
    public void setZipCode(String zipCode) throws IllegalArgumentException {
        if (zipCode == null || zipCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid zip code for the house.");
        }
        this.zipCode = zipCode;
    }
    public void setGpsLocation(String gpsLocation) {
        if (gpsLocation == null || gpsLocation.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid GPS location for the house.");
        }
        this.gpsLocation = gpsLocation;
    }
}
