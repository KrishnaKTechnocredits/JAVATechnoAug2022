package smitaVetal.Basic;

class Calendar{
	void weekIndex(int week){
		if(week >=1 && week <=5)
			System.out.println (week+" is weekday");
		else if(week >=6 && week <=7)
			System.out.println(week+ " is weekend");
		else
			System.out.println(week + " Is Invalid WeekIndex");
	}
	
	void monthIndex(int month){
		if(month >=1 && month <=3)
			System.out.println(month +" falls under FY2022 Q1");
		else if(month >=4 && month <=6)
			System.out.println(month +" falls under FY2022 Q2");
		else if(month >=7 && month <=9)
			System.out.println(month +" falls under FY2022 Q3");
		else if(month >=10 && month <=12)
			System.out.println(month +" falls under FY2022 Q4");
		else
			System.out.println(month +" Is Invalid MonthIndex");
	}
	
	void dayIndex(int day){
		if(day == 1)
			System.out.println("Monday");
		else if(day==2)
			System.out.println("Tuesday");
		else if(day==3)
			System.out.println("Wednesday");
		else if(day==4)
			System.out.println("Thursday");
		else if(day==5)
			System.out.println("Friday");
		else if(day==6)
			System.out.println("Saturday");
		else if(day==7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid Day Index");
	}
		
	public static void main(String[] args){
		Calendar calendar= new Calendar();
		calendar.weekIndex(4);
		calendar.weekIndex(7);
		calendar.weekIndex(0);
		calendar.weekIndex(-9);
		calendar.monthIndex(2);
		calendar.monthIndex(4);
		calendar.monthIndex(9);
		calendar.monthIndex(10);
		calendar.monthIndex(-9);
		calendar.dayIndex(5);
		calendar.dayIndex(8);
		calendar.dayIndex(7);
	}
}