package harshalRane;

class Days{

	void findDay(int dayIndex){
		if(dayIndex == 1)
		{
			System.out.println("Monday");
		}
		else if(dayIndex == 2)
		{
			System.out.println("Tuesday");
		}
		else if(dayIndex == 3)
		{
			System.out.println("Wednesday");
		}
		else if(dayIndex == 4)
		{
			System.out.println("Thursday");
		}
		else if(dayIndex == 5)
		{
			System.out.println("Friday");
		}
		else if(dayIndex == 6)
		{
			System.out.println("Saturday");
		}
		else if(dayIndex == 7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Index");
		}
	}
	
	void weekDay(int dayIndex){
		if(dayIndex >=1 && dayIndex <=5)
		{
			System.out.println("It is a Weekday");
		}
		else if(dayIndex ==6 || dayIndex ==7)
		{
			System.out.println("It is a Weekend");
		}
		else
		{
			System.out.println("Invalid Index");
		}
			
	}
	
	void quarter(int monthIndex){
		if(monthIndex >=1 && monthIndex <=3)
		{
			System.out.println("FY2022 Q1");
		}
		else if(monthIndex >=4 && monthIndex <=6)
		{
			System.out.println("FY2022 Q2");
		}
		else if(monthIndex >=7 && monthIndex <=9)
		{
			System.out.println("FY2022 Q3");
		}
		else if(monthIndex >=10 && monthIndex <=12)
		{
			System.out.println("FY2022 Q4");
		}
		else
		{
			System.out.println("Invalid Index");
		}
			
	} 
	
	public static void main(String[] args){
		Days days = new Days();
		days.findDay(-3);
		days.findDay(13);
		days.findDay(3);
		System.out.println("\n");
		days.weekDay(-3);
		days.weekDay(8);
		days.weekDay(2);
		days.weekDay(6);
		System.out.println("\n");
		days.quarter(1);
		days.quarter(4);
		days.quarter(7);
		days.quarter(11);
		days.quarter(13);
	}
}