// Program to divide 14 pens among 3 students equally and also find non distributed pens

public class DistributionOfPen{
	
	public static void main (String[] args){
		
		// Taking the number of pens
		int pen = 14;
		
		// Taking the number of Student among whom pen is to be distributed
		int studentNumber = 3;
		
		// Calculate the number of pens distributed equally among student
		int distributedPen = pen / studentNumber;
		
		// Calculate the number of remaining non-distributed pens.
        int nonDistributedPen = pen % distributedPen;
		
		// print the number of pens distributed and remaining non-distributed pens.
		System.out.println("The Pen Per Student is " + distributedPen + " and the remaining pen not distributed is " + nonDistributedPen);

	
	}
	
}