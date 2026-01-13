package callcenter;

public class Main {
    public static void main(String[] args) {
        CallCenter center = new CallCenter();

        Customer c1 = new Customer("C101", "Amit", false);
        Customer c2 = new Customer("C102", "Neha", true);
        Customer c3 = new Customer("C103", "Rahul", false);
        Customer c4 = new Customer("C102", "Neha", true);

        center.receiveCall(c1);
        center.receiveCall(c2);
        center.receiveCall(c3);
        center.receiveCall(c4);

        center.handleCall();
        center.handleCall();
        center.handleCall();

        center.showCallstats();
    }
}