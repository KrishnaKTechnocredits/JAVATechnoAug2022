package asthaSrivastava;

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