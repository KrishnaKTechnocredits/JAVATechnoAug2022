
/*Assignment - 4 : 23rd Aug'2022
Please create single class and write 3 methods to fulfill below requirements

Program 1: Find a day based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday
dayIndex -> -3 : Invalid Index
dayIndex -> 13 : Invalid Index

Program 2: Find weekdays or weekends based on dayIndex.
1 -> Weekday
2 -> Weekday
6 -> Weekend
dayIndex -> -3 : Invalid Index
Note : 1 to 5 index should be considered weekdays, 6 & 7 should be considered weekend

Program 3 : Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid
*/
package nilamP.assignment1to16;

public class Assignment4 {
	void processData(int x) {
		System.out.println("Day Number: " + x);
		if (x == 1) {
			System.out.println("It's Monday");
		} else if (x == 2) {
			System.out.println("It's Tuesday");
		} else if (x == 3) {
			System.out.println("It's Wednesday");
		} else if (x == 4) {
			System.out.println("It's Thursday");
		} else if (x == 5) {
			System.out.println("It's Friday");
		} else if (x == 6) {
			System.out.println("It's Saturday");
		} else if (x == 7) {
			System.out.println("It's Sunday");
		} else
			System.out.println("It's an Invalid Day");
	}

	int day = 1;

	void weekdays(int day) {
		if (day >= 1 && day <= 5) {
			System.out.println("It's Weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It's Weekend");
		} else {
			System.out.println("Invalid Day Index Entry");
		}

	}

	void quarter(int month) {
		if (month == 1 || month == 2 || month == 3)
			System.out.println("FY2022 Q1");
		else if (month == 4 || month == 5 || month == 6)
			System.out.println("FY2022 Q2");
		else if (month == 7 || month == 8 || month == 9)
			System.out.println("FY2022 Q3");
		else if (month == 10 || month == 11 || month == 12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid Number");
	}

	public static void main(String[] args) {

		Assignment4 a = new Assignment4();
		System.out.println("Assignment 4 output : ");
		System.out.println("Program 1 output : ");
		a.processData(1);
		a.processData(2);
		a.processData(7);
		a.processData(-3);
		a.processData(13);
		System.out.println("Program 2 output : ");
		a.weekdays(1);
		a.weekdays(2);
		a.weekdays(6);
		a.weekdays(-3);
		System.out.println("Program 3 output : ");
		a.quarter(1);
		a.quarter(5);
		a.quarter(8);
		a.quarter(11);
		a.quarter(13);
	}
}
