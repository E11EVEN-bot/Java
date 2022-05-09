// Check if age is > 18
package controlFlow;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a age");
		int a = input.nextInt();
		if (a > 18) {
			System.out.println(" Candidate is older than 18 ");
		} 
		else if (a==18) {
			System.out.println(" Candidate is 18 ");
		}
			
		
		else {
			System.out.println(" Candidate is less than 18 ");
		}
	input.close();
	}

}
