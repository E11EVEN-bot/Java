package Array;

public class ArraySumAverage {
	public static void main(String[] args) {
		sum();
		int a= average();
		System.out.println("\nAverage = "+a);
	}

	private static void sum() {
		int result = 0; 
		int[] arr = {1,2,3,4,5,6,7};
		for(int no:arr) {
			result+=no;
		}
		System.out.print("Sum = " + result);
		}

	private static int average() {
		int result = 0;
		int[] arr = {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++) {
			result += arr[i];
		}
		int average = result / arr.length;
		return average;
	}
}
