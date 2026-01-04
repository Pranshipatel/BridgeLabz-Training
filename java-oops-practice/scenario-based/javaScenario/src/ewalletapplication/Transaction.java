package ewalletapplication;

public class Transaction {
    private String fromUser;
    private String toUser;
    private double amount;

    public Transaction(String fromUser, String toUser, double amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
    }

    public void showTransaction() {
        System.out.println(fromUser + " sent ₹" + amount + " to " + toUser);
    }
}
