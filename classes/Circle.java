package classes;

@SuppressWarnings("unused")
public class Circle extends CoordinatesShape implements Shape{

    private final float radius;

    public Circle(int x, int y,float radius){
        this.x = x;
        this.y = y;

        this.radius = radius;
    }
    public float getArea(){
        return (float) (Math.pow(this.radius,2) * Math.PI);
    }
}
