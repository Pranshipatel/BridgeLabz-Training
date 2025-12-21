// Program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;
import java.util.Arrays;

public class TrigonometricFunctions{
	
	public double[] calculateTrigonometricFunctions(double angle){
		
		double radian = Math.toRadians(angle);
		
		double sine = Math.sin(radian);
		double cosine = Math.cos(radian);
		double tangent = Math.tan(radian);
		
		return new double[] {sine, cosine, tangent};
	}

	
	public static void main (String[] args){
		
		TrigonometricFunctions calculate = new TrigonometricFunctions();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take degree as user input
		System.out.println("Enter the degree: ");
		double degree = input.nextDouble();
		
		// Get sine, cosine, tangent
		double result[] = calculate.calculateTrigonometricFunctions(degree);
		
		// Print  the sine, cosing, tangent
		// result[0] = sine , result[1] = cosine, result[2] = tangent
		System.out.println(" sine, cosine, tangent = "+ Arrays.toString(result));
		
		input.close();
		
	}
	
}
		