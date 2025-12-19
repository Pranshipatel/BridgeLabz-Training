// Program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
 
import java.util.Scanner;

public class BonousAmountOfEmployees{
	public static void main (String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		int numberOfEmployees = 10;
		
		// Creating array to store salary, yearOfService, newSalary and bonusAmount 
		double salary[] = new double[numberOfEmployees];
		double yearOfService[] = new double[numberOfEmployees];
		double newSalary[] = new double[numberOfEmployees];
		double bonusAmount[] = new double[numberOfEmployees];
		
		// creating variable to store total salary
		int totalSalary = 0;
		
		// taking salary and yearOfService as input
		for ( int i = 0; i < numberOfEmployees ; i++ ){
			System.out.println("Enter the salary of " + i + "th employee");
			salary[i] = input.nextDouble();
			System.out.println("Enter the yearOfService of " + i + "th employee");
			yearOfService[i] = input.nextDouble();
			
			if ( salary[i] < 0 || yearOfService[i] < 0 ){
				System.out.println("Invalid entry");
				i--;
			}
			
			totalSalary += salary[i];
			
		}
		
		// creating variable to store total bonus and new salary
		int totalBonus = 0;
		int totalNewSalary = 0;
		
		
		// calculating the new Salary and bonusAmount also the total bonus and newSalary
		for ( int i = 0; i < numberOfEmployees ; i++){
			if (yearOfService[i] >= 5 ){
				bonusAmount[i] = (salary[i] * 5 ) / 100;
				newSalary[i] = salary[i] + bonusAmount[i];
			} else if ( yearOfService[i] < 5){
				bonusAmount[i] = (salary[i] * 2 ) / 100;
				newSalary[i] = salary[i] + bonusAmount[i];
			}
			
			totalNewSalary += newSalary[i];
			totalBonus += bonusAmount[i];
			
		}
		
		// Printing the total bonus payout as well as the total old and new salary 
		System.out.println("Total salary = " + totalSalary);
		System.out.println("Total newSalary = " + totalNewSalary);
		System.out.println("Total Bonous = " + totalBonus);
		
		input.close();
		
	}
	
}

		
		
		
		
		
		
		
	