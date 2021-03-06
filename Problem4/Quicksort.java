import java.util.Scanner;
import java.util.Random;

class QuickSort
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

	int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = low - 1; // index of smaller element
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}


	void sort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);

			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
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
		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n-1);
		long eTime = System.nanoTime();

		System.out.println("Sorted array");
		printArray(arr);
		System.out.println("Time taken: " + (double)(eTime - sTime)/100000 + "ms");
	}
}

