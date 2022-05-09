package controlFlow;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// Print Infinite
		int n = 5;

		for (int i = 0; i < n; i++) {
			System.out.print(i);
		}
		main();
	}
	
	public static void main(){
		Scanner input= new Scanner(System.in);
		System.out.println("\nEnter a number :");
		int no = input.nextInt();
		
		for(int i=1; i<=10;i++) {
			System.out.printf("%d x %d = %d\n",no,i,no*i);
		}
	input.close();
	}

}
