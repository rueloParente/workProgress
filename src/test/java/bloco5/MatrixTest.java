package bloco5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    //b) Construtor público que permita inicializar o array encapsulado com alguns valores.
    @Test
    void shouldInitializeMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        //Assert
        assertArrayEquals(matrix, matrix1.getMatrix());

    }
    //with matrix irregular
    @Test
    void shouldInitializeMatrixWithIrregularMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        //Assert
        assertArrayEquals(matrix, matrix1.getMatrix());

    }
    //with empty matrix
    @Test
    void shouldInitializeMatrixWithEmptyMatrix() {
        //Arrange
        int[][] matrix = {};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        //Assert
        assertArrayEquals(matrix, matrix1.getMatrix());

    }
    //c) Adicione um novo elemento (valor) ao array encapsulado numa determinada linha, criando assim
    //uma nova coluna nessa linha.
    @Test
    void shouldAddElement() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expectedMatrix = {{1, 2, 3}, {4, 5, 6, 7}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        matrix1.addElement(1, 7);
        //Assert
        assertArrayEquals(expectedMatrix, matrix1.getMatrix());
    }
    //with matrix irregular
    @Test
    void shouldAddElementWithIrregularMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5}};
        int[][] expectedMatrix = {{1, 2, 3}, {4, 5, 7}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        matrix1.addElement(1, 7);
        //Assert
        assertArrayEquals(expectedMatrix, matrix1.getMatrix());
    }
    //d) Retire o primeiro elemento do array encapsulado com um determinado valor (percorrendo
    //primeiramente as linhas). A linha onde o elemento for retirado, ficará com menos uma coluna.
    @Test
    void shouldRemoveElement() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expectedMatrix = {{1, 2}, {4, 5, 6}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        matrix1.removeElement(3);
        //Assert
        assertArrayEquals(expectedMatrix, matrix1.getMatrix());
    }
    //with matrix irregular and repeted element
    @Test
    void shouldRemoveElementWithIrregularMatrixAndRepetedElement() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 3, 3}};
        int[][] expectedMatrix = {{1, 2}, {4, 5, 3, 3}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        matrix1.removeElement(3);
        //Assert
        assertArrayEquals(expectedMatrix, matrix1.getMatrix());
    }
    //e) Retorne True caso a matriz esteja vazia e False em caso contrário.
    @Test
    void shouldReturnTrueIfMatrixIsEmpty() {
        //Arrange
        int[][] matrix = {};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        //Assert
        assertTrue(matrix1.isEmpty());
    }
    //f) Retorne o maior elemento do array.
    @Test
    void shouldReturnBiggestElement() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        //Assert
        assertEquals(6, matrix1.returnsBiggestElement());
    }
    //with matrix irregular
    @Test
    void shouldReturnBiggestElementWithIrregularMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5}};
        //Act
        Matrix matrix1 = new Matrix(matrix);
        //Assert
        assertEquals(5, matrix1.returnsBiggestElement());
    }

}