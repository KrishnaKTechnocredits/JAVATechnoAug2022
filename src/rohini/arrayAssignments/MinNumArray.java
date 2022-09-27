package rohini.arrayAssignments;
//Assignment 19
//Program 4: Return minimum number from Array
public class MinNumArray {
	int returnMinNum(int[] inputArray) {
		int min = inputArray[0];
		System.out.print("Array elements: ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(+inputArray[i] + ",");
			if (inputArray[i] < min) {
				min = inputArray[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] input = { 11, 4, 55, 23, 43 };
		System.out.println("\nMinimum number from Array: " + new MinNumArray().returnMinNum(input));
	}
}
