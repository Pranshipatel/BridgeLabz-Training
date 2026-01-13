package parceltracker;

import java.util.LinkedList;

public class ParcelTracker {
	LinkedList<String> stages = new LinkedList<>();

	void addStages(String stage) {
		if(!stages.contains(stage)) {
		   stages.add(stage);
		   System.out.println("Parcel is " + stage);
		
		} else { 
		   System.out.println("Parcel already had this stage");
		}
	}
	
	void viewCheckPoint() {
		if(stages.isEmpty()) {
			System.out.println("Sorry we can't reach your parcel");
			return;
		}
		
		System.out.println(stages.getLast());
	}
	
	void trackOrder() {
		System.out.println("--------------------Order Status-------------------------");
		for(int i = 0 ; i < stages.size() -1 ; i++) {
		  System.out.print(stages.get(i) + " -> ");
		}
		System.out.print(stages.getLast());
	}
}
