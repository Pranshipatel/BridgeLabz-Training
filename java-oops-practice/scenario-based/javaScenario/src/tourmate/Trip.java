package tourmate;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;
    protected double totalBudget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

  
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        calculateBudget();
    }

    
    protected void calculateBudget() {
        totalBudget = transport.getCost()
                    + hotel.getCost()
                    + activity.getCost();
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
