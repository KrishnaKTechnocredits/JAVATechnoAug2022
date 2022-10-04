package nikeshM.ArrayCode;

public class MaximumNumber {

	int getMaximumNumber(int[] input) {
		int length = input.length;
		int maxNumber = input[0];
		for (int index = 0; index < input.length; index++) {

			if (input[index] > maxNumber) {
				maxNumber = input[index];
			}

		}
		System.out.println( " Maximum No is "+ maxNumber);
		return length;
	}

	public static void main(String[] args) {
		MaximumNumber max = new MaximumNumber();
		int[] input = { 11, 4, 55, 23, 43 };
		max.getMaximumNumber(input);

	}
}
