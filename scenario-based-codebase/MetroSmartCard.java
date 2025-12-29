// Metro Smart Card Fare Deduction Program

import java.util.Scanner;
public class MetroSmartCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cardBalance = 2000;
		Scanner input = new Scanner(System.in);
		while(cardBalance > 0) {
			
			System.out.println("Enter the distance");
			int distance = input.nextInt();
			int fair = (distance > 500) ? 500 : 200;
			
			if(fair>cardBalance) {
				System.out.println("Card balance insufficient to travel ");
				break;
			}
			
			cardBalance -= fair;
			
			System.out.println("The remaining card balance is " + cardBalance);
			System.out.println("To exit travilling enter e else any thing");
			char continueTravelling = input.next().charAt(0);
			if(continueTravelling == 'e') {
				break;
			}
				
		}
		System.out.println("Thank you for travelling your remaining balance is " + cardBalance);
		
		input.close();
	}

}