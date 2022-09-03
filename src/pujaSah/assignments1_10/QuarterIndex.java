package pujaSah.assignments1_10;

public class QuarterIndex {

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

		QuarterIndex quarterIndex = new QuarterIndex();
		quarterIndex.processData(5);
		quarterIndex.processData(9);
		quarterIndex.processData(2);
		quarterIndex.processData(20);
	}
}
