package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String location, String date,
                            int attendees, double venueCost, User organizer) {

        super(eventId, "Conference", location, date,
              attendees, venueCost, organizer);
    }

    public ConferenceEvent(int eventId, String location, String date,
                            int attendees, double venueCost,
                            double serviceCost, double discount, User organizer) {

        super(eventId, "Conference", location, date,
              attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference Event Scheduled!");
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
