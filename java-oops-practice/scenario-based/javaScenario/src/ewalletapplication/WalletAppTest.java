package ewalletapplication;

public class WalletAppTest {
    public static void main(String[] args) {

        User u1 = new User("Pranshi", new PersonalWallet(3000, true));
        User u2 = new User("Amit", new BusinessWallet(10000, false));

        u1.getWallet().transferTo(u2, 2000);
        u2.getWallet().transferTo(u1, 3000);

        System.out.println("-----------------------------------------");
        System.out.println("Pranshi Balance: " + u1.getWallet().getBalance());
        System.out.println("Amit Balance: " + u2.getWallet().getBalance());
    }
}
