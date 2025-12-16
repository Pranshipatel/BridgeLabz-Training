import java.util.*;


public class AddTwoNumbers{
   public static void main(String[] args){
	   
      Scanner sc = new Scanner(System.in);
	  
	  // Taking first number in input
      System.out.println("Enter First number: ");
      int a = sc.nextInt();
	  
	  // Taking second number in input
      System.out.println("Enter Second number: ");
      int b = sc.nextInt();
	  
	  // Calculating Sum of Two Numbers
      int sum = a + b;
      System.out.println("Sum of two numbers: " + sum);

    }
}