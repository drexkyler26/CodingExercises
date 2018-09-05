package dev.paulpalac.ooptutorial.polymorphism.car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
    public void startEngine(){
        System.out.println("Car -> Engine is starting");

    }
    public void accelerate(){
        System.out.println("Car -> Accelerating");
    }
    public void brake(){
        System.out.println("Car -> Braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi -> Engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi -> Braking");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi -> Braking");
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+" -> Engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName()+" -> Braking");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+" -> Braking");
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Mitsubishi");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford(i");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}