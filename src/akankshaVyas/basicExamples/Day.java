/*
Program 1: Find a day based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday
dayIndex -> -3 : Invalid Index
dayIndex -> 13 : Invalid Index
*/
package akankshaVyas.basicExamples;
class Day{	
	void processData(int dayIndex){
		if(dayIndex==1)
		System.out.println("Monday");
		else if(dayIndex==2)
		System.out.println("Tuesday");
		else if(dayIndex==3)
		System.out.println("Wednesday");
		else if(dayIndex==4)
		System.out.println("Thursday");
		else if(dayIndex==5)
		System.out.println("Friday");
		else if(dayIndex==6)
		System.out.println("Saturday");
		else if(dayIndex==7)
		System.out.println("Sunday");
		else
		System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		Day day = new Day();
		day.processData(1);
		day.processData(5);
		day.processData(-3);
		day.processData(13);
		
	}
}