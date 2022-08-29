class Index{
	
	void day(int dayIndex){
			if(dayIndex==1)
				System.out.println("The day with index "+dayIndex+" is Monday");
			else if(dayIndex==2)
				System.out.println("The day with index "+dayIndex+" is Tuesday");
			else if(dayIndex==4)
				System.out.println("The day with index "+dayIndex+" is Wednesday");
			else if(dayIndex==5)
				System.out.println("The day with index "+dayIndex+" is Thursday");
			else if(dayIndex==6)
				System.out.println("The day with index "+dayIndex+" is Friday");
			else if(dayIndex==7)
				System.out.println("The day with index "+dayIndex+" is Saturday");
			else
				System.out.println(dayIndex+" is invalid day index");
	}
	
	void holiday(int dayIndex){
		if(dayIndex>0 && dayIndex<=5)
			System.out.println("The day with index "+dayIndex+" is weekday");
		else if(dayIndex>5 && dayIndex<8)
			System.out.println("The day with index "+dayIndex+" is weekend");
		else
			System.out.println(dayIndex+" is invalid day index");
	}
	
	void quarter(int monthIndex){
		if(monthIndex==1 || monthIndex==2 || monthIndex==3)
			System.out.println("The month with index "+monthIndex+" is in FY2022 Q1");
		else if (monthIndex==4 || monthIndex==5 || monthIndex==6)
			System.out.println("The month with index "+monthIndex+" is in FY2022 Q2");
		else if (monthIndex==7 || monthIndex==8 || monthIndex==9)
			System.out.println("The month with index "+monthIndex+" is in FY2022 Q3");
		else if (monthIndex==10 || monthIndex==11 || monthIndex==12)
			System.out.println("The month with index "+monthIndex+" is in FY2022 Q4");
		else
			System.out.println(monthIndex+" is invalid month index");
	}
	
	public static void main (String[] args){
		Index index = new Index();
		index.day(-3);
		index.day(11);
		index.day(7);
		index.holiday(-4);
		index.holiday(5);
		index.holiday(6);
		index.quarter(20);
		index.quarter(1);
		index.quarter(4);	
	}
}