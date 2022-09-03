package pujaSah.assignments1_10;

public class NumberAddition {
	void processData(int firstIndex, int lastIndex) {
		int sum = 0;
		for (int index = firstIndex; index <= lastIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of " + firstIndex + " to " + lastIndex + " is: " + sum);
	}

	public static void main(String[] args) {
		NumberAddition numberAddition = new NumberAddition();
		numberAddition.processData(10, 20);
	}
}
