/*Please create single class and write 3 methods to fulfill below requirements

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

Program 3 : Find Quarter based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid
*/
package asthaSrivastava.assignments;

public class Calender {					//Program 1
	void processData(int dayIndex) {
		if(dayIndex==1)
			System.out.println("Today's day is Monday");
		else if(dayIndex==2)
			System.out.println("Today's day is Tuesday");
		else if(dayIndex==3)
			System.out.println("Today's day is Wednesday");
		else if(dayIndex==4)
			System.out.println("Today's day is Thursday");
		else if(dayIndex==5)
			System.out.println("Today's day is Friday");
		else if(dayIndex==6)
			System.out.println("Today's day is Saturday");
		else if(dayIndex==7)
			System.out.println("Today's day is Sunday");
		else 
			System.out.println("Invalid Index");
	}
	
	void CalenderDayAndEnd(int day){		//Program2
		if(day>=1 && day<=5)
			System.out.println("Oh No! It is still Weekday");
		else if(day>=6 && day<=7)
			System.out.println("Yay. Weekend is here");
		else 
			System.out.println("No such day exist");
	}
	
	void quarter(int month){    //Program3
		if(month==1 || month==2 || month==3)
			System.out.println("This is FY2022 Q1");
		else if(month==4 || month==5 || month==6)
			System.out.println("This is FY2022 Q2");
		else if(month==7 || month==8 || month==9)
			System.out.println("This is FY2022 Q3");
		else if(month==10 || month==11 || month==12)
			System.out.println("This is FY2022 Q4");
		else
			System.out.println("Invalid Input");
	}
	
	public static void main(String[] args) {
		Calender calender = new Calender();
		
		calender.processData(1);
		calender.processData(2);
		calender.processData(7);
		calender.processData(-3);
		calender.processData(13);
		calender.CalenderDayAndEnd(2);
		calender.CalenderDayAndEnd(4);
		calender.CalenderDayAndEnd(7);
		calender.CalenderDayAndEnd(-3);
		calender.quarter(1);
		calender.quarter(5);
		calender.quarter(7);
		calender.quarter(12);
		calender.quarter(19);
	}
}