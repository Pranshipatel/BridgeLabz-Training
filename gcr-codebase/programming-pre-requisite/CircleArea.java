import java.util.*;

public class CircleArea{
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 //Taking radius as input
     System.out.println("Enter the radius: ");
     int radius = sc.nextInt();
	 
	 //Calculating area of Circle
     double area = 3.14 * radius * radius ;
     System.out.println("Area of circle: " + area);

   }
}