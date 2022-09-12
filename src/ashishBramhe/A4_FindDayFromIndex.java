package ashishBramhe;

class A4_FindDayFromIndex{
	
	void printDayNameFromNumber(int dayIndex){
		if(dayIndex == 1)	
			System.out.println(dayIndex + " is Monday");
		else if(dayIndex == 2)	
			System.out.println(dayIndex + " is Tuesday");
		else if(dayIndex == 3)	
			System.out.println(dayIndex + " is Wednesday");
		else if(dayIndex == 4)	
			System.out.println(dayIndex + " is Thursday");
		else if(dayIndex == 5)	
			System.out.println(dayIndex + " is Friday");
		else if(dayIndex == 6)	
			System.out.println(dayIndex + " is Saturday");
		else if(dayIndex == 7)	
			System.out.println(dayIndex + " is Sunday");
		else
			System.out.println(dayIndex + " is invalid");		
		
	}
	
	public static void main(String args[]){
			A4_FindDayFromIndex findDay = new A4_FindDayFromIndex();
			findDay.printDayNameFromNumber(1);
			findDay.printDayNameFromNumber(2);
			findDay.printDayNameFromNumber(3);
			findDay.printDayNameFromNumber(4);
			findDay.printDayNameFromNumber(5);
			findDay.printDayNameFromNumber(6);
			findDay.printDayNameFromNumber(7);
			findDay.printDayNameFromNumber(-1);
	}
}