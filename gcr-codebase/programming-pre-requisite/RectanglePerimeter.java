import java.util.*;

public class RectanglePerimeter{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
	  
	  // Taking Width as Input
      System.out.println("Enter the width: ");
      int width = sc.nextInt();
	  
	  // Taking Length as Input
      System.out.println("Enter the length: ");
      int length = sc.nextInt();
	  
	  // Calculating perimeter of Rectangle
      int Perimeter = 2 * (length + width) ;
      System.out.println("Area of Perimeter: " + Perimeter);

   }
}