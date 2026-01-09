package mediStore;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Tablet extends Medicine {

	public Tablet(int price, int quantity, String name, LocalDate expiryDate) {
		super(price, quantity, name, expiryDate);
	}
	
	@Override
	public void checkExpiry() {
        LocalDate currentDate = LocalDate.now();
        
        if(currentDate.isAfter(expiryDate) || currentDate.isAfter(expiryDate.minusMonths(10))) {
        	System.out.println("Sorry this syrup is expired");
        }
        else {
        	System.out.println("This Tablet is safe");
        }
	}
	




}
