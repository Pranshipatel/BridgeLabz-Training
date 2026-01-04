package ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(double balance, boolean referral) {
        super(balance, referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > 5000) {
            System.out.println("Transfer limit exceeded for Personal Wallet");
            return;
        }

        if (deductMoney(amount)) {
            receiver.getWallet().addMoney(amount);
            transactions.add(new Transaction("PersonalUser", receiver.getName(), amount));
            System.out.println("Transfer successful (Personal Wallet)");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
