package monikaDwivedi;
/*Find a day based on dayIndex.*/

class FindDay{
	void printDayByIndex(int dayIndex){
		if(dayIndex > 1 && dayIndex < 6 ){
			
			if(dayIndex == 1 ){
			System.out.println("1 is Monday");
			}else if(dayIndex == 2 ){
			System.out.println("2 is Tuesday");
			}else if(dayIndex == 3 ){
			System.out.println("3 is wednesday");
			}else if(dayIndex == 4 ){
			System.out.println("4 thursdayday");
			}else if(dayIndex == 5 ){
			System.out.println("5 is friday");
			}	
		}
		else if(dayIndex >= 6 && dayIndex <= 7 ){
			
			if(dayIndex == 6 ){
			System.out.println("6 is Saturday");
			}else if(dayIndex == 2 ){
			System.out.println("7 is Sunday");
			}	
		}
		else
			System.out.println("Invalid entry");
	}
	public static void main(String[] args){
		FindDay findDay = new FindDay();
		findDay.printDayByIndex(2);
		findDay.printDayByIndex(6);
		findDay.printDayByIndex(10);
	}
}