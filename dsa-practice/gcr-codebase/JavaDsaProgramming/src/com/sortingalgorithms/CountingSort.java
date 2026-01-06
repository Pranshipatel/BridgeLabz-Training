package com.sortingalgorithms;

public class CountingSort {
	public static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;

        // Step 1: Count array
        int[] count = new int[range];

        // Step 2: Store frequency
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 3: Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Output array
        int[] output = new int[ages.length];

        // Step 5: Place elements (right to left for stability)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {15, 12, 14, 10, 18, 12, 16};

        countingSort(studentAges);

        System.out.print("Sorted Student Ages: ");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }

}
