package robowarehouse;

public class RoboWareHouse {
	// Method to sort package weights using Insertion Sort
	public static void insertionSort(int[] weights) {

		
		for (int i = 1; i < weights.length; i++) {

			int key = weights[i];
			int j = i - 1;

			
			while (j >= 0 && weights[j] > key) {
				weights[j + 1] = weights[j];
				j--;
			}

			
			weights[j + 1] = key;
		}
	}

	// Main method to simulate robot shelf loading
	public static void main(String[] args) {
		
		int[] shelf = { 10, 40, 20, 30, 25 };
		
		insertionSort(shelf);
		
		for (int weight : shelf) {
			System.out.print(weight + " ");
		}
	}

}
