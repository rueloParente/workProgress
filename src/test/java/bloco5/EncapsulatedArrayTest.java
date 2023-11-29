package bloco5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulatedArrayTest {
//c) Adicione um novo elemento (valor) ao vetor encapsulado.
    //Test using returnNumberOfElements
    @Test
    void addValueIncreseArraySize() {
        //Arrange
        EncapsulatedArray array = new EncapsulatedArray();
        int expected = 1;
        //Act
        array.addValue(7);
        int actual = array.returnNumberOfElements();
        //Assert
        assertEquals(expected, actual);
    }
}