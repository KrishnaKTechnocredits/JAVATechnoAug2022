package pujaSah.assignments1_10;

public class DayIndex {

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
		DayIndex dayIndex = new DayIndex();
		dayIndex.processData(6);
		dayIndex.processData(2);
		dayIndex.processData(9);
	}
}
