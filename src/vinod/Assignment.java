package vinod;
class Assignment{
	void checkDay(int dayIndex){
		if(dayIndex==1)
			System.out.println("its a Monday");
		else if(dayIndex==2)
		    System.out.println("its a Tuesday");
		else if (dayIndex==3)
		    System.out.println("its a Wednesday");
		else if(dayIndex==4)
		    System.out.println("its a Thursday");
		else if(dayIndex==5)
		    System.out.println("its a Friday");
		else if(dayIndex==6)
		    System.out.println("its a Saturday");
		else 
		    System.out.println("invalid Day");
	}
	
	void findQuarter(int monthIndex){
		if(monthIndex==1 || monthIndex==2 || monthIndex==3)
			System.out.println("VY2022 Q1");
		else if(monthIndex==4 || monthIndex==5 || monthIndex==6)
			System.out.println("VY2022 Q2");
		else if (monthIndex==7 || monthIndex==8 || monthIndex==9)
			System.out.println("VY2022 Q3");
		else if (monthIndex==10 || monthIndex==11 ||monthIndex==12)
			System.out.println("VY2022 Q4");
		else
			System.out.println("Invalid monthIndex");
	}
	
	void findWeekDays(int dayIndex){
		if (dayIndex>=1 && dayIndex<=5)
			System.out.println("its weekendDays");
		else if (dayIndex>=6 && dayIndex<=7)
			System.out.println("its weekendDays");
		else
			System.out.println("invalid weekendDays");
	}
	public static void main(String[] args){
		Assignment assignment = new Assignment();
		assignment.checkDay(1);
		assignment.checkDay(2);
		assignment.checkDay(3);
		assignment.checkDay(6);
		assignment.checkDay(-3);
		assignment.checkDay(13);
		System.out.println("");
		assignment.findQuarter(2);
		assignment.findQuarter(4);
		assignment.findQuarter(6);
		assignment.findQuarter(9);
		assignment.findQuarter(14);
		assignment.findWeekDays(1);
		assignment.findWeekDays(2);
		assignment.findWeekDays(-3);
		System.out.println("");
	}
}