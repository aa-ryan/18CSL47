import java.util.Scanner;

class Prims {
	int prim(int a[][], int n, int source) {
		int s[] = new int[10]; 
		int d[] = new int[10]; 
		int min, u = 0, v = 0, i, j, sum = 0;
		for (i = 0; i < n; i++) {
			s[i] = 0;
			d[i] = a[source][i];
		}
		s[source] = 1;

		for(i = 0; i < n-1; i++) {   // chng wrt djis
			min = 9999;
			for (j = 0; j < n; j++) {  //same as above
				if (s[j] == 0)
					if (d[j] < min) {
						min = d[j];
						u = j;
					}
			}
			s[u] = 1;
			sum += d[u]; // new
			for (v = 0; v < n; v++) 
				if (s[v] == 0) 
					if (d[v] > a[u][v])
						d[v] = a[u][v];
		}
		return sum;
	}

	public static void main(String[] args) {
		Prims d = new Prims ();
		int a[][] = new int[10][10], n, source, sum = 0;

		System.out.print("\nEnter the number of nodes: ");
		Scanner sObj = new Scanner(System.in);
		n = sObj.nextInt();
		System.out.println("Enter adjacency matrix:");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) 
				a[i][j] = sObj.nextInt();

		System.out.print("Enter source node: ");
		source = sObj.nextInt();
		sObj.close();

		sum = d.prim(a, n, source);
		System.out.println("The minimum cost of minimum spanning tree = "  + sum);
	}
}
