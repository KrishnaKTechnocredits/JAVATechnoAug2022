package pujaSah.sssignments1_10;

public class InitialAssignmentNumberCount {
	
	void processData() {
		int count = 0;
		for (int index = 1; index <= 100; index++) {
			if (index % 3 == 0 && index % 7 == 0) {
				count++;
			}
		}
		System.out.println("Count of numbers from 1 to 100 that are divisible by both 3 and 7 is: " + count);
	}

	public static void main(String[] args) {
		InitialAssignmentNumberCount initialAssignmentNumberCount = new InitialAssignmentNumberCount();
		initialAssignmentNumberCount.processData();
	}
}
