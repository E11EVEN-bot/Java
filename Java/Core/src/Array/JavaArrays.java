package Array;

public class JavaArrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Declaration of an Array
		//dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
		int [] Array;

		// Declaring array with input
		double[] phone_numbers = {1010,2020,3030,4040,5050};
		
		// Creating an array with given size ... Allocating memory to array
		int[] arr = new int[10];
		double[] arr2 = new double[20];
		
		for(int i=0;i<10;i++) {
			arr[i]=i;
		}
		for(int no:arr)
		System.out.print(no);
	}	
	

}
