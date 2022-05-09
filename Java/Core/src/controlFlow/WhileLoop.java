package controlFlow;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		whileloop();
		whileadd();
	}
	
	
// Functions // Methods
	private static void whileadd() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive no to be added");
		int i = input.nextInt();
		int result = 0;

		while (i > 0) {
			result += i;
			System.out.println("no : " + result);
			i = input.nextInt();
		}
		System.out.println("Negative number entered : "+i);
		System.out.println("Final Result = "+result);
		input.close();
	}
	
	// Method normal while loop
	private static void whileloop() {
		int i = 0;
		int n = 5;

		while (i < n) {
			System.out.println(i + " " + n);
			i++;
	}
}
}