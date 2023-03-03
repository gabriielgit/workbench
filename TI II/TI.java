import java.util.Scanner;
// import java.io.*;

public class TI {

	public static void main(String[] args) {
		new soma();
	}
}

class soma {
	public soma() {
		try (Scanner input = new Scanner(System.in)) {
			int a, x;
			System.out.print("1 numero : ");
			a = input.nextInt();
			System.out.print("2 numero : ");
			x = input.nextInt();
			System.out.println(a + " + " + x + " = " + (a + x));
		}
	}
}