package artify;

public class User {
	private String name;
	private double walletBalance;
	
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = 5000;
	}
	
	 public double getWalletBalance() {
	     return walletBalance;
    }
	 
	 public void deductBalance(double amount) {
	     walletBalance -= amount;
	     System.out.println("Available balance = " + walletBalance);
	 }

	  public String getName() {
	     return name;
	  }


	   
	  

}
