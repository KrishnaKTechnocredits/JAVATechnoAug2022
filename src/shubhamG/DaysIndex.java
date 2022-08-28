package shubhamG;

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