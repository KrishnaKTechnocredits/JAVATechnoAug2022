//S4_Weekday index
//if 1 to 5 - Weekday , 6,7 - Weekend , if any other number then invalid input
package shridharKumbhar;

class WeekdayIndex{
	
	void weekday (int dayno){
		if (dayno>=1 && dayno<6)
			System.out.println(dayno+ " You entered - Sad it's Weekday :: Time to Work");
		else if (dayno==6 || dayno == 7)
			System.out.println(dayno + " You Entered - Enjoy the weekend show :: 8 to1");
		else 
			System.out.println("You entered wrong no:: Krupaya Dobara Prayas Kijiye");
	}
	
	public static void main (String [] a){
		WeekdayIndex weekdayindex = new WeekdayIndex();
		weekdayindex.weekday(5);
		weekdayindex.weekday(1);
		weekdayindex.weekday(6);
		weekdayindex.weekday(0);
		weekdayindex.weekday(10);
	}
	
}