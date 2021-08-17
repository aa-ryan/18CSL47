class dijkstra {
	void diji(int a[][], int n, int source) {
		int s[] = new int[10];
		int d[] = new int[10];

		int u = 0, v = 0, min;

		for (int i = 1; i <= n; i++) {
			s[i] = 0;
			d[i] = a[source][i];
		}
		s[source] = 1;
		for (int i = 1; i <= n; i++) {
			min = 999;
			for (j = 1; j <= n; j++) {
				if (s[j] == 0)
					if (d[j] < min) {
						min = d[j];
						u = j;
					}
		}
		s[u] = 1;

		for (int v = 1; v <= n; v++) {
			if (s[v] == 0)
				if (d[v] > d[u] + a[u][v])
					d[v] = d[u] + a[u][v];
		}
		System.out.println("Shortest distance source: ");
		for (int i = 1; i <= n; i++) System.out.println(source + "->" + i + "=\t" + d[i]);
	}
}
