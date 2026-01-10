package tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    // Polymorphism
    @Override
    public void book() {
        System.out.println("International Trip booked to " + destination);
        System.out.println("Passport & Visa verification completed.");
        System.out.println("Total Budget: ₹" + totalBudget);
    }

    @Override
    public void cancel() {
        System.out.println("International Trip cancelled with refund rules applied.");
    }
}
