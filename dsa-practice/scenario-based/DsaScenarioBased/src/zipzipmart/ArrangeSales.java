package zipzipmart;

public class ArrangeSales {
	static Transaction[] sales = new Transaction[11];
	int index = 0;
	
	
	void addDetails(String date, double amount) {
	    if (index < sales.length) {
	        Transaction t = new Transaction(date, amount);
	        sales[index++] = t;
	    } else {
	        System.out.println("Sales array is full");
	    }
	}
	
	void displayDetails() {
		for(int i = 0 ; i < index; i++) {
			if (sales[i] != null) {
                System.out.println(sales[i]); 
            }
		}
	}
	

    // ---------- MERGE SORT ----------
    void sortDateAndAmount() {
        mergeSort(0, index - 1);
    }

    void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(left, mid);
            mergeSort(mid + 1, right);

            merge(left, mid, right);
        }
    }

    void merge(int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            L[i] = sales[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = sales[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            // Compare by date
            int dateCompare = L[i].date.compareTo(R[j].date);

            if (dateCompare < 0 ||
               (dateCompare == 0 && L[i].amount <= R[j].amount)) {
                sales[k++] = L[i++];
            } else {
                sales[k++] = R[j++];
            }
        }

        while (i < n1)
            sales[k++] = L[i++];

        while (j < n2)
            sales[k++] = R[j++];
    }


}
