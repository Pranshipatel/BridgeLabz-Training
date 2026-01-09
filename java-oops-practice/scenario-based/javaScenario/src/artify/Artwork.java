package artify;

public class Artwork implements IPurchasable{
	protected String title;
	protected String artist;
	protected double price;
	private String licenseType;
	
	protected String getLicenseType() {
		return licenseType;
	}

	protected void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public Artwork(String title, String artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		
	}

	

	@Override
	public void purchase(User user) {
		if(user.getWalletBalance() >= price) {
		System.out.println("Price of " + getLicenseType()+ " is "+ price);
		user.deductBalance(price);
		} else {
			System.out.println("Sorry Insufficient Balance");
		}
	}

	@Override
	public void license() {
		
	}

}
