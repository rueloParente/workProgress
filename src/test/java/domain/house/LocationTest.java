package domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    @Test
    void succesfulLocation (){
        //Arrange
        String adress = "Rua do ISEP";
        String zipCOde = "402-96";
        String gpsLocation = "960-42";
        //Act
        Location location = new Location(adress, zipCOde, gpsLocation);
        //Assert
        assertNotNull(location);
    }
    @Test
    void emptyAdressShouldGenerateThrow(){
        String adress = "";
        String zipCOde = "402-96";
        String gpsLocation = "960-42";
        //Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new Location(adress, zipCOde, gpsLocation));
        //Expected message
        assertEquals("Please enter a valid address for the house.", thrown.getMessage());
    }
    @Test
    void emptyZipCodeShouldGenerateThrow(){
        String adress = "Rua do ISEP";
        String zipCOde = "";
        String gpsLocation = "960-42";
        //Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new Location(adress, zipCOde, gpsLocation));
        //Expected message
        assertEquals("Please enter a valid zip code for the house.", thrown.getMessage());
    }
    @Test
    void emptyGpsLocationShouldGenerateThrow(){
        String adress = "Rua do ISEP";
        String zipCOde = "402-96";
        String gpsLocation = "";
        //Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new Location(adress, zipCOde, gpsLocation));
        //Expected message
        assertEquals("Please enter a valid GPS location for the house.", thrown.getMessage());
    }
    @Test
    void nullAdressShouldGenerateThrow(){
        String adress = null;
        String zipCOde = "402-96";
        String gpsLocation = "960-42";
        //Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new Location(adress, zipCOde, gpsLocation));
        //Expected message
        assertEquals("Please enter a valid address for the house.", thrown.getMessage());
    }

}