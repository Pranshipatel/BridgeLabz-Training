package mediStore;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Injection extends Medicine {

	public Injection(int price, int quantity, String name, LocalDate expiryDate) {
		super(price, quantity, name, expiryDate);
	}
	
	@Override
	public void checkExpiry() {
        LocalDate currentDate = LocalDate.now();
        
        if(currentDate.isAfter(expiryDate) || currentDate.isAfter(expiryDate.minusMonths(3))) {
        	System.out.println("Sorry this syrup is expired");
        }
        else {
        	System.out.println("This injection is safe");
        }
	}
	


}
