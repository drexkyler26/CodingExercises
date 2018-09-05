package dev.paulpalac.ooptutorial.inheritance.vehicle;

public class Car extends Vehicle {
    private String transmission;
    private String madeFrom;
    private String engineWheelDrive;

    public Car(String name, String handSteering, int changingeGears, int moving, String transmission,
               String madeFrom, String engineWheelDrive) {
        super(name, handSteering, 4, changingeGears, moving);
        this.transmission = transmission;
        this.madeFrom = madeFrom;
        this.engineWheelDrive = engineWheelDrive;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public String getEngineWheelDrive() {
        return engineWheelDrive;
    }

    public void setEngineWheelDrive(String engineWheelDrive) {
        this.engineWheelDrive = engineWheelDrive;
    }
}
