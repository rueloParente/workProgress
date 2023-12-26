package domain.device;

import domain.deviceType.SupportedSensor;
import domain.deviceType.SensorType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SensorTest {
@Test
void testConstructor() {
    // Arrange
    SensorType thermostat = new SensorType("Thermostat", "description", true, "Mesure temperature in celsius");
    SensorType cooler = new SensorType("Cooler", "description", false, "Cooles Bernardo groin");
    SensorType heater = new SensorType("Heater", "description", false, "sabjkfsak");
    SupportedSensor supportedSensor = new SupportedSensor();
    supportedSensor.addType(thermostat);
    supportedSensor.addType(cooler);
    supportedSensor.addType(heater);

    // Act
    Sensor sensor = new Sensor("Thermostat", heater, "description",supportedSensor);

    // Assert
    assertNotNull(sensor);

}
}