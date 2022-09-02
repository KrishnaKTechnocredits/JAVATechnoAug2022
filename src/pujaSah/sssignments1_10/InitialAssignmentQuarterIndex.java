package pujaSah.sssignments1_10;

public class InitialAssignmentQuarterIndex {

	void processData(int x) {
		System.out.println("Month No: " + x);
		if (x >= 1 && x <= 3) {
			System.out.println("Its FY22 Quarter:1");
		} else if (x >= 4 && x <= 6) {
			System.out.println("Its FY22 Quarter:2");
		} else if (x >= 7 && x <= 9) {
			System.out.println("Its FY22 Quarter:3");
		} else if (x >= 10 && x <= 12) {
			System.out.println("Its FY22 Quarter:3");
		} else
			System.out.println("Its an Invalid Month");
	}

	public static void main(String[] args) {

		InitialAssignmentQuarterIndex initialAssignmentQuarterIndex = new InitialAssignmentQuarterIndex();
		initialAssignmentQuarterIndex.processData(5);
		initialAssignmentQuarterIndex.processData(9);
		initialAssignmentQuarterIndex.processData(2);
		initialAssignmentQuarterIndex.processData(20);
	}
}
