package dev.paulpalac.ooptutorial.inheritance.vehicle;

public class ToyataAE86 extends Car{

    private String model;
    private String modelYear;
    private int horsePower;
    private String engine;

    public ToyataAE86(int changingeGears, int moving, String transmission, String engineWheelDrive) {
        super("Toyota AE86", "left hand", changingeGears, moving, transmission, "Japan",
                engineWheelDrive);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
