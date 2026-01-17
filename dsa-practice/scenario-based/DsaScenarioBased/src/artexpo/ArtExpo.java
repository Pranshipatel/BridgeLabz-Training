package artexpo;

import java.util.ArrayList;

public class ArtExpo {
	ArrayList<Artist> artist = new ArrayList<>();
	
	void addArtist(Artist a) {
		artist.add(a);
		System.out.println("Artist '" + a.name + "' Added ");
	}
	
	void displayDetails() {
		System.out.println("------------------Artist at Exhibition--------------------");
		for(int i = 0 ; i < artist.size();i++) {
			System.out.println();
			System.out.println("Name = " + artist.get(i).name);
			System.out.println("Registration Time = "+ artist.get(i).currentTime);
			
			System.out.println("---------------------------------------------------");
		}
	}
	
	void sortArray() {
		for(int i = 1; i < artist.size(); i++) {
			Artist curr = artist.get(i);
			int prev = i - 1;
			
			while(prev >= 0 && artist.get(prev).currentTime.isAfter(curr.currentTime)) {
				artist.set(prev+1, artist.get(prev))  ;
				prev--;
			}
			
			artist.set(prev+1, curr);
			
		}
	}

}
