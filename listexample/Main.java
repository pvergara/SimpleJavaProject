package listexample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList listOfObject = new ArrayList();
        listOfObject.add("Hey");
        listOfObject.add(true);
        listOfObject.add(10);
        listOfObject.add(Math.PI);

//        System.out.printf("First element of a list: %s", listOfObject.get(0));
//
//        for (int i = 0; i < listOfObject.size(); i++) {
//            System.out.printf("The element %d of a list is: %s%n", i, listOfObject.get(i));
//        }

        for (Object item: listOfObject){
            System.out.printf("Item value is: %s%n", item);
        }

    }
}
