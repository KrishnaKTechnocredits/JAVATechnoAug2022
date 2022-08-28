/* Assignment - 4 : 23rd Aug'2022

Please create single class and write 3 methods to fulfil below requirements

Program 1: Find a day based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday
dayIndex -> -3 : Invalid Index
dayIndex -> 13 : Invalid Index

Program 2: Find weekdays or weekend based on dayIndex.
1 -> Weekday
2 -> Weekday
6 -> Weekend
dayIndex -> -3 : Invalid Index
Note : 1 to 5 index should be consider as weekdays, 6 & 7 should be consider as weekend

Program 3 : Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid*/

package rahulSaswadkar;

class Calendar{
	public static void main(String[] args){
		Calendar calendar = new Calendar();
		calendar.dayOfWeek(1);
		calendar.dayOfWeek(2);
		calendar.dayOfWeek(7);
		calendar.dayOfWeek(-3);
		calendar.dayOfWeek(13);
		calendar.dayTypeOfWeek(1);
		calendar.dayTypeOfWeek(2);
		calendar.dayTypeOfWeek(6);
		calendar.dayTypeOfWeek(-3);
		calendar.quarterOfYear(2);
		calendar.quarterOfYear(4);
		calendar.quarterOfYear(9);
		calendar.quarterOfYear(11);
		calendar.quarterOfYear(-20);
	}
	
	void dayOfWeek(int dayIndex){
		if(dayIndex == 1)
			System.out.println("Today's day of the week : Monday");
		else if(dayIndex == 2)
			System.out.println("Today's day of the week : Tuesday");
		else if(dayIndex == 3)
			System.out.println("Today's day of the week : Wednesday");
		else if(dayIndex == 4)
			System.out.println("Today's day of the week : Thursday");
		else if(dayIndex == 5)
			System.out.println("Today's day of the week : Friday");
		else if(dayIndex == 6)
			System.out.println("Today's day of the week : Saturday");
		else if(dayIndex == 7)
			System.out.println("Today's day of the week : Sunday");
		else 
			System.out.println("Invalid dayIndex");
			
	}
	
	void dayTypeOfWeek(int dayIndex){
		//Control moves to next statement as soon as first condition satisfies because 'OR' Operater has been used.
		if(dayIndex == 1 || dayIndex == 2 || dayIndex == 3 || dayIndex == 4 || dayIndex == 5)
			System.out.println("Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid dayIndex");
		
		if(dayIndex >=1 && dayIndex<= 5)
			System.out.println("Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid dayIndex");
		
		//if(dayIndex between(1,5))
			System.out.println("Weekday");
			
	}
		
	void quarterOfYear(int monthIndex){
		if(monthIndex == 1 || monthIndex == 2 || monthIndex == 3)
			System.out.println("FY2022 Q1");
		else if(monthIndex == 4 || monthIndex == 5 || monthIndex == 6)
			System.out.println("FY2022 Q2");
		else if(monthIndex == 7 || monthIndex == 8 || monthIndex == 9)
			System.out.println("FY2022 Q3");
		else if(monthIndex == 10 || monthIndex == 11 || monthIndex == 12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid monthIndex");
	}
} 
	

