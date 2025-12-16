import java.util.*;

public class SimpleInterest{

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     // Taking Principal as input
     System.out.println("Enter Principal: ");
     int Principal = sc.nextInt();

     // Taking Rate as input
     System.out.println("Enter Rate: ");
     int Rate = sc.nextInt();

     // Taking Time as input
     System.out.println("Enter Time: ");
     int Time = sc.nextInt();

     // Calculating Simple Interest
     int SimpleInterest = (Principal * Rate * Time) / 100;
     System.out.println("Simple Interest is : "+ SimpleInterest);

  }

}