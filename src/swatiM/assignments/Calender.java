package swatiM.assignments;
class Calender{
  // Find day from output
	void dayIndex(int day){
		if(day==1)
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
		System.out.println("Invalid day");
	}
	// find weekend 
	void weekIndex(int week){
		if(week>=1 && week<=5)
			System.out.println("Weekend day");
		else if(week==6 || week==7)
			System.out.println("Weekend day");
		else 
			System.out.println("Invalid Weekend day");
	}
	//Find moth from which qurter
	void monthIndex(int month){
		if(month>=1 && month<=3)
			System.out.println("Month is from Q1 of 2022");
		else if(month>=4 && month<=6)
			System.out.println("Month is from Q2 of 2022");
		else if(month>=7 && month<=9)
			System.out.println("Month is from Q3 of 2022");
		else if(month>=10 && month<=12)
			System.out.println("Month is from Q4 of 2022");
		else 
			System.out.println("Given month is Invalid");
	}
public static void main(String[]a){
	Calender calender = new Calender();
	calender.dayIndex(1);
	calender.dayIndex(2);
	calender.dayIndex(7);
	calender.dayIndex(12);
	calender.weekIndex(1);
	calender.weekIndex(2);
	calender.monthIndex(12);
	calender.monthIndex(2);
	calender.monthIndex(-3);
}
}
	