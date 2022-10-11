/* Find weekdays or weekends based on dayIndex.
1 -> Weekday
2 -> Weekday
6 -> Weekend
dayIndex -> -3 : Invalid Index
Note : 1 to 5 index should be considered weekdays, 6 & 7 should be considered weekend*/

package namratamishra.Basic_Operations;

import java.util.*;

public class WeekdayorWeekendsBasedonDayIndex {

	void getWeekdayorWeekendsBasedonDayIndex(int dayNum) {

		if (dayNum >= 1 && dayNum <= 5)
			System.out.println(dayNum + ":......>Weekday");
		else if (dayNum == 6 || dayNum == 7)
			System.out.println(dayNum + ":......>Weekends");
		else
			System.out.println(dayNum + ":......>Invalid Index");
	}

	public static void main(String[] args) {
		WeekdayorWeekendsBasedonDayIndex wdorwe = new WeekdayorWeekendsBasedonDayIndex();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter day Index");
		int a = sc.nextInt();
		wdorwe.getWeekdayorWeekendsBasedonDayIndex(a);
		sc.close();

	}
}
