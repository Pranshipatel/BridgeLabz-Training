package eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;   
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double venueCost, User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
        this.organizer = organizer;
    }

    
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double venueCost,
                 double serviceCost, double discount, User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

   
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }
}
