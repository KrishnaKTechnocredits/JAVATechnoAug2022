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

package rashmiG;

class Calendar{
	
	void dayInfo(int dayIndex){
		if(dayIndex == 1){
			System.out.println("Monday");
		}
		else if(dayIndex == 2){
			System.out.println("Tuesday");
		}
		else if(dayIndex == 3){
			System.out.println("Wednesday");
		}
		else if(dayIndex == 4){
			System.out.println("Thursday");
		}
		else if(dayIndex == 5){
			System.out.println("Friday");
		}
		else if(dayIndex == 6){
			System.out.println("Saturday");
		}
		else if(dayIndex == 7){
			System.out.println("Sunday");
		}
		else{
			System.out.println(dayIndex+" : Invalid  day Index");
		}
	}
		
	void weekendInfo(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println(dayIndex+" : Weekday");
		}
		else if(dayIndex>=6 && dayIndex<=7){
			System.out.println(dayIndex+" : Weekend");
		}
		else{
				System.out.println(dayIndex+" : Invalid day Index");
		}
	}

	void quarterInfo(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3)
				System.out.println("FY2022 Q1");
		else if(monthIndex == 4 || monthIndex == 5 || monthIndex == 6)
			System.out.println("FY2022 Q2");
		else if(monthIndex>=7 && monthIndex<=9)
			System.out.println("FY2022 Q3");
		else if(monthIndex>=10 && monthIndex<=12)
				System.out.println(" FY2022 Q4");
		else
			System.out.println(monthIndex+" : Invalid month index");
	}
	
	public static void main(String[] args){
		Calendar calendar = new Calendar();
		calendar.dayInfo(7);
		calendar.weekendInfo(-9);
		calendar.quarterInfo(6);
		calendar.quarterInfo(0);
		calendar.weekendInfo(7);
		calendar.weekendInfo(3);
		calendar.dayInfo(12);
	}
}
	
		
				
			
				
			