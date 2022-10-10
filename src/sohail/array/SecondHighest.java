//Return second highest from given array.
//input : {10,99,33,44,89,76}
//output : 89
package sohail.array;
public class SecondHighest {
	int getSecondHighestNumber(int[] inputArray) {
		int max = 0;
		int secondMax = 0;
		for (int index = 0; index < inputArray.length; index++) {
			int value = inputArray[index];
			if (max < inputArray[index]) {
				max = inputArray[index];
			} else if (secondMax < inputArray[index]) {
				secondMax = inputArray[index];
			}
		}

		return secondMax;
	}

	public static void main(String[] args) {
		SecondHighest secondHighest = new SecondHighest();
		int[] inputArray = { 10, 99, 33, 44, 89, 76 };
		int secondHighestNumber = secondHighest.getSecondHighestNumber(inputArray);
		System.out.println(secondHighestNumber);

	}

}