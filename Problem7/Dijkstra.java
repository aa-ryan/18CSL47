import java.util.Scanner;

public class Dijkstra {
	void diji(int a[][], int n, int source) {
		int s[] = new int[10]; 
		int d[] = new int[10]; 
		int min, u = 0, v = 0, i, j;
		for (i = 1; i <= n; i++) {
			s[i] = 0;
			d[i] = a[source][i];
		}
		s[source] = 1;

		for(i = 1; i <= n; i++) {
			min = 9999;
			for (j = 1; j <= n; j++) {
				if (s[j] == 0)
					if (d[j] < min) {
						min = d[j];
						u = j;
					}
			}
			s[u] = 1;
			for (v = 1; v <= n; v++) 
				if (s[v] == 0) 
					if (d[v] > d[u] + a[u][v])
						d[v] = d[u] + a[u][v];
		}
		System.out.println("Shortest Distance Source: ");
		for (i = 1; i <= n; i++) 
			System.out.println(source + "->" + i + "\t" + d[i]);
	}

	public static void main(String[] args) {
		Dijkstra d = new Dijkstra();
		int a[][] = new int[10][10], n, source;

		System.out.print("\nEnter the number of nodes: ");
		Scanner sObj = new Scanner(System.in);
		n = sObj.nextInt();
		System.out.println("Enter adjacency matrix:");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) 
				a[i][j] = sObj.nextInt();

		System.out.print("Enter source node: ");
		source = sObj.nextInt();
		sObj.close();

		d.diji(a, n, source);
	}
}
