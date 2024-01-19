package array;

public class ArrayOfObjectsMain {
    public static void main(String[] args) {
        Object[] arrayOfObjects = new Object[3];

        arrayOfObjects[0] = 10;
        arrayOfObjects[1] = "Hello!";
        arrayOfObjects[2] = Math.PI;

        for (int i = 0; i < arrayOfObjects.length; i++) {
            System.out.printf("%d index is: %s%n", i, arrayOfObjects[i]);
        }
    }
}
