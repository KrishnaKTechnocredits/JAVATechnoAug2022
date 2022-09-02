/*
Program 2: Find weekdays or weekend based on dayIndex.
1 -> Weekday
2 -> Weekday
6 -> Weekend
dayIndex -> -3 : Invalid Index
Note : 1 to 5 index should be consider as weekdays, 6 & 7 should be consider as weekend
*/

package akankshaVyas.basicExamples;
class Week{

	void processData(int dayIndex){		
		if(dayIndex>=1 && dayIndex<=5)
		System.out.println("Its a weekday");
		else if(dayIndex==6 || dayIndex==7)
		System.out.println("Its a Weekend");
		else
		System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		Week week = new Week();
		week.processData(1);
		week.processData(4);
		week.processData(6);
		week.processData(7);
		week.processData(-1);
		week.processData(11);
		
	}
}