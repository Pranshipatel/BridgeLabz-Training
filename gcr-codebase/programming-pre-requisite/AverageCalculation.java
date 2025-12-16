import java.util.*;

public class AverageCalculation{
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 // Taking First Number in input
     System.out.println("Enter the First Number: ");
     int First = sc.nextInt();
	 
	 // Taking Second Number in input
     System.out.println("Enter the Second Number: ");
     int Second = sc.nextInt();
	 
	 // Taking Third Number in input
     System.out.println("Enter the Third Number: ");
     int Third = sc.nextInt();

     // Calculating the average of three numbers
     int Average = (First + Second + Third) / 3 ;
     System.out.println("Average of 3 Numbers: " + Average);

    }
}