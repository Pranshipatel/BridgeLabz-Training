package artify;

public class PrintArt extends Artwork {

	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	public void license() {
		System.out.println("For print only one copy is allowed");
	}

}
