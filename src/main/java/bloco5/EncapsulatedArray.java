package bloco5;

public class EncapsulatedArray {
    private int[] array;

    //a) Construtor público em que o vetor encapsulado fica vazio (i.e. sem valores).
    public EncapsulatedArray() {
    }

    //b) Construtor público que permita inicializar o vetor encapsulado com alguns valores.
    public EncapsulatedArray(int[] array) {
        this.array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    //c) Adicione um novo elemento (valor) ao vetor encapsulado.
    public void addValue(int value) {
        int[] array = new int[this.array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.array[i];
        }
        array[this.array.length] = value;
        this.array = array;
    }
    //d) Retire o primeiro elemento do vetor encapsulado com um determinado valor.

    public void removeValue(int value) {
        int index = findsValue(value);
        if (index != -1) {
            int[] array = new int[this.array.length - 1];
            for (int i = 0; i < this.array.length; i++) {
                if (i >= index) {
                    array[i] = this.array[i + 1];
                } else array[i] = this.array[i];
            }
            this.array = array;
        }
      /*  else {

        }*/
    }

    private int findsValue(int value) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == value) return i;
        }
        return -1;
    }

    //e) Retorne o valor de um determinado elemento indicado pela sua posição.
    public int returnValueAtPosition(int index) {
        int value = this.array[index];
        return value;
    }

    //f) Retorne o número de elementos no vetor.
    public int returnNumberOfElements() {
        int result = this.array.length;
        return result;
    }

    //g) Retorne o maior elemento do vetor.
    public int returnBiggestElement() {
        int biggest = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] > biggest) biggest = this.array[i];
        }
        return biggest;
    }

    //h) Retorne o menor elemento do vetor.
    public int returnSmallestElement() {
        int smallest = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] < smallest) smallest = this.array[i];
        }
        return smallest;
    }

    //i) Retorne a média de todos os elementos.
    public int returnAverageElements() {
        int sum = 0;
        for (int i = 0; i < this.array.length; i++){
            sum += this.array[i];
        }
        return sum/this.array.length;
    }
    //j) Retorne a média de todos os números pares.
    public int returnAverageEvenElements(){
        int sumEven = 0;
        int evenElements = 0;
        for (int i=0; i<this.array.length; i++){
            if (this.array[i] % 2 == 0){
                sumEven += this.array[i];
                evenElements++;
            }
        }
        return sumEven/evenElements;
    }
    //k) Retorne a média de todos os números ímpares.
    public int returnAverageOddElements(){
        int sumOdd = 0;
        int oddElements = 0;
        for (int i=0; i<this.array.length; i++){
            if (this.array[i] % 2 != 0){
                sumOdd += this.array[i];
                oddElements++;
            }
        }
        return sumOdd/oddElements;
    }
    //l) Retorne a média de todos os múltiplos de um dado número.
    public int returnAverageMultipleElements(int num){
        int sumMultiples = 0;
        int multipleElements = 0;
        if (num == 0) num = 1;
        for (int i=0; i<this.array.length; i++){
            if (this.array[i] % num == 0){
                sumMultiples += this.array[i];
                multipleElements++;
            }
        }
        return sumMultiples/multipleElements;
    }
}
