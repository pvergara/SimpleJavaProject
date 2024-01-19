package array;

public class Homework1 {
    public static void main(String[] args) {

        Integer[] arrayOfIntegers = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        Float[] arrayOfFloats = new Float[]{9.0f, 8.0f, 7.0f, 6.0f, 5.0f, 4.0f, 3.0f, 2.0f, 1.0f};

        boolean normalOrder = true;
        shortAnArray(arrayOfIntegers, normalOrder);


        for (int arrayOfInteger : arrayOfIntegers) {
            System.out.printf("Value : %d%n", arrayOfInteger);
        }
    }

    private static <ParameterType extends Comparable<ParameterType>> void shortAnArray(ParameterType[] arrayOfIntegers, boolean normalOrder) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = i; j < arrayOfIntegers.length; j++) {
                if (normalOrder && arrayOfIntegers[i].compareTo(arrayOfIntegers[j])>=0) {
                    interchange(arrayOfIntegers, i, j);
                }
                if (!normalOrder && arrayOfIntegers[i].compareTo(arrayOfIntegers[j])<0) {
                    interchange(arrayOfIntegers, i, j);
                }
            }
        }
    }

    private static void shortAnArray(int[] arrayOfIntegers) {
        shortAnArray(arrayOfIntegers, true);
    }

    private static void shortAnArray(int[] arrayOfIntegers, boolean normalOrder) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = i; j < arrayOfIntegers.length; j++) {

                if (normalOrder && arrayOfIntegers[i] > arrayOfIntegers[j]) {
                    interchange(arrayOfIntegers, i, j);
                }
                if (!normalOrder && arrayOfIntegers[i] < arrayOfIntegers[j]) {
                    interchange(arrayOfIntegers, i, j);
                }
            }
        }
    }

    static void interchange(int[] arrayOfIntegers, int i, int j) {
        int aux = arrayOfIntegers[i];
        arrayOfIntegers[i] = arrayOfIntegers[j];
        arrayOfIntegers[j] = aux;
    }

    private static void shortAnArray(byte[] arrayOfIntegers, boolean normalOrder) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = i; j < arrayOfIntegers.length; j++) {

                if (normalOrder && arrayOfIntegers[i] > arrayOfIntegers[j]) {
                    interchange(arrayOfIntegers, i, j);
                }
                if (!normalOrder && arrayOfIntegers[i] < arrayOfIntegers[j]) {
                    interchange(arrayOfIntegers, i, j);
                }
            }
        }
    }

    static void interchange(byte[] arrayOfIntegers, int i, int j) {
        byte aux = arrayOfIntegers[i];
        arrayOfIntegers[i] = arrayOfIntegers[j];
        arrayOfIntegers[j] = aux;
    }

    private static <T> void interchange(T[] arrayOfType, int i, int j) {
        T aux = arrayOfType[i];
        arrayOfType[i] = arrayOfType[j];
        arrayOfType[j] = aux;
    }
}