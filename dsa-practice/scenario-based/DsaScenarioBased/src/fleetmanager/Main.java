package fleetmanager;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("V101", 3200),
            new Vehicle("V102", 1500),
            new Vehicle("V103", 4500),
            new Vehicle("V104", 2100),
            new Vehicle("V105", 3800)
        };

        FleetManager fm = new FleetManager();
        fm.mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("Master Maintenance Schedule:");
        for (Vehicle v : vehicles) {
            v.display();
        }
    }
}