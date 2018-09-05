package dev.paulpalac.ooptutorial.inheritance.vehicle;

public class Vehicle {

    private int wheels;
    private String name;
    private String handSteering;
    private int changingGears;
    private int moving;

    public Vehicle(String name, String handSteering, int wheels, int changingGears, int moving) {
        this.wheels = wheels;
        this.name = name;
        this.handSteering = handSteering;
        this.changingGears = changingGears;
        this.moving = moving;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandSteering() {
        return handSteering;
    }

    public void setHandSteering(String handSteering) {
        this.handSteering = handSteering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public void setChangingGears(int changingGears) {
        this.changingGears = changingGears;
    }

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }
}
