public class WatchSimulation {

    public static void main(String[] args) throws InterruptedException {


       
		System.out.println("--------------------------------");
		System.out.println("\t Digital Watch \t");
		System.out.println("--------------------------------");
		watch:
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                // Print time in same place
				
                System.out.printf("\r%02d:%02d", hour, minute);
             
                // 1 millisecond delay
                Thread.sleep(1);

                // Power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.print("\n\nPower cut! Watch stopped.");
                    break watch;
                }
            }
        }
    }
}
