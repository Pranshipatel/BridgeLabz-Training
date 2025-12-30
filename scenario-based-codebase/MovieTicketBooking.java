import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean moreCustomers = true;

        while (moreCustomers) {

            double totalBill = 0;

            // Movie selection
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Action (₹200)");
            System.out.println("2. Comedy (₹180)");
            System.out.println("3. Drama (₹150)");
            int movieChoice = input.nextInt();

            switch (movieChoice) {
                case 1:
                    totalBill += 200;
                    break;
                case 2:
                    totalBill += 180;
                    break;
                case 3:
                    totalBill += 150;
                    break;
                default:
                    System.out.println("Invalid movie choice");
                    continue;
            }

            // Seat type
            System.out.println("Select Seat Type:");
            System.out.println("1. Gold (+₹100)");
            System.out.println("2. Silver (+₹50)");
            int seatChoice = input.nextInt();

            if (seatChoice == 1) {
                totalBill += 100;
            } else if (seatChoice == 2) {
                totalBill += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            // Snacks option
            System.out.println("Do you want snacks? (yes/no)");
            input.nextLine(); // clear buffer
            String snacksChoice = input.nextLine();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                totalBill += 80;
            }

            // Final bill
            System.out.println("Total Ticket Price = ₹" + totalBill);

            // Next customer
            System.out.println("Do you want to book for another customer? (yes/no)");
            String nextCustomer = input.nextLine();

            if (!nextCustomer.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        System.out.println("Thank you for using Movie Ticket Booking App 🎬");
        input.close();
    }
}
