// Program1: Find a day based on day index
package manjiri;
class DayIndentifier{
	void processData(int dayIndex){
		if (dayIndex == 1)
			System.out.println("Monday");
		else if (dayIndex == 2)
			System.out.println("Tuesday");
		else if (dayIndex == 3)
			System.out.println("Wednesday");
		else if (dayIndex == 4)
			System.out.println("Thursday");
		else if (dayIndex == 5)
			System.out.println("Friday");
		else if (dayIndex == 6)
			System.out.println("Saturday");
		else if (dayIndex == 7)
			System.out.println("Sunday");
		else
			System.out.println("Invaild Index");
	}
	
	
	
	public static void main(String[] args){
		DayIndentifier dayIdentifier = new DayIndentifier();
		dayIdentifier.processData(4);
		dayIdentifier.processData(-3);
		dayIdentifier.processData(8);
	}
}

