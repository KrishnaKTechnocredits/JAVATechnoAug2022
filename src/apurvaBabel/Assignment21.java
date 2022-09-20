package apurvaBabel;

public class Assignment21 {
	// Method to return 2nd highest number from given array
	int getSecondHighestNumber(int[] input) {
		int maxNum = input[0];
		int secondMaxNum = 0;

		for (int index = 1; index < input.length; index++) {
			if (maxNum < input[index]) {
				secondMaxNum = maxNum;
				maxNum = input[index];
			} else if (secondMaxNum < input[index]) {
				secondMaxNum = input[index];
			}
		}
		return secondMaxNum;
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second highest number from given array is : " + assignment21.getSecondHighestNumber(input));
	}
}
