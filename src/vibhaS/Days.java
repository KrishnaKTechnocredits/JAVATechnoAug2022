package vibhaS;
class Days{
	
	void dayIndexDay(int dayIndex){
		if(dayIndex==1)
			System.out.println("Today is Monday");
		else if(dayIndex==2)
			System.out.println("Today is Tuesday");
		else if(dayIndex==3)
			System.out.println("Today is Wednesday");
		else if(dayIndex==4)
			System.out.println("Today is Thusday");
		else if(dayIndex==5)
			System.out.println("Today is Friday");
		else if(dayIndex==6 )
			System.out.println("Today is Saturday");
		else if(dayIndex==7)
			System.out.println("Today is Sunday");
		else 
			System.out.println("Invalid Index");
	}
	
	void weekIndexDay(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("Today is weekday");
		else if(dayIndex==6 || dayIndex==7)
			System.out.println("Today is weekday");
		else
			System.out.println("today is weekend");
	}
	
	void quater(int monthIndex){
		if(monthIndex==1 || monthIndex==2 || monthIndex==3)
			System.out.println("FY2022 Q1");
		else if(monthIndex==4 || monthIndex==5 || monthIndex==6)
			System.out.println("FY2022 Q2");
		else if(monthIndex==7 || monthIndex==8 || monthIndex==9)
			System.out.println("FY2022 Q3");
		else if(monthIndex==10 || monthIndex==11 || monthIndex==12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid! Quater Value");
		}
	
	public static void main(String[] args){
		Days days =new Days();
		days.dayIndexDay(-3);
		days.dayIndexDay(13);
		days.dayIndexDay(5);
		System.out.println("");
		days.weekIndexDay(-3);
		days.weekIndexDay(4);
		days.weekIndexDay(6);
		System.out.println("");
		days.quater(1);
		days.quater(4);
		days.quater(7);
		days.quater(10);
		days.quater(13);
	}
}