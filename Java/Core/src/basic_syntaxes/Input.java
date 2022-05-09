package basic_syntaxes;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Int: ");
		int a = input.nextInt();
		System.out.print("Enter float: ");
		float b = input.nextFloat();
		System.out.print("Enter double: ");
		double c = input.nextDouble();
		System.out.print("Enter boolean: ");
		boolean d = input.nextBoolean();

		System.out.println("Entered No's are \n" + a + "\n" + b + "\n" + c + "\n" + d);
		
		input.close();
	}
	
}
