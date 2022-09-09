package hardikBhatia.Assignments;

public class Assignment4DayWeekdaysQuaterCheck {
	void findDayFromDayIndex(int index){
		if(index == 1){
			System.out.println(index + "-> Monday");
		}else if(index == 2){
			System.out.println(index + "-> Tuesday");
		}else if(index == 3){
			System.out.println(index + "-> Wednesday");
		}else if(index == 4){
			System.out.println(index + "-> Thursday");
		}else if(index == 5){
			System.out.println(index + "-> Friday");
		}else if(index == 6){
			System.out.println(index + "-> Staurday");
		}else if(index == 7){
			System.out.println(index + "-> Sunday");
		}else{
			System.out.println("dayIndex ->" + index + " : Invalid Index");
		}
	}
	
	void findWeekdaysAndWeekendFromDayIndex(int index){
		if(index >= 1 && index <= 5){
			System.out.println(index + "-> Weekday");
		}else if(index == 6 || index == 7){
			System.out.println(index + "-> Weekend");
		}else{
			System.out.println("dayIndex ->" + index + " : Invalid Index");
		}
	}
	
	void findQuaterFromMonthIndex(int index){
		if(index == 1 || index == 2 || index == 3){
			System.out.println("Month index is :" + index + "-> FY2022 Q1");
		}else if(index == 4 || index == 5 || index == 6){
			System.out.println("Month index is :" + index + "-> FY2022 Q2");
		}else if(index == 7 || index == 8 || index == 9){
			System.out.println("Month index is :" + index + "-> FY2022 Q3");
		}else if(index == 10 || index == 11 || index == 12){
			System.out.println("Month index is :" + index + "-> FY2022 Q4");
		}else{
			System.out.println("Invalid Month index");
		}
	}
	
	public static void main(String[] args){
		Assignment4DayWeekdaysQuaterCheck assignment4DayWeekdaysQuaterCheck = new Assignment4DayWeekdaysQuaterCheck();
		assignment4DayWeekdaysQuaterCheck.findDayFromDayIndex(1);
		assignment4DayWeekdaysQuaterCheck.findDayFromDayIndex(2);
		assignment4DayWeekdaysQuaterCheck.findDayFromDayIndex(-3);
		
		assignment4DayWeekdaysQuaterCheck.findWeekdaysAndWeekendFromDayIndex(1);
		assignment4DayWeekdaysQuaterCheck.findWeekdaysAndWeekendFromDayIndex(7);
		assignment4DayWeekdaysQuaterCheck.findWeekdaysAndWeekendFromDayIndex(-3);
		
		assignment4DayWeekdaysQuaterCheck.findQuaterFromMonthIndex(1);
		assignment4DayWeekdaysQuaterCheck.findQuaterFromMonthIndex(3);
		assignment4DayWeekdaysQuaterCheck.findQuaterFromMonthIndex(7);
	}
}
