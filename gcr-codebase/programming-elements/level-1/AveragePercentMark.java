//  Finding the average percent mark of Sam in PCM

public class AveragePercentMark{
	
	public static void main(String[] args){
		
		// Take name of the person whose average percent mark is to be calculated
		String name = "Sam";
		
		// Take marks in Maths
		int mathMarks = 94;
		
		// Take marks in Physics
		int physicsMarks = 95;
		
		// Take marks in Chemistry
		int chemistryMarks = 96;
		
		// Calculate the average percent marks in PCM
		int averagePercentMark = ( mathMarks + physicsMarks + chemistryMarks ) / 3;
		
		// Print the average percent mark of person
		System.out.println(name + " average mark in PCM is " + averagePercentMark );
	
	}
}	
		