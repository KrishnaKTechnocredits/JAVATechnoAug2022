package pujaSah.sssignments1_10;

public class InitialAssignmentNumberAddition {
	void processData(int firstIndex, int lastIndex) {
		int sum = 0;
		for (int index = firstIndex; index <= lastIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of " + firstIndex + " to " + lastIndex + " is: " + sum);
	}

	public static void main(String[] args) {
		InitialAssignmentNumberAddition initialAssignmentNumberAddition = new InitialAssignmentNumberAddition();
		initialAssignmentNumberAddition.processData(10, 20);
	}
}
