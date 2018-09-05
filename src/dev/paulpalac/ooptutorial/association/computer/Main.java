package dev.paulpalac.ooptutorial.association.computer;

public class Main {
    public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20, 5, 20);
    Case theCase = new Case("Aero 9000", "Aero Cool", "500W",
            dimensions);

    Resolution resolution = new Resolution(25, 20);
    Monitor theMonitor = new Monitor("Eagle eyes", "Philips",
            21, resolution);

    MotherBoard theMotherboard = new MotherBoard("B350", "GIGABYTE",
            4, 2, "V 2.14");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    thePC.powerUp();

    }
}
