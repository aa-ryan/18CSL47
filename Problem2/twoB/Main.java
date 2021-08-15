import java.util.Scanner;
import java.util.StringTokenizer;

class customer {
	String name, dob;
	Scanner sObj = new Scanner(System.in);

	customer() {
		System.out.print("Enter name: ");
		name = sObj.nextLine();
		System.out.print("Enter dob: ");
		dob = sObj.nextLine();


		System.out.println("Tokenized");
		StringTokenizer st = new StringTokenizer(dob, "/");
		System.out.print(name);

		while (st.hasMoreTokens()) System.out.print("," + st.nextToken());
		System.out.println();
	}
}

public class Main {
	public static void main(String[] args){
		new customer();
	}
}
