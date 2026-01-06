package com.sortingalgorithms;

class MergeSort {

    // Merge two subarrays
    public static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] L = new double[n1];
        double[] R = new double[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = prices[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge Sort function
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            merge(prices, left, mid, right);
        }
    }

    public static void main(String[] args) {
        double[] bookPrices = {499.50, 299.99, 150.75, 999.00, 450.25};

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices:");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
