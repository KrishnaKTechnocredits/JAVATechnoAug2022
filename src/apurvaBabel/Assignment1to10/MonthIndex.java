/*Assignment 4 :
Program 3 : Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid
*/

package apurvaBabel.Assignment1to10;

class MonthIndex{

	void processData(int month){
		if (month == 1 || month == 2 || month == 3){
			System.out.println("FY 2022 Q1");
		}else if (month == 4 || month == 5 || month == 6){
			System.out.println("FY 2022 Q2");
		}else if (month == 7 || month == 8 || month == 9){
			System.out.println("FY 2022 Q3");
		}else if (month == 10 || month == 11 || month == 12){
			System.out.println("FY 2022 Q4");
		}else {
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.processData(2);
		monthIndex.processData(6);
		monthIndex.processData(-4);
		monthIndex.processData(7);
		monthIndex.processData(11);
		monthIndex.processData(13);
	}
}