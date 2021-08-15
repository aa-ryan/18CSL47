import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		Scanner sObj = new Scanner(System.in);
		System.out.println("Enter a and b values: ");
		a = sObj.nextInt();
		b = sObj.nextInt();

		try {
			int c = a/b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException e){
			System.out.println("Dividing by zero, Exception Caught " + e );
			e.printStackTrace();
		}
	}
}
