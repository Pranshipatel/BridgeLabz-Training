package ewalletapplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet(double balance, boolean referral) {
        super(balance, referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;
        double total = amount + tax;

        if (deductMoney(total)) {
            receiver.getWallet().addMoney(amount);
            transactions.add(new Transaction("BusinessUser", receiver.getName(), amount));
            System.out.println("Transfer successful with tax deduction");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
