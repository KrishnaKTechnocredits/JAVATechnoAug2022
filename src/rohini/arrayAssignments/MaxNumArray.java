package rohini.arrayAssignments;
//Assignment 19
//Program 3: Return max number from Array
public class MaxNumArray {
	int max = 0;
	int returnMax(int[] input) {
		System.out.print("Array elements: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(+input[i] + ",");
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] input = { 11, 4, 55, 23, 43 };
		System.out.println("\nMaximum number from Array: " + new MaxNumArray().returnMax(input));
	}
}
