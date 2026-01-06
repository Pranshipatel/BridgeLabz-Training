package com.sortingalgorithms;

public class SelectionSort {
	public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {78, 45, 89, 32, 67};

        selectionSort(examScores);

        System.out.print("Sorted Exam Scores: ");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }

}
