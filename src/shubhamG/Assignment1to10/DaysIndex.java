package shubhamG.Assignment1to10;

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

Program 3 : Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid
*/


class DaysIndex{

	void days(int day){
		if(day==1)
			System.out.println("Its Monday");
		
		else if(day==2)
			System.out.println("Its Tuesday");		
			
		else if(day==3)
			System.out.println("Its Wednesday");
			
		else if(day==4)
			System.out.println("Its Thursday");
				
		else if(day==5)
			System.out.println("Its Friday");
			
		else if(day==6)
			System.out.println("Its Saturday");
		
		else if(day==7)
			System.out.println("Its Sunday");
			
		else
			System.out.println("Its invalid day");
	}
	
	void weekdays(int index){
		if(index>=1 && index<=5)
			System.out.println("Its Weekday");
		
		else if(index>=6 && index<=7)
			System.out.println("Its Weekend");		
			
		else
			System.out.println("Its invalid data");
	}
	
	void quater(int month){
		if(month==1 || month==2 || month==3)
			System.out.println("FY2022 Quater 1");
		
		else if(month==4 || month==5 || month==6)
			System.out.println("FY2022 Quater 2");
		
		else if(month==7 || month==8 || month==9)
			System.out.println("FY2022 Quater 3");
		
		else if(month==10 || month==11 || month==12)
			System.out.println("FY2022 Quater 4");
		
		else
			System.out.println("Its invalid data");
	}

	public static void main(String[] args ){
		DaysIndex daysindex = new DaysIndex();
		daysindex.days(2);
		daysindex.days(7);
		daysindex.days(8);
		daysindex.weekdays(2);
		daysindex.weekdays(7);
		daysindex.weekdays(8);
		daysindex.quater(2);
		daysindex.quater(7);
		daysindex.quater(14);
		
	}	
}