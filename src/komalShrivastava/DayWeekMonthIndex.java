package komalShrivastava;

class DayWeekMonthIndex{

	void dayIndex(int day){
		if(day == 1)
			System.out.println("Day Index for " + day + " : Monday");
		else if(day == 2)
			System.out.println("Day Index for " + day + " : Tuesday");
		else if(day == 3)
			System.out.println("Day Index for " + day + " : Wednesday");
		else if(day == 4)
			System.out.println("Day Index for " + day + " : Thursday");
		else if(day == 5)
			System.out.println("Day Index for " + day + " : Friday");
		else if(day == 6)
			System.out.println("Day Index for " + day + " : Saturday");
		else if(day == 7)
			System.out.println("Day Index for " + day + " : Sunday");
		else
			System.out.println("Invalid Index");		
	}		
	void weekIndex(int weekDay){
		if(weekDay > 1 && weekDay <= 5)
			System.out.println("Week Index for day " + weekDay + " : Weekday");
		else if(weekDay == 6 || weekDay == 7)
			System.out.println("Week Index for day " + weekDay + " : Weekend");
		else 
			System.out.println("Invalid Index");	
	}
	
	void monthIndex(int month){
		if(month >= 1 && month <= 3)
			System.out.println("Month " + month + " falls into FY2022 Q1");
		else if(	month >= 4 && month <=6)
			System.out.println("Month " + month + " falls into FY2022 Q2");
		else if(	month >= 7 && month <=9)
			System.out.println("Month " + month + " falls into FY2022 Q3");
		else if(	month >= 10 && month <=12)
			System.out.println("Month " + month + " falls into FY2022 Q4");	
		else
			System.out.println("Invalid Month");
	}
	
	public static void main(String[] args){
		DayWeekMonthIndex dayWeekMonthIndex = new DayWeekMonthIndex();
		dayWeekMonthIndex.dayIndex(4);
		dayWeekMonthIndex.weekIndex(6);
		dayWeekMonthIndex.monthIndex(11);
	}	
}	