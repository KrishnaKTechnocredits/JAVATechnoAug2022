package swapnilMaheshwari.ArrayPrograms;

public class SumOfArrayElements {
	int sum = 0;

	int getArrayElementSum(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
		int[] num = { 10, 20, 30, 40 };
		System.out.println("The sum of the given array is :" + sumOfArrayElements.getArrayElementSum(num));
	}
}
