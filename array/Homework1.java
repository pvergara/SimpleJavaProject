package array;

public class Homework1 {
    public static void main(String[] args) {

        int[] arrayOfIntegers = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = i; j < arrayOfIntegers.length; j++) {

                if (arrayOfIntegers[i] > arrayOfIntegers[j]) {
                    int aux = arrayOfIntegers[i];
                    arrayOfIntegers[i] = arrayOfIntegers[j];
                    arrayOfIntegers[j] = aux;
                }
            }
        }

        for (int arrayOfInteger : arrayOfIntegers) {
            System.out.printf("Value : %d%n", arrayOfInteger);
        }
    }
}