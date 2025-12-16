import java.util.*;

public class PowerCalculation{
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 // Taking Base as input
     System.out.println("Enter the Base: ");
     int Base = sc.nextInt();
	 
	 // Taking Exponent as input
     System.out.println("Enter the Exponent: ");
     int Exponent = sc.nextInt();
	 
	 // Calculating Power
     int result = (int) Math.pow(Base,Exponent) ;
     System.out.println("Power of Number: " + result);

   }
}