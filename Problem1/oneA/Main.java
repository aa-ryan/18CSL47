package oneA;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student[] str = new Student[10];
		Scanner sObj = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sObj.nextInt();

		for (int i = 1; i <= n; i++) {
			str[i] = new Student();
			str[i].get(i);
		}
		
		System.out.println("STUDENT INFORMATION");
		System.out.println("NAME\t\t" + "USN\t\t" + "BRANCH\t\t" + "PHONE_NUMBER\n");
		for(int i = 1; i <= n; i++) {
			str[i].print();
		}
		sObj.close();
	}
}
