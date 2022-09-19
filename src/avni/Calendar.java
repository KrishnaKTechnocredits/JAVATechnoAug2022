package avni;
class Calendar{	

	void dayIndex(int dayIndex){
		if(dayIndex==1)
			System.out.println("monday");
		else if(dayIndex==2)
			System.out.println("tuesday");
	    else if(dayIndex==3)
			System.out.println("wednesday");
		else if(dayIndex==4)
			System.out.println("thursday");
		else if(dayIndex==5)
			System.out.println("friday");
		else if(dayIndex==6)
			System.out.println("saturday");
		else if(dayIndex==7)
			System.out.println("sunday");
		else
			System.out.println("Given input is invalid.");
	}
	
	void weekIndex(int week){
		if(week>0 && week<=5)
			System.out.println("week days");
		else if(week==0||week==7)
				System.out.println("weekend days");
		else
			System.out.println("invelid days");
	}
	
	void monthIndex(int month){
		if(month>=1 && month<=3)
			System.out.println("month is in FY2022 01");
		else if(month>=4 && month<=6)
			System.out.println("month is in FY2022 02");
		else if(month>=7 && month<=9)
			System.out.println("month is in FY2022 03");
		else if (month>=10 && month<=12)
			System.out.println("month is in FY2022 04");
		else 
			System.out.println("invelid month");
	}
	
	public static void main(String[] args){
		Calendar calendar = new Calendar();
		calendar.dayIndex(1);
		calendar.dayIndex(2);
		calendar.dayIndex(7);
		calendar.dayIndex(-3);
		calendar.dayIndex(13);
		calendar.weekIndex(1);
		calendar.weekIndex(6);
		calendar.weekIndex(-3);
		calendar.monthIndex(0);
		calendar.monthIndex(7);
		calendar.monthIndex(10);
	}	
}
		
		
		
	









