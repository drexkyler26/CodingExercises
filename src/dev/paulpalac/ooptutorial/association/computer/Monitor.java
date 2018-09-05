package dev.paulpalac.ooptutorial.association.computer;

public class Monitor {

    private String name;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String name, String manufacturer, int size, Resolution nativeResolution) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " +x +", " +y +" in color " +color);
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
