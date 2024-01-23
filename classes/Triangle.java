package classes;

public class Triangle extends CoordinatesShape implements Shape {
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private  int height;

    public Triangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea(){
        return (float) (this.width * this.height) / 2;
    }

    public void showPosition(){
        System.out.printf("x: %d,y: %d%n",this.x,this.y);
    }

}
