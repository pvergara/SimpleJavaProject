package functions;

public class ByValueFunction {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        add(a,b);

        System.out.println("Value of a:" + a);
    }

    private static void add(int a, int b) {
        a = a + b;
        System.out.println("Value of INNNNNNEERRR a:" + a);
    }
}
