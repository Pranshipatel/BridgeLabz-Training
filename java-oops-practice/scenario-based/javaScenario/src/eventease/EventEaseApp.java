package eventease;

public class EventEaseApp {
    public static void main(String[] args) {

        User user1 = new User("Pranshi", "pranshi@mail.com", "9999999999");

        Event birthday = new BirthdayEvent(
                101, "Banquet Hall", "10-Feb-2026",
                50, 20000, 8000, 2000, user1
        );

        birthday.schedule();
        birthday.reschedule("12-Feb-2026");
        birthday.cancel();

        System.out.println();

        Event conference = new ConferenceEvent(
                202, "Convention Center", "20-Mar-2026",
                300, 100000, 40000, 10000, user1
        );

        conference.schedule();
    }
}
