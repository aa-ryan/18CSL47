import java.util.Scanner;
import java.util.Random;

class mythread extends Thread {
	int num;
	mythread(int n) {
		num = n;
	}

	Random rndm = new Random();

	@Override
	public void run() {
		int i = 0;
		try {
			while (i < num) {
				int x = rndm.nextInt(100);
				System.out.println("\n\nRandom integer is " + x);

				sqthread sq = new sqthread(x);
				sq.start();

				cuthread cu = new cuthread(x);
				cu.start();

				i++;
				Thread.sleep(1000);
			}
		} catch ( Exception e ) {e.printStackTrace();}
	}
}

class sqthread extends Thread {
	int num;
	sqthread(int x) {
		num = x;
	}

	@Override
	public void run() {
		System.out.println("Square of " + num + " is: " + num*num);
	}
}

class cuthread extends Thread {
	int num;
	cuthread (int x) {
		num = x;
	}

	@Override
	public void run () {
		System.out.println("Cube of " + num + " is: " + num*num*num);
	}
}


public class Main {
	public static void main(String[] args) {
		System.out.print("Enter the value of n ->  ");
		Scanner sObj = new Scanner(System.in);
		int n = sObj.nextInt();

		mythread my = new mythread(n);

		my.start();

		sObj.close();
	}
}
