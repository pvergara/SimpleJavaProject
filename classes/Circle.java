package classes;

@SuppressWarnings("unused")
public class Circle {

    private final float radius;

    public Circle(float radius){
        this.radius = radius;
    }
    public float getArea(){
        return (float) (Math.pow(this.radius,2) * Math.PI);
    }
}
