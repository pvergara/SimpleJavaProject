import java.util.Scanner;

public class GetDataFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myInt = keyboard.nextInt();
        System.out.println("The number is: " + myInt);
    }
}
