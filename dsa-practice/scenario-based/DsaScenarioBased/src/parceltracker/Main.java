package parceltracker;

public class Main {
	public static void main(String[] args) {
		ParcelTracker pt = new ParcelTracker();
		pt.addStages("Packed");
		pt.addStages("Delivered");
		pt.viewCheckPoint();
		pt.trackOrder();
	}

}
