// Train Reservation Queue Program 🚆

import java.util.Scanner;
public class TrainReservation{
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		final int seats = 10;
		int option ;
		int occupied = 0;
		boolean isRunning = true;
		
		while(isRunning){
			
			System.out.println();
			System.out.println("--------------------------");
			System.out.println("Choose The Ticket Option:");
			System.out.println("--------------------------");
			System.out.println("1 => For Booking Ticket");
			System.out.println("2 => For Cancelling Ticket");
			System.out.println("3 => Showing Occupancy");
			System.out.println("4 => Exit");
			
			option = input.nextInt();
			
			switch(option){
				case 1 -> {
				    if(occupied != seats){
					   occupied++;
					   System.out.println("You have successfully booked your ticket");
					} else {
						System.out.println("Sorry no seats left");
					}
				} 
				case 2 -> {
					occupied--;
					System.out.println("You have Cancelled your Ticket");
					System.out.println("Please Choose Option for Booking again");
				}
				case 3 -> {
					System.out.println("Total number of seats = " + seats);
					System.out.println("Vacant Seats = " + (seats - occupied));
					System.out.println("Occupied Seats = " + occupied);
				}
				case 4 -> {
					System.out.println("You have successfully exited the station");
					isRunning = false;
				}
				default ->
                    System.out.println("❌ Invalid option! Please choose 1–4");
			}
		}
		
	}
}
			