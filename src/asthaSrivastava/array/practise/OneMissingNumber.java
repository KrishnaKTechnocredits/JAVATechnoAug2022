package asthaSrivastava.array.practise;

public class OneMissingNumber {

	void getOneMissingNumber(int[] arr) {
		int expectedSum = 0;
		int actualSum = 0;

		for (int num : arr) {
			expectedSum += num;
			actualSum = (num * (num + 1) / 2);
		}
		System.out.println("Missing Number is :" +(actualSum - expectedSum));
	}

	public static void main(String[] args) {
		OneMissingNumber test = new OneMissingNumber();
		int[] input = { 1, 2, 3, 5, 6 };
		test.getOneMissingNumber(input);
	}
}
