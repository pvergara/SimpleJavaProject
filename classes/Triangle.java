package classes;

public class Triangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Triangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public float getArea(){
        return (float) (this.width * this.height) / 2;
    }

    public void showPosition(){
        System.out.printf("x: %d,y: %d%n",this.x,this.y);
    }
}
