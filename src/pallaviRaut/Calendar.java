package pallaviRaut;

class Calendar{
	
	void dayIndex(int dayIndex)
	{
		if (dayIndex>=1 && dayIndex<=7)
		{	
			if(dayIndex==1)
			{	
				System.out.println("This is 1st day of a week. Its Monday.");
			}
			else if(dayIndex==2)
			{
				System.out.println("This is 2nd day of a week. Its Tuesday.");
			}
			else if(dayIndex==3)
			{
				System.out.println("This is 3rd day of a week. Its Wednesday.");
			}
			else if(dayIndex==4)
			{
				System.out.println("This is 4th day of a week. Its Thursday.");
			}
			else if(dayIndex==5)
			{
				System.out.println("This is 5th day of a week. Its Friday.");
			}
			else if(dayIndex==6)
			{
				System.out.println("This is 6th day of a week. Its Saturday.");
			}
			else if(dayIndex==7)
			{
				System.out.println("This is 7th day of a week.Its Sunday.");
			}
		}	
		else
		{
			System.out.println(dayIndex+ " is Invalid Day,not exist in week");
		}
	System.out.println("--------------------------------");
	}	
	
	void weekIndex(int dayIndex)
	{
		if (dayIndex==1||dayIndex==2||dayIndex==3|| dayIndex==4||dayIndex==5)
		{	
			System.out.println("It is Weekday");
		}
		else if(dayIndex==6 || dayIndex==7)
		{
			System.out.println("It is Weekend");
		}
		else
		{
			System.out.println(dayIndex+ " is invalid day not exist in Week");
		}
	System.out.println("--------------------------------");	
	}

	void monthIndex( int indexMonth)
	{
		if (indexMonth>=1 && indexMonth<=12)
		{
			if(indexMonth==1 ||indexMonth==2 || indexMonth==3)
			{
				System.out.println("This month is from Quarter1 of FY2022");
			}	
			else if(indexMonth==4 ||indexMonth==5 || indexMonth==6)
			{
				System.out.println("This month is from Quarter2 of FY2022");
			}	
			else if(indexMonth==7 ||indexMonth==8 || indexMonth==9)
			{
				System.out.println("This month is from Quarter3 of FY2022");
			}	
			else if(indexMonth==10 ||indexMonth==11 || indexMonth==12)
			{
				System.out.println("This month is from Quarter4 of FY2022");
			}	
		}
		else
		{
			System.out.println("This is not valid month");
		}	
    System.out.println("--------------------------------");		
	}
	
	public static void main(String[] args)
	{
		Calendar calendar= new Calendar();
		calendar.dayIndex(1);
		calendar.dayIndex(13);
		calendar.dayIndex(7);
		calendar.dayIndex(-3);
		calendar.weekIndex(4);
		calendar.weekIndex(7);
		calendar.weekIndex(14);
		calendar.weekIndex(10);
		calendar.monthIndex(6);
		calendar.monthIndex(0);
		calendar.monthIndex(16);
	}
}	
