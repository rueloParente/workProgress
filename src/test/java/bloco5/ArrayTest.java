package bloco5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    //    //e) Retorne o valor de um determinado elemento indicado pela sua posição.
    //with a valid position
    @Test
    void shouldReturnTheValueOfAnElementByItsPosition() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5});
        int position = 2;
        int expected = 3;
        //Act
        int result = array.getValue(position);
        //Assert
        assertEquals(expected, result);
    }
    //with an invalid position
    @Test
    void shouldReturnMinusOneIfThePositionIsInvalid() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5});
        int position = 5;
        // Act and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myArray.getValue(position);
        });

        // Additional assert to check the exception message
        String expectedMessage = "Out of bounds";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    //test with last position and different array size
    @Test
    void shouldReturnTheValueOfAnElementByItsPositionWithDifferentArraySize() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int position = 7;
        int expected = 8;
        //Act
        int result = array.getValue(position);
        //Assert
        assertEquals(expected, result);
    }
    //test with first position
    @Test
    void shouldReturnTheValueOfAnElementByItsPositionWithFirstPosition() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int position = 0;
        int expected = 1;
        //Act
        int result = array.getValue(position);
        //Assert
        assertEquals(expected, result);
    }
    //test with empty array
    @Test
    void shouldReturnMinusOneIfTheArrayIsEmpty() {
        //Arrange
        Array myArray = new Array();
        int position = 0;
        // Act and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myArray.getValue(position);
        });

        // Additional assert to check the exception message
        String expectedMessage = "Out of bounds";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    //f) Retorne o número de elementos no vetor.
    @Test
    void shouldReturnTheNumberOfElementsInTheArray() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int expected = 8;
        //Act
        int result = array.returnsLengthOfArray();
        //Assert
        assertEquals(expected, result);
    }
    //test with array that gets added a new element
    @Test
    void shouldReturnTheNumberOfElementsInTheArrayWithNewElement() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        array.addValue(9);
        int expected = 9;
        //Act
        int result = array.returnsLengthOfArray();
        //Assert
        assertEquals(expected, result);
    }
    //test with array that gets an element removed
    @Test
    void shouldReturnTheNumberOfElementsInTheArrayWithRemovedElement() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        array.removesValueFirstOccurrence(8);
        int expected = 7;
        //Act
        int result = array.returnsLengthOfArray();
        //Assert
        assertEquals(expected, result);
    }
    //g) Retorne o maior elemento do vetor.
    @Test
    void shouldReturnTheBiggestElementOfTheArray() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int expected = 8;
        //Act
        int result = array.returnsBiggestElement();
        //Assert
        assertEquals(expected, result);
    }
    //test with array that gets added a new element
    @Test
    void shouldReturnTheBiggestElementOfTheArrayWithNewElement() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        array.addValue(9);
        int expected = 9;
        //Act
        int result = array.returnsBiggestElement();
        //Assert
        assertEquals(expected, result);
    }
    //test with array that gets an element removed
    @Test
    void shouldReturnTheBiggestElementOfTheArrayWithRemovedElement() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        array.removesValueFirstOccurrence(8);
        int expected = 7;
        //Act
        int result = array.returnsBiggestElement();
        //Assert
        assertEquals(expected, result);
    }
    //h) Retorne o menor elemento do vetor.
    @Test
    void shouldReturnTheSmallestElementOfTheArray() {
        //Arrange
        Array array = new Array(new int[]{8, 7, 6, 5, 4, 3, 2, 1});
        int expected = 1;
        //Act
        int result = array.returbsSmallestElement();
        //Assert
        assertEquals(expected, result);
    }
    //test with array with negative numbers
    @Test
    void shouldReturnTheSmallestElementOfTheArrayWithNegativeNumbers() {
        //Arrange
        Array array = new Array(new int[]{-7, -6, -8, -5, -4, -3, -2, -1});
        int expected = -8;
        //Act
        int result = array.returbsSmallestElement();
        //Assert
        assertEquals(expected, result);
    }
    //test with array repeated smallest number
    @Test
    void shouldReturnTheSmallestElementOfTheArrayWithRepeatedSmallestNumber() {
        //Arrange
        Array array = new Array(new int[]{2, 3, 4, 1, 6, 7, 1});
        int expected = 1;
        //Act
        int result = array.returbsSmallestElement();
        //Assert
        assertEquals(expected, result);
    }
    //test smallest in first position
    @Test
    void shouldReturnTheSmallestElementOfTheArrayWithSmallestNumberInFirstPosition() {
        //Arrange
        Array array = new Array(new int[]{2, 3, 4, 5, 6, 7, 8});
        int expected = 2;
        //Act
        int result = array.returbsSmallestElement();
        //Assert
        assertEquals(expected, result);
    }
    //i) Retorne a média de todos os elementos.
    @Test
    void shouldReturnTheAverageOfAllElementsInTheArray() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int expected = 4;
        //Act
        int result = array.returnsAverageArray();
        //Assert
        assertEquals(expected, result);
    }
    //test with array with negative numbers
    @Test
    void shouldReturnTheAverageOfAllElementsInTheArrayWithNegativeNumbers() {
        //Arrange
        Array array = new Array(new int[]{-1, -2, -3, -4, -5, -6, -7, -8});
        int expected = -4;
        //Act
        int result = array.returnsAverageArray();
        //Assert
        assertEquals(expected, result);
    }
    //j) Retorne a média de todos os números pares
    //With even and off numbers
    @Test
    void shouldReturnTheAverageOfAllEvenElementsInTheArray() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int expected = 5;
        //Act
        int result = array.returnsAverageEvenElements();
        //Assert
        assertEquals(expected, result);
    }
    //With only even numbers
    @Test
    void shouldReturnTheAverageOfAllEvenElementsInTheArrayWithOnlyEvenNumbers() {
        //Arrange
        Array array = new Array(new int[]{2, 4, 6, 8});
        int expected = 5;
        //Act
        int result = array.returnsAverageEvenElements();
        //Assert
        assertEquals(expected, result);
    }
    //With only off numbers
    @Test
    void shouldReturnTheAverageOfAllEvenElementsInTheArrayWithOnlyOffNumbers() {
        //Arrange
        Array myArray = new Array(new int[]{1, 3, 5, 7});
        // Act and Assert
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            myArray.returnsAverageEvenElements();
        });

        // Additional assert to check the exception message
        String expectedMessage = "Dividing a number by 0 is not allowed in this universe";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    //k) Retorne a média de todos os números ímpares.
    //With even and off numbers
    @Test
    void shouldReturnTheAverageOfAllOddElementsInTheArray() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int expected = 4;
        //Act
        int result = array.returnsAverageOddElements();
        //Assert
        assertEquals(expected, result);
    }
    //With only even numbers
    @Test
    void shouldReturnTheAverageOfAllOddElementsInTheArrayWithOnlyEvenNumbers() {
        //Arrange
        Array myArray = new Array(new int[]{2, 4, 6, 8});
        // Act and Assert
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            myArray.returnsAverageOddElements();
        });

        // Additional assert to check the exception message
        String expectedMessage = "Dividing a number by 0 is not allowed in this universe";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    //With only off numbers
    @Test
    void shouldReturnTheAverageOfAllOddElementsInTheArrayWithOnlyOffNumbers() {
        //Arrange
        Array array = new Array(new int[]{1, 3, 5, 7});
        int expected = 4;
        //Act
        int result = array.returnsAverageOddElements();
        //Assert
        assertEquals(expected, result);
    }
    //l) Retorne a média de todos os múltiplos de um dado número.
    //Vector 1 to 10 with number 2
    @Test
    void shouldReturnTheAverageOfAllMultiplesOfAGivenNumberInTheArray() {
        //Arrange
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int number = 2;
        int expected = 5;
        //Act
        int result = array.returnsAverageMultiplesGivenNumber(number);
        //Assert
        assertEquals(expected, result);
    }
    //Vector 1 to 10 with number 11
    @Test
    void testAverageOfMultiplesGivenNumber_ThrowsException() {
        // Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int num = 11;

        // Act and Assert
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            myArray.returnsAverageMultiplesGivenNumber(num);
        });

        // Additional assert to check the exception message
        String expectedMessage = "Dividing a number by 0 is not allowed in this universe";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    //m) Ordene os valores do vetor por ordem ascendente e/ou descendente.
    //Ascending order
    @Test
    void shouldReturnTheArrayInAscendingOrder() {
        //Arrange
        Array myArray = new Array(new int[]{8, 7, 6, 5, 4, 3, 2, 1});
        myArray.sortArrayAscending();
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //Act
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
    //All emelemnts already in ascending order
    @Test
    void shouldReturnTheArrayInAscendingOrderWithAllElementsAlreadyInAscendingOrder() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        myArray.sortArrayAscending();
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //Act
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
    //With negative ekenebts
    @Test
    void shouldReturnTheArrayInAscendingOrderWithNegativeElements() {
        //Arrange
        Array myArray = new Array(new int[]{8, 7, 6, 5, 4, 3, 2, 1, -1, -2, -3, -4});
        myArray.sortArrayAscending();
        int[] expected = new int[]{-4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};
        //Act
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
    //r) Retorne True se o vetor tiver elementos duplicados e False em caso contrário.
    //With duplicated elements
    @Test
    void shouldReturnTrueIfTheArrayHasDuplicatedElements() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 7});
        boolean expected = true;
        //Act
        boolean result = myArray.checksIfRepeatedElements();
        //Assert
        assertEquals(expected, result);
    }
    //With no duplicated elements
    @Test
    void shouldReturnFalseIfTheArrayHasNoDuplicatedElements() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        boolean expected = false;
        //Act
        boolean result = myArray.checksIfRepeatedElements();
        //Assert
        assertEquals(expected, result);
    }

    //w) Retorne as capicuas existentes no vetor.
    //With capicua numbers
    @Test
    void shouldReturnTheCapicuaNumbersInTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 15, 22});
        int[] expected = new int[]{11, 22};
        //Act
        int[] result = myArray.returnsCapicuaNumbers();
        //Assert
        assertArrayEquals(expected, result);
    }
    //With no capicua numbers
    @Test
    void shouldReturnAnEmptyArrayIfTheArrayHasNoCapicuaNumbers() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int[] expected = new int[]{};
        //Act
        int[] result = myArray.returnsCapicuaNumbers();
        //Assert
        assertArrayEquals(expected, result);
    }
    //with negative numbers tha are capicua
    @Test
    void shouldReturnTheCapicuaNumbersInTheArrayWithNegativeNumbers() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 15, 22, -11, -22});
        int[] expected = new int[]{11, 22, -11, -22};
        //Act
        int[] result = myArray.returnsCapicuaNumbers();
        //Assert
        assertArrayEquals(expected, result);
    }
    //s) Retorne os elementos do vetor cujo número de algarismos é superior ao número médio de
    //algarismos de todos os elementos do vetor.
    //With elements with more digits than average
    @Test
    void shouldReturnTheElementsWithMoreDigitsThanAverageInTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 15, 22, -11, -22});
        int[] expected = new int[]{11, 15, 22, -11, -22};
        //Act
        int[] result = myArray.returnsElementsWithMoreDigitsThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }
    //u) Retorne os elementos do vetor compostos exclusivamente por algarismos pares.
    //With elements with only even digits
    @Test
    void shouldReturnTheElementsWithOnlyEvenDigitsInTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 15, 22, -21, -22});
        int[] expected = new int[]{2, 4, 6, 8, 22, -22};
        //Act
        int[] result = myArray.returnsElementsWithOnlyEvenDigits();
        //Assert
        assertArrayEquals(expected, result);
    }
    //With elements with only odd digits
    @Test
    void shouldReturnAnEmptyArrayIfTheArrayHasNoElementsWithOnlyEvenDigits() {
        //Arrange
        Array myArray = new Array(new int[]{1, 3, 5, 7, 11, 15, -21});
        int[] expected = new int[]{};
        //Act
        int[] result = myArray.returnsElementsWithOnlyEvenDigits();
        //Assert
        assertArrayEquals(expected, result);
    }
    //v) Retorne os elementos que são sequências crescentes (e.g. 347) do vetor.
    //With elements that are crescent sequences
    @Test
    void shouldReturnTheElementsThatAreCrescentSequencesInTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 3, 5, 7, 11, 15, 22, -21, -22, 258, 347});
        int[] expected = new int[]{15, 258, 347};
        //Act
        int[] result = myArray.returnsCrescentSequenceNumbers();
        //Assert
        assertArrayEquals(expected, result);
    }
    //With elements that are not crescent sequences
    @Test
    void shouldReturnAnEmptyArrayIfTheArrayHasNoElementsThatAreCrescentSequences() {
        //Arrange
        Array myArray = new Array(new int[]{1, 3, 5, 7, 11, 22, -21});
        int[] expected = new int[]{};
        //Act
        int[] result = myArray.returnsCrescentSequenceNumbers();
        //Assert
        assertArrayEquals(expected, result);
    }
    //x) Retorne os números existentes no vetor compostos exclusivamente por um mesmo algarismo
    //(e.g., 222).
    //With elements that are composed by the same digit
    @Test
    void shouldReturnTheElementsThatAreComposedByTheSameDigitInTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 3, 5, 7, 11, 22, -21, -22, 222, 333, 444, 555});
        int[] expected = new int[]{11, 22, -22, 222, 333, 444, 555};
        //Act
        int[] result = myArray.returnsElementsComposedByTheSameDigit();
        //Assert
        assertArrayEquals(expected, result);
    }
    //c) Adicione um novo elemento (valor) ao vetor encapsulado.
    // With a valid value
    @Test
    void shouldAddAValueToTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5});
        int value = 6;
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        //Act
        myArray.addValue(value);
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
    // With a negative value
    @Test
    void shouldAddANegativeValueToTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5});
        int value = -6;
        int[] expected = new int[]{1, 2, 3, 4, 5, -6};
        //Act
        myArray.addValue(value);
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
    // With a zero value
    @Test
    void shouldAddAZeroValueToTheArray() {
        //Arrange
        Array myArray = new Array(new int[]{1, 2, 3, 4, 5});
        int value = 0;
        int[] expected = new int[]{1, 2, 3, 4, 5, 0};
        //Act
        myArray.addValue(value);
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
    //with empty array
    @Test
    void shouldAddAValueToTheArrayWithEmptyArray() {
        //Arrange
        Array myArray = new Array();
        int value = 0;
        int[] expected = new int[]{0};
        //Act
        myArray.addValue(value);
        int[] result = myArray.getVector();
        //Assert
        assertArrayEquals(expected, result);
    }
}