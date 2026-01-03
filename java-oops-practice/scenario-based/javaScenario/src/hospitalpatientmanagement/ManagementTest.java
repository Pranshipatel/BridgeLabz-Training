package hospitalpatientmanagement;

public class ManagementTest {
	public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Pranshi", 22, 5);
        Patient p2 = new OutPatient(102, "Rahul", 30, 500);

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

        Bill bill = new Bill(5000, 0.18, 500);

        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();

        d1.displayInfo();
        System.out.println();

        System.out.println("Total Bill Amount: " + bill.calculatePayment());
    }

}

