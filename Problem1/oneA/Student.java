package oneA;
import java.util.Scanner;

public class Student {


	private String usn, name, branch;
	private long phone;

	Scanner sObj = new Scanner(System.in);

	void get(int x) {
		System.out.println("Enter NAME, USN, BRANCH and PHONE of a " + x + "student");
		name = sObj.nextLine();
		usn = sObj.nextLine();
		branch = sObj.nextLine();
		phone = sObj.nextLong();
	}

	void print() {
		System.out.println(name + "\t\t" + usn  + "\t\t" + branch + "\t\t" + phone + "\n");
	}
}
