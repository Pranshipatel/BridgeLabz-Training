package zipzipmart;

public class Transaction {
	String date;
	double amount;
	
	public Transaction(String date, double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	 public String toString() {
	     return "Date: " + date + ", Amount: ₹" + amount;
	 }
	
}
