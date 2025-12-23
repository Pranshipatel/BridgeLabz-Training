import java.util.inputanner;

public class BMIProgram {

    public static void main(String[] args) {

        inputanner input= new inputanner(System.in);

        // 2D array to store weight and height
        double data[][] = new double[10][2];

        System.out.println("Enter weight and height for 10 persons");

        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Weight: ");
            data[i][0] = input.nextDouble();

            System.out.print("Height: ");
            data[i][1] = input.nextDouble();
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        // Calculate BMI and print
        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double height = data[i][1] / 100; 

            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            System.out.println(
                data[i][1] + "\t" +
                data[i][0] + "\t" +
                bmi + "\t" +
                status
            );
        }

        input.close();
    }
}
