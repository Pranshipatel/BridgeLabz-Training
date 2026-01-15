package zipzipmart;

public class Main {
	public static void main(String[] args) {
		ArrangeSales as = new ArrangeSales();

		as.addDetails("01-01-2026", 100);
        as.addDetails("02-01-2026", 200);
        as.addDetails("03-01-2026", 300);
        as.addDetails("04-01-2026", 400);
        as.addDetails("11-01-2026", 1100);
        as.addDetails("06-01-2026", 600);
        as.addDetails("07-01-2026", 700);
        as.addDetails("08-01-2026", 800);
        as.addDetails("09-01-2026", 900);
        as.addDetails("10-01-2026", 1000);
        as.addDetails("05-01-2026", 500);
       
        
        System.out.println("-----------------------Sales Befor Sorting--------------------");
        as.displayDetails();
        
        as.sortDateAndAmount();

        System.out.println();
        System.out.println("------------------After Sorting (Date → Amount):--------------");
        as.displayDetails();
        
	}

}
