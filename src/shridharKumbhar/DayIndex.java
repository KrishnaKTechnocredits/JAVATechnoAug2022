//Nested if
//Weekdayindex & weekday or weekend
package shridharKumbhar;

class DayIndexWeek{
	
	void printbydayindex (int dayIndex){
		if (dayIndex >= 1 && dayIndex < 6){
			System.out.println("Its weeksday");
				if (dayIndex==1){
					System.out.println("Monday");
				}else if (dayIndex==2){
					System.out.println("Tuesday");
				}else if (dayIndex==3){
					System.out.println("Wednesday");
				}else if (dayIndex==2){
					System.out.println("Thursday");
				}else if (dayIndex==2){
					System.out.println("Friday");
				}	
		}else if (dayIndex==6 || dayIndex==7){
			System.out.println("Weedend");
			if (dayIndex==6)
				System.out.println("Saturday");
			else if (dayIndex==7)
				System.out.println("Sunday");
		}else 
			System.out.println("Invalid input");
	}
	
	public static void main(String[] a){
		DayIndexWeek dayIndexweek = new DayIndexWeek();
		dayIndexweek.printbydayindex(2);
		dayIndexweek.printbydayindex(5);
		dayIndexweek.printbydayindex(7);
		dayIndexweek.printbydayindex(8);
	}
}