package saroj;
class DayMonth{
	
	/*Find a day based on dayIndex.*/

	void processData(int dayIndex){
		if(dayIndex == 1)
			System.out.println("Monday");
		else if(dayIndex == 2)
			System.out.println("Tuesday");
		else if(dayIndex == 3)
			System.out.println("Wednesday");
		else if(dayIndex == 4)
			System.out.println("Thursday");
		else if(dayIndex == 5)
			System.out.println("Friday");
		else if(dayIndex == 6)
			System.out.println("Saturday");
		else if(dayIndex == 7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid Index for days " + dayIndex);
	}
	/*Find weekdays or weekend based on dayIndex.*/
	
	void processData1(int dayIndex){
		if(dayIndex == 1)
			System.out.println("Weekdays");
		else if(dayIndex == 2)
			System.out.println("Weekdays");
		else if(dayIndex == 3)
			System.out.println("Weekdays");
		else if(dayIndex == 4)
			System.out.println("Weekdays");
		else if(dayIndex == 5)
			System.out.println("Weekdays");
		else if(dayIndex == 6)
			System.out.println("Weekend");
		else if(dayIndex == 7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid Index for Weekdays " + dayIndex);
	}
	
	/*Find Quater based on month index.*/
	
	void processData2(int monthIndex){
		if(monthIndex >=1 && monthIndex <=3)
			System.out.println("FY2022 Q1");
		else if(monthIndex >=4 && monthIndex <=6)
			System.out.println("FY2022 Q2");
		else if(monthIndex >=7 && monthIndex <=9)
			System.out.println("FY2022 Q3");
		else if(monthIndex >=10 && monthIndex <=12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid Index for Month " + monthIndex);
	}
	
	public static void main(String[] args){
		DayMonth dayMonth = new DayMonth();
		dayMonth.processData(1);
		dayMonth.processData1(12);
		dayMonth.processData2(1);
		dayMonth.processData(-3);
		dayMonth.processData1(13);
		dayMonth.processData2(-2);
		dayMonth.processData(7);
		dayMonth.processData1(6);
		dayMonth.processData2(8);
		
	}
}