package artify;

public class Artify {
	public static void main(String[] args) {
		
		Artwork a1 = new DigitalArt("Stranger Things", "Duffer Brothers", 500, "Digital");
		User user1 = new User("Pranshi",5000);
		a1.purchase(user1);
		a1.license();
	}

}
