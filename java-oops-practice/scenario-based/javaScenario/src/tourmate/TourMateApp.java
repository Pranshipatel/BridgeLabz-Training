package tourmate;

public class TourMateApp {
    public static void main(String[] args) {

        Transport flight = new Transport(30000);
        Hotel hotel = new Hotel(20000);
        Activity sightseeing = new Activity(10000);

        Trip trip1 = new DomesticTrip(
                "Goa", 5, flight, hotel, sightseeing
        );

        trip1.book();
        System.out.println();

        Trip trip2 = new InternationalTrip(
                "Paris", 7, flight, hotel, sightseeing
        );

        trip2.book();
    }
}
