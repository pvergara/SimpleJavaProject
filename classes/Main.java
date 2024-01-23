package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(-10, 50, 200, 10);
        List<Shape> shapes = new ArrayList<>(Arrays.asList(
                new Circle(10,100,1),
                new Circle(-10,50,2),
                triangle
        ));

        for(Shape shape:shapes){
            System.out.printf("The area of the shape is: %f%n",shape.getArea());
        }

    }

}
