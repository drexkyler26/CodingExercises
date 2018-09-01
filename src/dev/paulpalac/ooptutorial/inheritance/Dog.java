package dev.paulpalac.ooptutorial.inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew() is called");
    }
    @Override
    public void eat(){
        chew();
        super.eat();
    }
    public void walk(int speed){
        System.out.println("Dog walks at " +speed +" m/s.");
}
    public void run(int speed){
        System.out.println("Dog runs at " +speed +" m/s.");
    }
    @Override
    public void move(int speed){
        moveLegs(speed);
    }

    private void moveLegs(int speed) {
        if(speed > 10){
            run(speed);
        }else{
            walk(speed);
        }
    }
}
