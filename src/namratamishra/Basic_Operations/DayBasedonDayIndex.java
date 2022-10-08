/*Find a day based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday
dayIndex -> -3 : Invalid Index
dayIndex -> 13 : Invalid Index*/

package namratamishra.Basic_Operations;

import java.util.*;

public class DayBasedonDayIndex {

	void getDayBasedonDayIndex(int dayNum) {

		if (dayNum == 1)
			System.out.println(dayNum + ":......>Monday");
		else if (dayNum == 2)
			System.out.println(dayNum + ":......>Tuesday");
		else if (dayNum == 3)
			System.out.println(dayNum + ":......>Wednesday");
		else if (dayNum == 4)
			System.out.println(dayNum + ":......>Thursday");
		else if (dayNum == 5)
			System.out.println(dayNum + ":......>Friday");
		else if (dayNum == 6)
			System.out.println(dayNum + ":......>Saturday");
		else if (dayNum == 7)
			System.out.println(dayNum + ":......>Sunday");
		else
			System.out.println(dayNum + ":......>Invalid Index");
	}

	public static void main(String[] args) {
		DayBasedonDayIndex dbde = new DayBasedonDayIndex();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter day Index");
		int a = sc.nextInt();
		dbde.getDayBasedonDayIndex(a);
		sc.close();

	}
}
