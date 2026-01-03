package smarthomeautomationsystem;

class Fan extends Appliance {

    public Fan() {
        super(75);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan started rotating.");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan stopped.");
    }
}
