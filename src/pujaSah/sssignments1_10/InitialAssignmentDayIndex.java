package pujaSah.sssignments1_10;

public class InitialAssignmentDayIndex {

	void processData(int x) {
		System.out.println("Day No: " + x);
		if (x >= 1 && x <= 5) {
			System.out.println("Its a Week Day");
		} else if (x == 6 || x == 7) {
			System.out.println("Its a Weekend");
		} else
			System.out.println("Its an Invalid Day");
	}

	public static void main(String[] args) {
		InitialAssignmentDayIndex initialAssignmentDayIndex = new InitialAssignmentDayIndex();
		initialAssignmentDayIndex.processData(6);
		initialAssignmentDayIndex.processData(2);
		initialAssignmentDayIndex.processData(9);
	}
}
