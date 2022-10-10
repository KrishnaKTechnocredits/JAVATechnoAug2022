package apurvaBabel.Test;

public class Test2 {
	void findRequiredNumbers(int targetNumber) {
		int count = 0;
		int sum = 0;
		int num = 1;

		while (sum < targetNumber) {
			sum = sum + num;
			count++;
			num++;
		}
		System.out.println("Sum of first " + count + " numbers is near to " + targetNumber);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.findRequiredNumbers(50);
	}
}
