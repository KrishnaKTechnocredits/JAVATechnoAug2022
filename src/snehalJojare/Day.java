package snehalJojare;

class Day{
	
	void dayIndex( int day){
	if(day == 1 )
		System.out.println("The day is Monday");
	else if(day == 2 )
		System.out.println("The day is Tuesday");
	else if(day == 3 )
		System.out.println("The day is Wednesday");
	else if(day == 4 )
		System.out.println("The day is Thursday");
	else if(day == 5 )
		System.out.println("The day is Friday");
	else if(day == 6 )
		System.out.println("The day is Saturday");
	else if(day == 7 )
		System.out.println("The day is Sunday");
	else
		System.out.println("Invalid index");
	}
	
	void weekdayIndex(int day){
		if(day>=1 && day<=5){
			System.out.println("This is Weekday");
		}else if(day>=6 && day<=7 ){
			System.out.println("This is Weekend");
		}else
			System.out.println("Invalid index");
	} 
	
	void monthIndex(int monthIndex){
		if(monthIndex == 1 || monthIndex == 2 || monthIndex ==3)
			System.out.println("This is FY2022 Q1");
		else if(monthIndex == 7 || monthIndex == 5 || monthIndex ==6)
			System.out.println("This is FY2022 Q2");
		else if(monthIndex == 7 || monthIndex == 8 || monthIndex ==9)
			System.out.println("This is FY2022 Q3");
		else if(monthIndex == 10 || monthIndex == 11 || monthIndex ==12)
			System.out.println("This is FY2022 Q4");
		else
			System.out.println("This is invalid month index");
	}
	
	public static void main (String[] args){
		Day day = new Day ();
		day.dayIndex(3);
		day.dayIndex(-3);
		day.weekdayIndex(4);
		day.weekdayIndex(15);
		day.monthIndex(1);
		day.monthIndex(100);
		}
	
}

