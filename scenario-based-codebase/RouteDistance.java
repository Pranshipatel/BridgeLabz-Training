//Program to track route distance
//Importing Scanner class from java.util package
import java.util.Scanner;
//Created a class RouteDistance
public class RouteDistance{
	
	public static void main(String[] args){
		
		//Initializing the Route and distance
		String[] route = {"Prabhat","Apsara","JK Road","Indrapuri","Bima","Anand Nagar"};
		int[] distance = {0,100,150,180,200,200};
		
		//Create object of Scanner class
		Scanner input = new Scanner(System.in);
		
		int totalDistance = 0;
		//Looping to display route and compute distance
		int index =0;
		int length = route.length;
		
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to Bus B-204 Prabhat to Anand Nagar");
		System.out.println("---------------------------------------------");
		
		
		while(index<length){
			//Taking user input to exit from bus
			totalDistance += distance[index];
			System.out.println("-------------------------------------------");
			System.out.println("Total distance travelled yet -> " + totalDistance);
			System.out.println("-------------------------------------------");
			System.out.println("Current Stop -> " + route[index]);
			System.out.println("---------------------------------------------------");
			if(index < length-1){
				System.out.println("Next Stop -> " + route[index+1] + " " + distance[index+1] + " meters left");

			}else{
				System.out.println("Reaches last Stop -> " + route[index]);
			}
			System.out.println("---------------------------------------------------");
			System.out.println("Enter \n 1 -> Exit \n 2-> Continue");
			System.out.println("-----------------------");
			int temp = input.nextInt();
			if(temp == 1){
				System.out.println("------------------------------");
				System.out.println("You Travelled from "+ route[0]+ " to " + route[index]);
				System.out.println("Total distance Travelled " + totalDistance + " meters");
				System.out.println("Thank you for Travelling");
				System.out.println("---------------------------");
				break;
				
			}
			
			index++;
		}
		
		input.close();
	}
}