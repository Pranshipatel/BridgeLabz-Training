import java.util.*;

public class CylinderVolume{
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 
	 // Taking radius as input
     System.out.println("Enter the radius: ");
     int radius = sc.nextInt();
	 
	 // Taking height as input
     System.out.println("Enter the height: ");
     int height = sc.nextInt();
	 
	 // Calculating Volume of Cylinder
     double volume = 3.14 * radius * radius * height;
     System.out.println("Volume of Cylinder is: "+ volume);

    }
}