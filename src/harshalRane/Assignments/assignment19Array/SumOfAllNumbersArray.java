package harshalRane.Assignments.assignment19Array;

public class SumOfAllNumbersArray {
	int sumOfArray(int[] array) {
		int sum = 0;
		int temp = 0;
		System.out.print("Array Elements are:");
		for (int index = 0; index < array.length; index++) {
			temp = array[index];
			System.out.print(temp + " ");
			sum = sum + temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfAllNumbersArray arr = new SumOfAllNumbersArray();
		int[] array = { 10, 11, 15 };
		System.out.println("\nSum of array elements is: " + arr.sumOfArray(array));
	}
}