package ankitaBarwad;

class IfElseExample {

	//Program 1: Find a day based on dayIndex
	void findDay(int dayIndex){
		if(dayIndex == 1){
			System.out.println("dayIndex -> " + dayIndex + " : Monday");
		}
		else if(dayIndex == 2){
			System.out.println("dayIndex -> " + dayIndex + " : Tuesday");
		}
		else if(dayIndex == 3){
			System.out.println("dayIndex -> " + dayIndex + " : Wednesday");
		}
		else if(dayIndex == 4){
			System.out.println("dayIndex -> " + dayIndex + " : Thursday");
		}
		else if(dayIndex == 5){
			System.out.println("dayIndex -> " + dayIndex + " : Friday");
		}
		else if(dayIndex == 6){
			System.out.println("dayIndex -> " + dayIndex + " : Saturday");
		}
		else if(dayIndex == 7){
			System.out.println("dayIndex -> " + dayIndex + " : Sunday");
		}
		else{
			System.out.println("dayIndex -> " + dayIndex + " : Invalid Index");
		}
	}
	
	//Program 2: Find weekdays or weekend based on dayIndex
	void findWeekDay(int weekIndex){
		if(weekIndex >= 1 && weekIndex <= 5){
			System.out.println("weekIndex -> " + weekIndex + " : Weekday");
		}
		else if(weekIndex == 6 || weekIndex == 7){
			System.out.println("weekIndex -> " + weekIndex + " : Weekend");
		}
		else{
			System.out.println("weekIndex -> " + weekIndex + " : Invalid Index");
		}
	}
	
	//Program 3 : Find Quarter based on month index
	void findQuarter(int monthIndex){
		if(monthIndex >=1 && monthIndex <= 3){
			System.out.println("monthIndex -> " + monthIndex + " : FY2022 Q1");
		}
		else if(monthIndex >=4 && monthIndex <= 6){
			System.out.println("monthIndex -> " + monthIndex + " : FY2022 Q2");
		}
		else if(monthIndex >=7 && monthIndex <= 9){
			System.out.println("monthIndex -> " + monthIndex + " : FY2022 Q3");
		}
		else if(monthIndex >=10 && monthIndex <= 12){
			System.out.println("monthIndex -> " + monthIndex + " : FY2022 Q4");
		}
		else {
			System.out.println("monthIndex -> " + monthIndex + " : Invalid Index");
		}
	}
	
	public static void main(String[] args){
		IfElseExample ifElseExample = new IfElseExample();
		ifElseExample.findDay(1);
		ifElseExample.findDay(2);
		ifElseExample.findDay(7);
		ifElseExample.findDay(-3);
		ifElseExample.findDay(13);
		ifElseExample.findWeekDay(1);
		ifElseExample.findWeekDay(2);
		ifElseExample.findWeekDay(6);
		ifElseExample.findWeekDay(-3);
		ifElseExample.findQuarter(2);
		ifElseExample.findQuarter(12);
		ifElseExample.findQuarter(-3);
	}
}