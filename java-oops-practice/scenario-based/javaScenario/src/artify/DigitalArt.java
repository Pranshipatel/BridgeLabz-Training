package artify;

public class DigitalArt extends Artwork {

	public DigitalArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	public void license() {
		System.out.println("For Digital Copy unlimited copies is available");
		
	}

}
