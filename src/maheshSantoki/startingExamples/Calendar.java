package maheshSantoki.startingExamples;
class Calendar{
	//1: FIND A DAY FROM WEEK
	void dayIndex(int day){
		if(day==1)
			System.out.println(" Monday ");
		else if(day==2)
			System.out.println(" Tuesday ");
		else if(day==3)
			System.out.println(" Wednesday ");
		else if(day==4)
			System.out.println(" Thursday ");
		else if(day==5)
			System.out.println(" Friday ");
		else if(day==6)
			System.out.println(" Saturday ");
		else if(day==7)
			System.out.println(" Sunday ");
		else 
			System.out.println(" Given input is invalid. ");
	}
	// FIND A WEEKDAY OR WEEKEND DAY 
	void weekIndex(int index){
		if(index>0 && index<=5)
			System.out.println(" Weekday day ");
		else if(index==6 || index==7)
			System.out.println(" Weekend day ");
		else
			System.out.println(" invalid day");
	}
	// FIND A GIVEN MONTH IS FROM WHICH QUATER	
	void monthIndex(int index){
		if(index>=1 && index<=3)
			System.out.println(" Given month is in FY2022 Q1 ");
		else if(index>=4 && index<=6)
			System.out.println(" Given month is in FY2022 Q2 ");
		else if(index>=7 && index<=9)
			System.out.println(" Given month is in FY2022 Q3 ");
		else if(index>=10 && index<=12)
			System.out.println(" Given month is in FY2022 Q4 ");
		else
			System.out.println(" Given month is invalid ");
	}
	
	public static void main(String[] args){
		Calendar calendar = new Calendar();
		calendar.dayIndex(1);
		calendar.dayIndex(2);
		calendar.dayIndex(7);
		calendar.dayIndex(12);
		calendar.dayIndex(-3);
		calendar.weekIndex(1);
		calendar.weekIndex(2);
		calendar.weekIndex(6);
		calendar.monthIndex(2);
		calendar.monthIndex(5);
		calendar.monthIndex(12);
		calendar.monthIndex(29);
	}
}