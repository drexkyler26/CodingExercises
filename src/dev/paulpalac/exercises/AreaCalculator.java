package dev.paulpalac.exercises;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Area of circle is "+area(5));
        System.out.println("Area of rectangle is "+area(2, 5));
    }

    public static double area(double radius){
        final double PI = 3.14159;
        if (radius < 0){
            return -1;
        }else{
            double area = PI * (radius * radius);
            return area;
        }
    }
    public static double area(double x, double y){
        if((x < 0) || ( y < 0)){
            return -1;
        }else{
            double area = x * y;
            return area;
        }
    }
}
