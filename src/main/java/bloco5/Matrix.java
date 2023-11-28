package bloco5;

public class Matrix {
    private int[][] matrix;

    //a) Construtor público em que o array encapsulado fica vazio
    public Matrix () {
        this.matrix = new int[0][0];
    }
    //b) Construtor público que permita inicializar o array encapsulado com alguns valores.
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }
    //f) Retorne o maior elemento do array.
    public int returnsBiggestElement() {
        int biggestElement = 0;
        for (int[] ints : this.matrix) {
            for (int anInt : ints) {
                if (anInt > biggestElement) {
                    biggestElement = anInt;
                }
            }
        }
        return biggestElement;
    }
    //i ) Retorne um vetor em que cada posição corresponde à soma dos elementos da linha homóloga
    //do array encapsulado.
    public int[] returnsSumOfEachLine() {
        int[] sumOfEachLine = new int[this.matrix.length];
        for (int i = 0; i < this.matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < this.matrix[i].length; j++) {
                sum += this.matrix[i][j];
            }
            sumOfEachLine[i] = sum;
        }
        return sumOfEachLine;
    }

    //k) Retorne o índice da linha do array com maior soma dos respetivos elementos. Deve ser usado o
    //método da alínea i).
public int returnsIndexOfLineWithBiggestSum() {
        int[] sumOfEachLine = returnsSumOfEachLine();
        int biggestSum = 0;
        int indexOfBiggestSum = 0;
        for (int i = 0; i < sumOfEachLine.length; i++) {
            if (sumOfEachLine[i] > biggestSum) {
                biggestSum = sumOfEachLine[i];
                indexOfBiggestSum = i;
            }
        }
        return indexOfBiggestSum;
    }

    //p) Retorne um vetor com todos os elementos do array encapsulado cujo número de algarismos é
    //superior ao número médio de algarismos de todos os elementos do array.
    public int[] returnsElementsWithMoreDigitsThanAverage() {
        int[] elementsWithMoreDigitsThanAverage = new int[this.matrix.length * this.matrix[0].length];
        int average = 0;
        int count = 0;
        for (int[] ints : this.matrix) {
            for (int anInt : ints) {
                average += String.valueOf(anInt).length();
                count++;
            }
        }
        average /= count;
        int index = 0;
        for (int[] ints : this.matrix) {
            for (int anInt : ints) {
                if (String.valueOf(anInt).length() > average) {
                    elementsWithMoreDigitsThanAverage[index] = anInt;
                    index++;
                }
            }
        }
        return elementsWithMoreDigitsThanAverage;
    }
    //u) Rode 180º os valores do array encapsulado.
    public void rotate180Degrees() {
        int[][] rotatedMatrix = new int[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            int index = 0;
            for (int j = this.matrix[i].length - 1; j >= 0; j--) {
                rotatedMatrix[i][index] = this.matrix[i][j];
                index++;
            }
        }
        this.matrix = rotatedMatrix;
    }

}
