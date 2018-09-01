package dev.paulpalac.ooptutorial.thissuper.thisMethod;

public class ThisMethod {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1, 2,3,4);
        Rectangle rect2 = new Rectangle(1, 2);
        Rectangle rect3 = new Rectangle();

    }
}
//BAD WAY TO USE CONSTRUCTOR
//BECAUSE OF REDUNDANCY
/*class Rectangle{
    private int x, y;
    private int width, height;

    public Rectangle(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        int area = width * height;
        System.out.println("Coordinates (" +x +", " +y +") have area of " +area);
    }
    public Rectangle(int width, int height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
        int area = width * height;
        System.out.println("Coordinates (" +x +", " +y +") have area of " +area);
    }
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        int area = width * height;
        System.out.println("Coordinates (" +x +", " +y +") have area of " +area);
    }
}*/
//INSTEAD USE THIS()
class Rectangle{

    private int x, y;
    private int width, height;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(int width, int height){
        this(0,0, width, height);
    }

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        int area = width * height;
        System.out.println("Coordinates (" +x +", " +y +") have area of " +area);
    }
}
