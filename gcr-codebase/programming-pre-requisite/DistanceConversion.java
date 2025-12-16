import java.util.*;

public class DistanceConversion{
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 // Taking Distance in Kilometers as input
     System.out.println("Enter Distance in Kilometers: ");
     int Kilometers = sc.nextInt();

     // Calculating Distance in Miles
     double Miles = Kilometers * 0.621371 ;
     System.out.println("Kilometers to Miles: " + Miles);

   }
}