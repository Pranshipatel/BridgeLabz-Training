import java.util.*;


public class FahrenheitConversion{
   public static void main(String[] args){
	   
     Scanner sc = new Scanner(System.in);
	 
	 // Taking Temperature in Celcius as input
     System.out.println("Enter the temperature in Celsius: ");
     int Celsius = sc.nextInt();
	 
	 // Calculating Temperature in Fahrenheit 
     int Fahrenheit = (Celsius * 9/5) + 32;
     System.out.println("Temperature in Fahrenheit: "+ Fahrenheit);

   }
}