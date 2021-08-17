import java.util.Random;

class mergeSort
{

	static int[] randomArray() {
		Random rn = new Random();
		int[] arr = new int[rn.nextInt(100000)];  // increase this 1000 to see change in execution time
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(500);
		}
		return arr;
	}

	void merge(int arr[], int low, int m, int high) {
		int n1 = m - low + 1;
		int n2 = high - m;

		// temp array
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) L[i] = arr[low + i];
		for (int i = 0; i < n2; ++i) R[i] = arr[m + 1 + i];

		int i = 0, j = 0;

		int k = low;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int[] arr, int low, int high) {
		if (low < high) {
			int m = low + (high-low)/2;
			sort(arr, low, m);
			sort(arr, m+1, high);
			merge(arr, low, m, high);
		}
	}


	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = randomArray();
		int n = arr.length;

		System.out.println("Unsorted Array");
		printArray(arr);
		long sTime = System.currentTimeMillis();
		mergeSort ob = new mergeSort ();
		ob.sort(arr, 0, n-1);
		long eTime = System.currentTimeMillis();

		System.out.println("Sorted array");
		printArray(arr);
		System.out.println("Time taken: " + (eTime - sTime) + "ms");
	}
}

