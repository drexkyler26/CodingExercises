package dev.paulpalac.ooptutorial.inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        ToyataAE86 newCar = new ToyataAE86(5, 0, "manual", "FR");
        newCar.setHorsePower(200);
        newCar.setModel("Trueno");
        newCar.setModelYear("1986");


        System.out.println(newCar.getHorsePower());
        System.out.println(newCar.getModel());
        System.out.println(newCar.getModelYear());
        System.out.println(newCar.getWheels());
        System.out.println(newCar.getMadeFrom());
        System.out.println(newCar.getEngineWheelDrive());

    }
}
