public class ZaraBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData() {

        int data[][] = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            // 5-digit salary (10000 to 99999)
            data[i][0] = 10000 + (int)(Math.random() * 90000);

            // years of service (1 to 10)
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }
	
	

    // Method to calculate bonus and new salary
    public static int[][] calculateBonus(int data[][]) {

        int result[][] = new int[10][2]; // [bonus][new salary]

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            int bonus;

            if (years > 5) {
                bonus = salary * 5 / 100;
            } else {
                bonus = salary * 2 / 100;
            }

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }
	
	

    // Method to display result and totals
    public static void displayResult(int data[][], int result[][]) {

        int totalOldSalary = 0;
        int totalBonus = 0;
        int totalNewSalary = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < 10; i++) {

            totalOldSalary += data[i][0];
            totalBonus += result[i][0];
            totalNewSalary += result[i][1];

            System.out.println(
                (i + 1) + "\t" +
                data[i][0] + "\t\t" +
                data[i][1] + "\t" +
                result[i][0] + "\t" +
                result[i][1]
            );
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {

        int employeeData[][] = generateEmployeeData();
		
        int bonusData[][] = calculateBonus(employeeData);
		
        displayResult(employeeData, bonusData);
    }
}
