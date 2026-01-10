package parkease;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    
    private String bookingLog;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignSlot(Vehicle vehicle) {
        if (!isOccupied) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for "
                    + vehicle.getClass().getSimpleName();
        }
    }

    public void freeSlot() {
        isOccupied = false;
    }

       public String getBookingLog() {
        return bookingLog;
    }
}
