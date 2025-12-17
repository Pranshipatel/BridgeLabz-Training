// Program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;
public class NumberOfStudents{
	public static void main(String[] args){
		int numberOfStudent;
		
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take number of student as user input
		System.out.println("Enter the number of Student: ");
		numberOfStudent = input.nextInt();
		
		// Calculate number of handshakes
		int numberOfHandshakes = (numberOfStudent * (numberOfStudent - 1)) / 2;
		
		// Print  the number of possible handshakes.
        System.out.println("Number of possible handshakes is " + numberOfHandshakes );
    
	}
}

 
