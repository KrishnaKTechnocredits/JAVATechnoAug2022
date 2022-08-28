package apurvaBabel;

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