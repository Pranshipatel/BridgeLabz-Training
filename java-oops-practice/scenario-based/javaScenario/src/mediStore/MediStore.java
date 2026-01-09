package mediStore;

import java.time.LocalDate;

public class MediStore {
	public static void main(String[] args) {
		Medicine m = new Syrup(55, 3 , "cold" , LocalDate.of(2027, 01, 04));
		
		m.checkExpiry();
		m.sell();
	}

}
