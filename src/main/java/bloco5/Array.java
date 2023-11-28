package bloco5;

public class Array {
    //Desenvolva uma classe Array (ou Vetor, se preferir) que encapsule um vetor de inteiros (i.e. int vetor[])
    //através dos seguintes métodos:
    private int[] vector;
    String valueNotFound = "Value not found";
    String dividingByZero = "Dividing a number by 0 is not allowed in this universe";

    public int[] getVector() {
        return this.vector;
    }

    //a) Construtor público em que o vetor encapsulado fica vazio (i.e. sem valores).
    public Array() {
        this.vector = new int[0];
    }

    //b) Construtor público que permita inicializar o vetor encapsulado com alguns valores.
    public Array(int[] vector) {
        this.vector = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            this.vector[i] = vector[i];
        }
    }

    //c) Adicione um novo elemento (valor) ao vetor encapsulado.
    public void addValue(int value) {
        int[] newArray = new int[vector.length + 1];
        for (int i = 0; i < vector.length; i++) {
            newArray[i] = vector[i];
        }
        newArray[vector.length] = value;
        vector = newArray;
    }

    //d) Retire o primeiro elemento do vetor encapsulado com um determinado valor.
    public void removesValueFirstOccurrence(int value) {
        int[] newArray = new int[vector.length - 1];
        int indexPositionToRemove = returnsValuePositionOnIndex(value);

        if (indexPositionToRemove == -1) throw new IllegalArgumentException(valueNotFound);
        else {
            for (int i = 0, k = 0; i < vector.length; i++) {
                if (i != indexPositionToRemove) {
                    newArray[k] = vector[i];
                    k++;
                }
            }
        }
        vector = newArray;
    }

    private int returnsValuePositionOnIndex(int value) {
        int indexPosition = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == value) indexPosition = i;
        }
        return indexPosition;
    }

    //e) Retorne o valor de um determinado elemento indicado pela sua posição.
    public int getValue(int index) {
        if (index >= vector.length || index < 0) throw new IllegalArgumentException("Out of bounds");
        else {
            return vector[index];
        }
    }

    //f) Retorne o número de elementos no vetor.
    public int returnsLengthOfArray() {
        return vector.length;
    }

    //g) Retorne o maior elemento do vetor.
    public int returnsBiggestElement() {
        int biggest = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > biggest) biggest = vector[i];
        }
        return biggest;
    }

    //h) Retorne o menor elemento do vetor.
    public int returbsSmallestElement() {
        int smallest = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < smallest) smallest = vector[i];
        }
        return smallest;
    }

    //i) Retorne a média de todos os elementos.
    public int returnsAverageArray() {
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        int average = sum / vector.length;
        return average;
    }

    //j) Retorne a média de todos os números pares.
    public int returnsAverageEvenElements() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                sum += vector[i];
                counter++;
            }
        }
        if (counter == 0) {
            throw new ArithmeticException(dividingByZero);
        }
        return sum / counter;
    }

    //k) Retorne a média de todos os números ímpares.
    public int returnsAverageOddElements() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                sum += vector[i];
                counter++;
            }
        }
        if (counter == 0) {
            throw new ArithmeticException(dividingByZero);
        }
        return sum / counter;
    }

    //l) Retorne a média de todos os múltiplos de um dado número.
    public int returnsAverageMultiplesGivenNumber(int num) {
        if (num == 0) num = 1;
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % num == 0) {
                sum += vector[i];
                counter++;
            }
        }
        if (counter == 0) {
            throw new ArithmeticException(dividingByZero);
        }
        return sum / counter;
    }

    //m) Ordene os valores do vetor por ordem ascendente e/ou descendente.
    public void sortArrayAscending() {
        for (int i = 0, j = 1; j < vector.length; i++, j++) {
            if (vector[i] > vector[j]) {
                int temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
                i = -1;
                j = 0;
            }
        }
    }

    //n) Retorne True caso o vetor esteja vazio e False em caso contrário.
    public boolean checksIfArrayIsEmpty() {
        return vector.length == 0;
    }

    //o) Retorne True caso o vetor contenha apenas um elemento e False em caso contrário.
    public boolean checksIfArrayHasOnlyOneElement() {
        return vector.length == 1;
    }

    //p) Retorne True se o vetor tiver apenas elementos pares e False em caso contrário.
    public boolean checksIfArrayHasOnlyEvenElements() {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) return false;
        }
        return true;
    }

    //q) Retorne True se o vetor tiver apenas elementos ímpares e False em caso contrário.
    public boolean checksIfArrayHasOnlyOddElements() {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) return false;
        }
        return true;
    }

    //s) Retorne os elementos do vetor cujo número de algarismos é superior ao número médio de
    //algarismos de todos os elementos do vetor.
    public int[] returnsElementsWithMoreDigitsThanAverage() {
        int[] elementsWithMoreDigitsThanAverage = new int[0];
        int average = returnsAverageArray();
        average = (int) Math.log10(average) + 1;

        for (int i = 0; i < vector.length; i++) {
            if ((int) Math.log10(Math.abs(vector[i])) + 1 > average) {
                elementsWithMoreDigitsThanAverage = addValue(elementsWithMoreDigitsThanAverage, vector[i]);
            }
        }
        return elementsWithMoreDigitsThanAverage;
    }
    //r) Retorne True se o vetor tiver elementos duplicados e False em caso contrário.
    public boolean checksIfRepeatedElements () {
        for (int i=0; i < vector.length; i++){
            for (int j=i+1; j < vector.length; j++){
                if (vector[i] == vector[j]) return true;
            }
        }
        return false;
    }

    //t) Retorne os elementos do vetor cuja percentagem de algarismos pares é superior à média da
    //percentagem de algarismos pares de todos os elementos do vetor.


    //u) Retorne os elementos do vetor compostos exclusivamente por algarismos pares.
    public int[] returnsElementsWithOnlyEvenDigits () {
        int[] elementsWithOnlyEvenDigits = new int[0];
        for (int i=0; i < vector.length; i++){
            if (checksIfNumberHasOnlyEvenElements(vector[i])) {
                elementsWithOnlyEvenDigits = addValue(elementsWithOnlyEvenDigits, vector[i]);
            }
        }
        return elementsWithOnlyEvenDigits;
    }

    private boolean checksIfNumberHasOnlyEvenElements(int number){
        number = Math.abs(number);
        while (number > 0){
            if ((number % 10) % 2 != 0) return false;
            number /= 10;
        }
        return true;
    }
    //v) Retorne os elementos que são sequências crescentes (e.g. 347) do vetor.
    public int[] returnsCrescentSequenceNumbers () {
        int[] crescentSequenceNumbers = new int[0];
        for (int i=0; i < vector.length; i++){
            if (vector[i] > 9 && checksIfNumberIsCrescentSequence(vector[i])) {
                crescentSequenceNumbers = addValue(crescentSequenceNumbers, vector[i]);
            }
        }
        return crescentSequenceNumbers;
    }
    private boolean checksIfNumberIsCrescentSequence(int number){
        number = Math.abs(number);
        int digit1 = 0;
        int digit2 = 0;
        while (number > 0){
            digit1 = number % 10;
            number /= 10;
            digit2 = number % 10;
            if (digit1 <= digit2) return false;
        }
        return true;
    }

    //w) Retorne as capicuas existentes no vetor.
    public int[] returnsCapicuaNumbers () {
        int[] capicuaNumbers = new int[0];
        for (int i=0; i < vector.length; i++){
            if (Math.abs(vector[i]) < 10) continue;
            if (checksCapicua(vector[i])) {
               capicuaNumbers = addValue(capicuaNumbers, vector[i]);
            }
        }
        return capicuaNumbers;
    }
    private int[] addValue(int [] array, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = value;
        return newArray;
    }
    private boolean checksCapicua(int number){
        number = Math.abs(number);
        int temp = number;
        int inverted = 0;
        while (temp >0){
            inverted = inverted * 10 + (temp % 10);
            temp /= 10;
        }
        return inverted == number;
    }
    //x) Retorne os números existentes no vetor compostos exclusivamente por um mesmo algarismo
    //(e.g., 222).
    public int[] returnsElementsComposedByTheSameDigit() {
        int[] numbersWithOnlyOneDigit = new int[0];
        for (int i=0; i < vector.length; i++){
            if (Math.abs(vector[i]) > 9 && checksIfNumberHasOnlyOneDigit(vector[i])) {
                numbersWithOnlyOneDigit = addValue(numbersWithOnlyOneDigit, vector[i]);
            }
        }
        return numbersWithOnlyOneDigit;
    }
    private boolean checksIfNumberHasOnlyOneDigit(int number){
        number = Math.abs(number);
        int digit = number % 10;
        while (number > 0){
            if (number % 10 != digit) return false;
            number /= 10;
        }
        return true;
    }
    //y) Retorne os números existentes no vetor que não são de Amstrong.
    public int[] returnsNumbersThatAreNotAmstrong() {
        int[] numbersThatAreNotAmstrong = new int[0];
        for (int i=0; i < vector.length; i++){
            if (Math.abs(vector[i]) > 9 && !checksIfNumberIsAmstrong(vector[i])) {
                numbersThatAreNotAmstrong = addValue(numbersThatAreNotAmstrong, vector[i]);
            }
        }
        return numbersThatAreNotAmstrong;
    }
    private boolean checksIfNumberIsAmstrong(int number){
        number = Math.abs(number);
        int temp = number;
        int sum = 0;
        while (temp > 0){
            sum += Math.pow(temp % 10, 3);
            temp /= 10;
        }
        return sum == number;
    }
    //z) Retorne os elementos que contêm uma sequência crescente de pelo menos n algarismos (e.g., n=3,
    //347) do vetor.
    public int[] returnsElementsWithCrescentSequenceOfNElements(int n) {
        int[] elementsWithCrescentSequenceOfNElements = new int[0];
        for (int i=0; i < vector.length; i++){
            if (vector[i] > 9 && checksIfNumberHasCrescentSequenceOfNElements(vector[i], n)) {
                elementsWithCrescentSequenceOfNElements = addValue(elementsWithCrescentSequenceOfNElements, vector[i]);
            }
        }
        return elementsWithCrescentSequenceOfNElements;
    }
    private boolean checksIfNumberHasCrescentSequenceOfNElements(int number, int n){
        number = Math.abs(number);
        int digit1 = 0;
        int digit2 = 0;
        int counter = 0;
        while (number > 0){
            digit1 = number % 10;
            number /= 10;
            digit2 = number % 10;
            if (digit1 <= digit2) counter = 0;
            else counter++;
            if (counter > n-1) return true;
        }
        return false;
    }
    //aa) Retorne True ou False, consoante o vetor é igual a um vetor passado por parâmetro.
    public boolean checksIfArrayIsEqualToAnotherArray(int[] array) {
        if (vector.length != array.length) return false;
        for (int i=0; i < vector.length; i++){
            if (vector[i] != array[i]) return false;
        }
        return true;
    }

}