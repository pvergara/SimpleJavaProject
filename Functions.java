import java.util.Date;

public class Functions {

    public static void main(String[] args) {
        String x = sayHello();
        System.out.println("Fist: " + x);

        String y = "fgdgd";
        sayHelloFromReference(y);
        System.out.println("Second: " +y);

        Date date = new Date();
        System.out.println("Third (1): " +date);
        sayTheDate(date);
        System.out.println("Third (2): " +date);
    }

    private static void sayTheDate(Date date) {
        long theTime = date.getTime();
        date.setTime(theTime-360000);
    }

    private static void sayHelloFromReference(String y) {
        y.transform(String::toUpperCase);
    }

    private static String sayHello() {
        return "Hello world!";
    }
}
