// Parking lot gate System Program

import java.util.Scanner;

public class ParkingLotSystem{
	public static void main(String[] args){
		
		int parkingSlots = 10;
		
		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);
		
		while(parkingSlots >= 0){
			
			System.out.println("----------------------------");
			System.out.println("Parking lot menu : ");
		    System.out.println("1 For Parking");
		    System.out.println("2 For Seeing Occupancy");
		    System.out.println("3 For Exit");
			System.out.println("----------------------------");
		    int input = sc.nextInt();
			boolean isExit = false;
			boolean isFull = false;
			
			switch(input){
				case 1 : {
					if(parkingSlots > 0){
					    parkingSlots--;
					    System.out.println("You have successfully parked your car");
					} else 
						isFull = true;
					break;
				}
				case 2 : {
					System.out.println(parkingSlots + " Spaces are vacant");
					break;
				}
				case 3 : {
					isExit = true;
					parkingSlots++;
					break;
				} 
				default : System.out.println("Invalid Option Please Choose again");
			}
			
			if(isExit){
				System.out.println("You havee successfully Exit");
				break;
			}
			
			if(isFull){
				System.out.println("Sorry this parking is full");
				break;
			}
			
		}
		
		sc.close();
		
	}
	
}
				
				 
