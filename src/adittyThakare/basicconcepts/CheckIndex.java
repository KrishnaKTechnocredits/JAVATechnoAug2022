/*Assignment - 4 : 23rd Aug'2022

Please create single class and write 3 methods to fulfil below requirements

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
Any other index should be considered as invalid*/
package adittyThakare.basicconcepts;

class CheckIndex{
	
	void processData(int dayIndex){
		if(dayIndex==1)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Monday");
		else if(dayIndex==2)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Tuesday");
		else if(dayIndex==3)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Wednesday");
		else if(dayIndex==4)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Thursday");
		else if(dayIndex==5)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Friday");
		else if(dayIndex==6)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Saturday");
		else if(dayIndex==7)
			System.out.println("Input day index: "+dayIndex+" -> Day of the week is Sunday");
		else
			System.out.println("Input day index: "+dayIndex+" -> Invalid day index!!");
	}
	
	void processDataWeekday(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("Input day index: "+dayIndex+" -> Its a weekday");
		else if(dayIndex==6 || dayIndex==7)
			System.out.println("Input day index: "+dayIndex+" -> Its weekend!");
		else
			System.out.println("Input day index: "+dayIndex+" -> Invalid day index!!");
	}

	void processDataQuarter(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3)
			System.out.println("Input month index: "+monthIndex+" -> FY'22 Quarter 1");
		else if(monthIndex>=4 && monthIndex<=6)
			System.out.println("Input month index: "+monthIndex+" -> FY'22 Quarter 2");
		else if(monthIndex>=7 && monthIndex<=9)
			System.out.println("Input month index: "+monthIndex+" -> FY'22 Quarter 3");
		else if(monthIndex>=10 && monthIndex<=12)
			System.out.println("Input month index: "+monthIndex+" -> FY'22 Quarter 4");
		else
			System.out.println("Input month index: "+monthIndex+" -> Invalid month index!");
	}
	
		
	public static void main(String[] args){
		CheckIndex checkIndex = new CheckIndex();
		checkIndex.processData(3);
		checkIndex.processData(12);
		checkIndex.processDataWeekday(7);
		checkIndex.processDataWeekday(1);
		checkIndex.processDataWeekday(0);
		checkIndex.processDataQuarter(7);
		checkIndex.processDataQuarter(1);
		checkIndex.processDataQuarter(0);
	}	
}			