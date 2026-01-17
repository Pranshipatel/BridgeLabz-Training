package icecreamrush;

public class Main {
	public static void main(String[] args) {
		IceCreamRush ir = new IceCreamRush();

        ir.addIceCream(new IceCream("Vanilla", 100));
        ir.addIceCream(new IceCream("Chocolate", 150));
        ir.addIceCream(new IceCream("Strawberry", 90));
        ir.addIceCream(new IceCream("Mango", 120));
        ir.addIceCream(new IceCream("Butterscotch", 80));
        ir.addIceCream(new IceCream("Pistachio", 70));
        ir.addIceCream(new IceCream("Black Current", 60));
        ir.addIceCream(new IceCream("Coffee", 110));

        ir.sortCount();
        ir.display();
		
	}

}
