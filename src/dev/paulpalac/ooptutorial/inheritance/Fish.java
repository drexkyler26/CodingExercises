package dev.paulpalac.ooptutorial.inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
        System.out.println("Fish is resting.");
    }
    private void moveFin(){
        System.out.println("Fish used fins to swim. ");
    }
    private void moveTailFin(){
        System.out.println("Fish also used tails to swim. ");
    }

    public void swim(int speed){
        moveFin();
        moveTailFin();
        super.move(speed);
    }

}
