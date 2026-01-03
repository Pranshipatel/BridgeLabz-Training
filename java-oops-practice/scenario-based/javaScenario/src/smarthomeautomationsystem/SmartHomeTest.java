package smarthomeautomationsystem;

// method to Print the detail of all subclasses
public class SmartHomeTest {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        // Create a user controller object
        UserController controller = new UserController();

        // Display User Controller Profile
        controller.operateDevice(light, true);
        controller.operateDevice(ac, true);
        controller.operateDevice(fan, false);

        controller.compareEnergy(light, ac);
        
    }
}
