package parkease;

public class ParkEaseApp {
    public static void main(String[] args) {

        Vehicle car = new Car("CAR123");
        Vehicle bike = new Bike("BIKE456");

        ParkingSlot slot1 = new ParkingSlot("S1", "Zone A", "Car");
        ParkingSlot slot2 = new ParkingSlot("S2", "Zone B", "Bike");

        if (slot1.isAvailable()) {
            slot1.assignSlot(car);
            double charge = car.calculateCharges(6);
            System.out.println("Car Parking Charges: ₹" + charge);
            System.out.println(slot1.getBookingLog());
        }

        if (slot2.isAvailable()) {
            slot2.assignSlot(bike);
            double charge = bike.calculateCharges(4);
            System.out.println("Bike Parking Charges: ₹" + charge);
            System.out.println(slot2.getBookingLog());
        }
    }
}
