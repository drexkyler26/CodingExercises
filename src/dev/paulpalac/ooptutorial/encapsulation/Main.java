package dev.paulpalac.ooptutorial.encapsulation;

public class Main {
    public static void main(String[] args) {

    Printer printer = new Printer(55, false);
    printer.fillUpToner(5);
    printer.fillUpToner(55);
    printer.fillUpToner(-5);
    printer.printPage(5);
    printer.printPage(25);
    printer.fillUpToner(55);
    printer.fillUpToner(-55);
    System.out.println(printer.getTonerLevel());
    System.out.println(printer.isDuplex());
    }
}
