package array;

public class ArrayOfStringsMain {
    public static void main(String[] args) {
        String[] arrayOfStrings = new String[]{"Remember", "remember", "the", "fifth", "of", "november"};

        String guessTheString = "remember";

        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].toLowerCase().equals(guessTheString.toLowerCase())) {
                System.out.printf("Hey you found the String: %s on index: %d",guessTheString,i);
                break;
            }
        }

    }
}
