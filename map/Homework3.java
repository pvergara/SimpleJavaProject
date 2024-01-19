package map;

import java.util.HashMap;
import java.util.Map;

public class Homework3 {
    public static void main(String[] args) {
        Map<Integer, String> mapOfStrings = new HashMap<>();
        mapOfStrings.put(100, "first");
        mapOfStrings.put(101, "second");
        mapOfStrings.put(102, "third");
        mapOfStrings.put(104, "fourth");
        mapOfStrings.put(105, "fifth");
        mapOfStrings.put(106, "sixth");
        mapOfStrings.put(107, "seventh");
        mapOfStrings.put(108, "eighth");
        mapOfStrings.put(109, "ninth");
        mapOfStrings.put(110, "tenth");

//        for (String item : mapOfStrings.values()){
//            System.out.printf("Value: %s%n", item);
//        }
//
        for (Map.Entry<Integer,String> entrySet : mapOfStrings.entrySet()){
            System.out.printf("Key: %s%n", entrySet.getKey());
            System.out.printf("Value: %s%n", entrySet.getValue());
            System.out.println();
        }
    }
}
