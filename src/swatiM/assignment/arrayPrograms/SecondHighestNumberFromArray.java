package swatiM.assignment.arrayPrograms;

public class SecondHighestNumberFromArray {

	int getSecondHigestNumberFromArray(int[] input) {
		int maximumNum = input[0];
		int secondHighestnum = 0;
		for (int index = 0; index < input.length; index++) {
			if (maximumNum < input[index]) {
				secondHighestnum = maximumNum;
				maximumNum = input[index];
			} else if (secondHighestnum < input[index]) {
				secondHighestnum = input[index];
			}
		}
		return secondHighestnum;
	}

	public static void main(String[] args) {
		SecondHighestNumberFromArray secondHighestNumberFromArray = new SecondHighestNumberFromArray();
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second highest number from given array is : "
				+ secondHighestNumberFromArray.getSecondHigestNumberFromArray(input));

	}

}
