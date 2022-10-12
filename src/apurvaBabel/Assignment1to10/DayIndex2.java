/*Assignment 4:
Program 2: Find weekdays or weekends based on dayIndex.
1 -> Weekday
2 -> Weekday
6 -> Weekend
dayIndex -> -3 : Invalid Index
Note : 1 to 5 index should be considered weekdays, 6 & 7 should be considered weekend
*/	

package apurvaBabel.Assignment1to10;

class DayIndex2{

	void processData(int day){
		if (day >=1 && day <=5){
			System.out.println("Weekday");
		}else if (day == 6 || day == 7){
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid Index");
		}
		}
	
	public static void main(String[] args){
		DayIndex2 dayIndex2 = new DayIndex2();
		dayIndex2.processData(1);
		dayIndex2.processData(6);
		dayIndex2.processData(5);
		dayIndex2.processData(-4);
		dayIndex2.processData(8);
	}
}