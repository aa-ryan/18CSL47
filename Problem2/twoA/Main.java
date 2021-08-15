import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		teaching teach = new teaching();
		technical tech = new technical();
		contract cont = new contract();

		System.out.println("Enter teaching staff details: ");
		teach.read();

		System.out.println("Enter technical staff details: ");
		tech.read();

		System.out.println("Enter contract staff details: ");
		cont.read();

		System.out.println("Teaching staff details: ");
		teach.display();

		System.out.println("Technical staff details: ");
		tech.display();

		System.out.println("Contract staff details: ");
		cont.display();
	}
}

class staff {
	Scanner sObj = new Scanner(System.in);
	String StaffID, Name, Phone, Salary;
	
	void read() {
		System.out.println("Enter StaffID, Name, Phone, Salary one by one");
		StaffID = sObj.nextLine();
		Name = sObj.nextLine();
		Phone = sObj.nextLine();
		Salary = sObj.nextLine();
	}

	void display() {
		System.out.println("StaffID ->  " + StaffID);
		System.out.println("Name -> " + Name);
		System.out.println("Phone -> " + Phone);
		System.out.println("Salary -> " + Salary);
	}

}

class teaching extends staff {
	String domain, publication;

	@Override
	void read() {
		super.read();
		System.out.print("Enter domain: ");
		domain = sObj.nextLine();
		System.out.print("Number of publication: ");
		publication = sObj.nextLine();
	}

	@Override
	void display() {
		super.display();
		System.out.println("Domain ->  " + domain);
		System.out.println("Publications ->  " + publication);
	}

}

class technical extends staff {
	String skills;

	@Override
	void read() {
		super.read();
		System.out.print("Enter skill: ");
		skills = sObj.nextLine();
	}

	@Override
	void display() {
		super.display();
		System.out.println("Skill ->  " + skills);
	}

}


class contract extends staff {
	Integer period;

	@Override
	void read() {
		super.read();
		System.out.print("Enter contract time in years: ");
		period = sObj.nextInt();
	}

	@Override
	void display() {
		super.display();
		System.out.println("Contract details -> " + period);
	}

}
