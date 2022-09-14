package rohanNaik.basicPrograms;

class Funday {

	void day(int dayIndex) {
		if (dayIndex == 1)
			System.out.println("Monday");
		else if (dayIndex == 2)
			System.out.println("Tuesday");
		else if (dayIndex == 3)
			System.out.println("Wednesday");
		else if (dayIndex == 4)
			System.out.println("Thursday");
		else if (dayIndex == 5)
			System.out.println("Friday");
		else if (dayIndex == 6)
			System.out.println("Saturday");
		else if (dayIndex == 7)
			System.out.println("Sunday");
		else if (dayIndex <= 0 || dayIndex >= 8)
			System.out.println("Invalid Index");
	}

	void week(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 5)
			System.out.println("Weekday");
		else if (dayIndex == 6 || dayIndex == 7)
			System.out.println("WeekEnd");
		else if (dayIndex <= 0 || dayIndex >= 8)
			System.out.println("Invalid Index");
	}

	void month(int monthIndex) {
		if (monthIndex >= 1 && monthIndex <= 3)
			System.out.println("FY2022 Q1");
		else if (monthIndex >= 4 && monthIndex <= 6)
			System.out.println("FY2022 Q2");
		else if (monthIndex >= 7 && monthIndex <= 9)
			System.out.println("FY2022 Q3");
		else if (monthIndex >= 10 && monthIndex <= 12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid Month Index");
	}

	public static void main(String[] args) {
		Funday funday = new Funday();
		System.out.println("------------------------------");
		funday.day(1);
		funday.day(2);
		funday.day(7);
		funday.day(-3);
		funday.day(13);
		System.out.println("------------------------------");
		funday.week(1);
		funday.week(5);
		funday.week(7);
		funday.week(-1);
		funday.week(8);
		System.out.println("------------------------------");
		funday.month(1);
		funday.month(5);
		funday.month(7);
		funday.month(-1);
		funday.month(13);
		System.out.println("------------------------------");
	}
}