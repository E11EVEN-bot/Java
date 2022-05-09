package controlFlow;

public class ForEach {

	public static void main(String[] args) {
		
		int sum=0;
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		
		for (int no :numbers) {
			System.out.print(no);
			sum+=no;
		}
		System.out.println("\n" + sum);
	}

}
