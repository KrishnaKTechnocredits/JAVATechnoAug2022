package monikaDwivedi;
/*Find weekdays or weekend based on dayindex*/


class FindWeekdaysWeekend{
	void printWeekendWeekday(int dayIndex){
		if(dayIndex > 1 && dayIndex < 6 ){
			System.out.println("It's Weekday");
		}
		else if(dayIndex >= 6 && dayIndex <= 7 ){
			System.out.println("It's Weekend");	
		}
		else
			System.out.println("Invalid entry");
	}
	public static void main(String[] args){
		FindWeekdaysWeekend findWeekdaysWeekend = new FindWeekdaysWeekend();
		findWeekdaysWeekend.printWeekendWeekday(2);
		findWeekdaysWeekend.printWeekendWeekday(6);
		findWeekdaysWeekend.printWeekendWeekday(10);
	}
}