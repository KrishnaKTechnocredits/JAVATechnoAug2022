/*Please create single class and write 3 methods to fulfil below requirements

Program 1: Find a day based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday
dayIndex -> -3 : Invalid Index
dayIndex -> 13 : Invalid Index

Program 2: Find weekdays or weekend based on dayIndex.
1 -> Weekday
2 -> Weekday
6 -> Weekend
dayIndex -> -3 : Invalid Index
Note : 1 to 5 index should be consider as weekdays, 6 & 7 should be consider as weekend

Program 3 : Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid */
package deepakBorse.Assignments;

class Calender{

	void dayIndex(int day){
		if(day==1)
			System.out.println("Day is 1-> Monday");
		else if(day==2)
			System.out.println("Day is 2-> Tuesday");
		else if(day==3)
			System.out.println("Day is 3-> Wednesday");
		else if(day==4)
			System.out.println("Day is 4-> Thursday");
		else if(day==5)
			System.out.println("Day is 5-> Friday");
		else if(day==6)
			System.out.println("Day is 6-> Saturday");
		else if(day==7)
			System.out.println("Day is 7-> Sunday");
		else 
			System.out.println("Invalid Day entry");
	}

	void weekIndex(int weekdayInd){
		if(weekdayInd>=1 &&weekdayInd<=5)
			System.out.println("It is Weekday so workhard-"+weekdayInd);
		else if(weekdayInd>=6 &&weekdayInd<=7)
			System.out.println("It is Weekend so Party hard-"+weekdayInd);
		else
			System.out.println("Invalid weekIndex entry");
	}
	
	void quarterIndex(int monthIndex){
		if(monthIndex==1 || monthIndex==2||monthIndex==3)
			System.out.println("It is FY2022 Q1 -"+monthIndex);
		else if(monthIndex==4 || monthIndex==5|| monthIndex==6)
			System.out.println("It is FY2022 Q2 -"+monthIndex);
		else if(monthIndex==7 || monthIndex==8|| monthIndex==9)
			System.out.println("It is FY2022 Q3 -"+monthIndex);
		else if(monthIndex==10 || monthIndex==11|| monthIndex==12)
			System.out.println("It is FY2022 Q4 -"+monthIndex);
		else
			System.out.println("Invalid MonthIndex entry");
	}
	
	public static void main(String[] args){
		Calender Calender1=new Calender();
		
		Calender1.dayIndex(4);
		Calender1.dayIndex(8);
		Calender1.weekIndex(7);
		Calender1.weekIndex(10);
		Calender1.quarterIndex(12);
		Calender1.quarterIndex(19);
			
	}
	
}
