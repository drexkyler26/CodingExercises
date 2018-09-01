package dev.paulpalac.ooptutorial.thissuper.superMethod;

public class SuperMethod {
    public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(1,2, 3, 4);
    Rectangle rect2 = new Rectangle(1,2);
    }
}
class Shape{
    private int x, y;
    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Rectangle extends Shape{
    private int width, height;

    Rectangle(int x, int y){
        this(x, y, 0, 0);
    }

    Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
        int area = width * height;
        System.out.println("Coordinates (" +x +", " +y +") have area of " +area);
    }
}