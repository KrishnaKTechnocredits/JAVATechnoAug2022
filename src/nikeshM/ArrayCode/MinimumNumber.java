package nikeshM.ArrayCode;

public class MinimumNumber {
	int getMinimumNumber(int[] input) {
		int length = input.length;
		int minNumber = input[0];
		for (int index = 0; index < input.length; index++) {

			if (input[index] < minNumber) {
				minNumber = input[index];
			}

		}
		System.out.println("Minimum No is " + minNumber);
		return length;
	}

	public static void main(String[] args) {
		MinimumNumber min = new MinimumNumber();
		int[] input = { 11, 4, 55, 23, 43 };
		min.getMinimumNumber(input);
	}
}
