import java.util.Scanner;

public class SchoolBusAttendance {

    // Method to take attendance
    public static void takeAttendance(String[][] attendance, String[] names, Scanner input) {
        System.out.println("Taking attendance of students -----");

        for (int i = 0; i < attendance.length; i++) {
            attendance[i][0] = names[i];
            System.out.println("Enter attendance for " + names[i] + " (Present/Absent)");
            attendance[i][1] = input.nextLine();

            
        }
    }

    // Method to display attendance
    public static void displayAttendance(String[][] attendance) {
        System.out.println();
        System.out.println("Name of students and attendance -----");
        System.out.println("------------------------------------");
        System.out.println("Student Name\t\tAttendance");
        System.out.println();

        for (int i = 0; i < attendance.length; i++) {
            System.out.println(attendance[i][0] + "\t\t\t" + attendance[i][1]);
        }
    }

    // Method to count present and absent
    public static void countAttendance(String[][] attendance) {
        int presentCount = 0;
        int absentCount = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i][1].equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        System.out.println();
        System.out.println("Present Count = " + presentCount);
        System.out.println("Absent Count  = " + absentCount);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] attendance = new String[10][2];
        String[] names = {
            "Pranshi", "Nainshi", "Prince", "Vasu", "Ram",
            "Rohit", "Rekha", "Rini", "Ronny", "Lucky"
        };

        takeAttendance(attendance, names, input);
        displayAttendance(attendance);
        countAttendance(attendance);

        input.close();
    }
}
