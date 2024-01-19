package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mapOfStrings = new HashMap<>();

        mapOfStrings.put("1","hello");
        mapOfStrings.put("key","Another value");

        System.out.printf("Given value %s",mapOfStrings.get("key"));
    }
}
