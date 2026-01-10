package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String location, String date,
                          int attendees, double venueCost, User organizer) {

        super(eventId, "Birthday Party", location, date,
              attendees, venueCost, organizer);
    }

    public BirthdayEvent(int eventId, String location, String date,
                          int attendees, double venueCost,
                          double serviceCost, double discount, User organizer) {

        super(eventId, "Birthday Party", location, date,
              attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday Event Scheduled!");
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
