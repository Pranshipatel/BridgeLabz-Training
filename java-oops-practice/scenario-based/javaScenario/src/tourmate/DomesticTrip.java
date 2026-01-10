package tourmate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    // Polymorphism
    @Override
    public void book() {
        System.out.println("Domestic Trip booked to " + destination);
        System.out.println("Total Budget: ₹" + totalBudget);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic Trip cancelled.");
    }
}
