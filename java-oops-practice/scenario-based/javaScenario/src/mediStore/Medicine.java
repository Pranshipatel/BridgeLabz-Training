package mediStore;


import java.time.LocalDate;
import java.time.Period;

public class Medicine  implements ISellable {
	
	private int price;
	private int quantity;
	protected String name;
	protected LocalDate expiryDate;
	
	public Medicine(int price, int quantity, String name, LocalDate expiryDate) {
		this.price = price;
		this.name = name;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}

	protected int getPrice() {
		return price;
	}



	protected int getQuantity() {
		return quantity;
	}



	protected void setPrice(int price) {
		this.price = price;
	}



	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	@Override
	public void sell() {
		 double totalAmount = price * getQuantity();
		 double discountAmount = totalAmount * 0.05; 
		 double finalAmount = totalAmount - discountAmount;

		    

		 System.out.println("Medicine: " + name);
		 System.out.println("Total amount: Rs " + totalAmount);
		 System.out.println("Discount: Rs " + discountAmount);
		 System.out.println("Payable amount: Rs " + finalAmount);
	}

	@Override
	public void checkExpiry() {
       
	}
	

}
