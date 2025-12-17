// Program to find the age of Harry from current year to birth year

public class AgeOfPerson{
	
	public static void main(String[] args){
		
		// Creating a variable name to indicate the person whose age to find
		String name = "Harry";
		
		// Take the birth year of person
		int birthYear = 2000;
		
		// Take the current year
		int currentYear = 2024;
		
		// Calculate the age of the person
		int ageOfPerson = currentYear - birthYear;
		
		// Pring the Age of person
		System.out.println(name + " age in " + currentYear + " is " + ageOfPerson);
		
    }	

}