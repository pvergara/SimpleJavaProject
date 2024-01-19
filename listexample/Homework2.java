package listexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("howard","terry","neal","william","tolkien"));

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            names.set(i,name.substring(0,1).toUpperCase() + name.substring(1));
        }

        for (String name: names){
            System.out.printf("Name: %s%n", name);
        }
    }
}
