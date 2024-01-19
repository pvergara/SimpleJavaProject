package functions;

public class Main {
    public static void main(String[] args) {
        System.out.printf("add 1 to 5 is %d%n", add(5,10,100));
//        System.out.printf("add 10 to 5 is %d%n", add(5, 10));
//        System.out.printf("adding 5, 10, 100, 1000 is %d%n", add(5, 10, 100, 1000));
    }

    static int add(int number) {
        return add(number, 1,0, 0);
    }

    private static int add(int number1, int number2) {
        return add(number1, number2, 0, 0);
    }


    private static int add(int number1, int number2, int number3, int... number4) {
        int result = number1 + number2 + number3 ;
        for (int i = 0; i <number4.length; i++) {
            result += number4[i];
        }
        return result;
    }

}

