package listexample;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        addAllTheValues(listOfStrings);

        for (String item: listOfStrings){
            System.out.printf("Item value is: %s%n", item);
        }

    }

    private static void addAllTheValues(List<String> listOfStrings) {
        listOfStrings.add("10");
        listOfStrings.add("Hello");
        listOfStrings.add("Terry");
        listOfStrings.add("Pratchett");
    }
}
