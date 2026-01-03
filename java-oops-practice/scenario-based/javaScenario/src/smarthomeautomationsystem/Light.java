package smarthomeautomationsystem;

class Light extends Appliance {

    public Light() {
        super(40);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON with soft brightness.");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF.");
    }
}
