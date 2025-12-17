//  Program to compute the volume of Earth in km^3 and miles^3

public class VolumeOfEarth{
	
	public static void main (String[] args){
		
		// Take radius of earth in kilometer
		int radius = 6378;
		
		// Take the value of pi
		double pi = 3.14;
		
		// Calculate the volume of earth in kilometer
		double volumeOfEarth = (4 / 3) * pi * (radius * radius * radius);
		
		// Calculate the volume of earth in miles
		double volumeInMiles = volumeOfEarth * 0.621371;
		
		// Print the volume of Earth in km^3 and miles^3
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarth  + " and cubic miles is " + volumeInMiles  );
		
    }
	
}