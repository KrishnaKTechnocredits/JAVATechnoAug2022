package snehalJojare;

class Calender{
	public static void main(String[] args){
		Calender calender = new Calender();
		calender.dayOfweek(1);
		calender.dayOfweek(2);
		calender.dayOfweek(7);
		calender.dayOfweek(-3);
		calender.dayOfweek(13);
		calender.dayTypeofweek(1);
		calender.dayTypeofweek(2);
		calender.dayTypeofweek(6);
		calender.dayTypeofweek(-3);
		calender.quarterofYear(2);
		calender.quarterofYear(4);
		calender.quarterofYear(9);
		calender.quarterofYear(11);
		calender.quarterofYear(-20);
	}
	
	void dayOfweek(int dayIndex){
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
	
	void dayTypeofweek(int dayIndex){
		if(dayIndex == 1 || dayIndex ==2 || dayIndex == 3 || dayIndex == 4 || dayIndex == 5)
			System.out.println("Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid dayIndex");
		
	}
	
	void quarterofYear(int monthIndex){
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