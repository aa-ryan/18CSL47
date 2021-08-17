import java.util.Random;
import java.util.Scanner;

class mergeSort
{

	static int[] randomArray() {
		Random rn = new Random();
		Scanner sObj = new Scanner(System.in);
		System.out.print("Enter Size of the array: ");
		int n = sObj.nextInt();
		int[] arr = new int[n];  // increase this 1000 to see change in execution time
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(50000);
		}
		sObj.close();
		return arr;
	}

	void merge(int arr[], int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) L[i] = arr[low + i];
		for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];
		
		int i = 0, j = 0, k = low;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			k++; 
			i++;
		}

		while (j < n2) {
			arr[k] = R[j];
			k++; 
			j++;
		}
	}

	void sort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			merge(arr, low, mid, high);
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
		long sTime = System.nanoTime();
		mergeSort ob = new mergeSort ();
		ob.sort(arr, 0, n-1);
		long eTime = System.nanoTime();

		System.out.println("Sorted array");
		printArray(arr);
		System.out.println("Time taken: " + (double)(eTime - sTime)/100000 + "ms");
	}
}

