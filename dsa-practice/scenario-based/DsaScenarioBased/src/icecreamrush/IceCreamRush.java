package icecreamrush;

import java.util.ArrayList;

public class IceCreamRush {
	ArrayList<IceCream> array = new ArrayList<>();
	
	void addIceCream(IceCream i) {
		array.add(i);
		System.out.println(i.flavour + " ice cream added");
	}
	
	void sortCount() {
		for(int i = 0; i < array.size()-1; i++) {
			for(int j = 0; j < array.size()-i-1; j++) {
				if(array.get(j).sellCount > array.get(j+1).sellCount) {
				    IceCream temp = array.get(j);
	                array.set(j, array.get(j + 1));
	                array.set(j + 1, temp);
				}
			}
		}
	}
	
	void display() {
		System.out.println("------------------Ice Creams------------------");
		System.out.println();
		for(int i = 0; i < array.size();i++) {
			System.out.println(array.get(i).flavour + " has sell count = " + array.get(i).sellCount);
			System.out.println("-----------------------------------");
		}
	}

}
