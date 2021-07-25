package oneB;

import java.util.Scanner;

public class Stack {
	private int top = -1, item = 0, max = 5, arr[] = new int[max];
	Scanner sObj = new Scanner(System.in);

	void push() {

		if (top < max - 1) {
			System.out.println("Enter the element to be inserted: ");
			item = sObj.nextInt();
			arr[++top] = item;
		}
		else {
			System.out.println("OVERFLOW OCCURED");
		}
	}

	void pop() {

		if (top > -1) {
			item = arr[top--];
			System.out.println(item + " is popped");
		} 
		else {
			System.out.println("UNDERFLOW OCCURED");
		}
	}

	void display() {
		
		if (top > -1) {
			System.out.println("Stack Contents are: ");
			for (int i = top; i >= 0; i--) {
				System.out.println("---|"+ arr[i] + "|--");
			}
		}
	}

}

