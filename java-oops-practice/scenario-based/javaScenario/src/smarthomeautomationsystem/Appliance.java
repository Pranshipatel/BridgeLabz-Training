package smarthomeautomationsystem;

abstract class Appliance implements Controllable {
    private boolean powerStatus;
    private int powerConsumption; // in watts

    // Constructor (default or user-defined)
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.powerStatus = false;
    }

    // Getter (encapsulation)
    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isPowerOn() {
        return powerStatus;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }
}
