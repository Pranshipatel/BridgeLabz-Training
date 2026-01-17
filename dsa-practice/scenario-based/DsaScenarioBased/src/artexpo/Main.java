package artexpo;

import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		ArtExpo ae = new ArtExpo();

		ae.addArtist(new Artist("Pranshi", LocalTime.of(9, 0)));
		ae.addArtist(new Artist("Aarav", LocalTime.of(9, 5)));
		ae.addArtist(new Artist("Diya", LocalTime.of(9, 10)));
		ae.addArtist(new Artist("Rohan", LocalTime.of(9, 15)));
		ae.addArtist(new Artist("Kunal", LocalTime.of(9, 25)));
		ae.addArtist(new Artist("Meera", LocalTime.of(9, 30)));
		ae.addArtist(new Artist("Ankit", LocalTime.of(9, 35)));
		ae.addArtist(new Artist("Sneha", LocalTime.of(9, 20)));
		ae.addArtist(new Artist("Neha", LocalTime.of(9, 40)));
		ae.addArtist(new Artist("Vikram", LocalTime.of(9, 45)));
	    ae.addArtist(new Artist("Rahul", LocalTime.of(9, 55)));
		ae.addArtist(new Artist("Isha", LocalTime.of(10, 0)));
		ae.addArtist(new Artist("Kabir", LocalTime.of(10, 5)));
		ae.addArtist(new Artist("Pooja", LocalTime.of(9, 50)));
		ae.addArtist(new Artist("Nisha", LocalTime.of(10, 10)));
		System.out.println();
		ae.sortArray();
		ae.displayDetails();
	}
	

}
