package controlFlow;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 1-5");
		int number = input.nextInt();

		switch (number) {

		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("TWo");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;

		default:
			System.out.println("Number should be Between 1-5");
			break;
		}

		input.close();
	}

}
