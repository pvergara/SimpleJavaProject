package array;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumber = new int[10];

        System.out.printf("First element of arrayNumber: %d%n", arrayOfNumber[0]);
        System.out.printf("Second element of arrayNumber: %d%n", arrayOfNumber[1]);

        arrayOfNumber[0] = 10;
        arrayOfNumber[1] = 100;


        for (int i=0; i < arrayOfNumber.length; i++) {
            System.out.printf("Element of arrayNumber: %d on the index: %d %n", arrayOfNumber[i], i);
        }
    }
}
