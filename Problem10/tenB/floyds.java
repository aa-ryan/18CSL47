import java.util.Scanner;

public class floyds {

	void printMatrix(int[][] arr, int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}


	int min(int a, int b) {
		return (a < b ? a : b);
	}

	void floyd(int a[][], int n) {

		for (int k = 1; k <=n; k++) 
			for (int i = 1; i <= n; i++) 
				for (int j = 1; j <= n; j++) 
					a[i][j] = min(a[i][j], a[i][k]+a[k][j]);

		System.out.println();
		printMatrix(a, n);
	}


	public static void main(String[] args) {

		int[][] arr = new int[10][10];
		int n;

		floyds f = new floyds();
		Scanner sObj = new Scanner(System.in);

		System.out.print("\nEnter the number of nodes in a graph: ");
		n = sObj.nextInt();

		System.out.println("Enter the cost adjacency matrix: ");

		for (int i = 1; i <= n; ++i)
			for (int j = 1; j <= n; ++j)
				arr[i][j] = sObj.nextInt();
		
		sObj.close();

		System.out.println("The all Pair Shortest path matrix is: ");
		f.floyd(arr, n);
	}
}
