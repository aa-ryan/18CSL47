package oneB;

public class Main {
	public static void main(String[] args) {
		Stack s = new Stack();
		int ch;
		do {
			System.out.println("Stack Operations\n" + "1. Push\n2. Pop\n3. Display\n4. Exit\n" + "Enter your choice: ");
			ch = s.sObj.nextInt();
			switch(ch) {
				case 1: s.push();
						break;
				case 2: s.pop();
						break;
				case 3: s.display();
						break;
				case 4: return;
				default: System.out.println("Invalid choice");
			}
		} while (ch != 4);
	}
}
