package classes;

public class Main {
    public static void main(String[] args) {
        Triangle myFirstTriangle = new Triangle(10, 100, 10, 10);

        myFirstTriangle.showPosition();

        Triangle mySecondTriangle = new Triangle(0, 0, 10, 10);

        System.out.printf("The triangle area is: %f%n", mySecondTriangle.getArea());

        Circle aCircle = new Circle(2);
        System.out.printf("The circle area is: %f%n", aCircle.getArea());
    }
}
