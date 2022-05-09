package controlFlow;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		whileloop();
		whileAdd();
	}

	private static void whileloop() {
		int i = 1;

		do {
			System.out.print(i);
			i++;
		} while (i < 10);
	}

	private static void whileAdd() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int i = input.nextInt(), result = 0;

		do {
			result += i;
			System.out.println("Result :" + result);
			if (i < 0) {
				break;
			}
			System.out.println("\nEnter a number");
			i = input.nextInt();
		} while (i > 0);
		System.out.println("***Negative Number Entered :" + i);
		System.out.println("Result = " + result);
		input.close();
	}
}
