package akankshaSharma;
class Info{
	
	void dayInfo(int dayIndex){
		if(dayIndex == 1)
			System.out.println("Monday");
		else if(dayIndex == 2)
			System.out.println("Tuesday");
		else if(dayIndex == 7)
			System.out.println("Sunday");
		else if(dayIndex == -3 || dayIndex == 13)
			System.out.println("Invalid Index : " + dayIndex);
	}
	
	void weekInfo(int dayIndex){
		if(dayIndex >=1 && dayIndex<=5)
			System.out.println("Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("Weekend");
		else if(dayIndex==-3)
			System.out.println("Invalid Index");
	}	
		
	void quarterInfo(int monthIndex){
		if(monthIndex >=1 && monthIndex <=3)
			System.out.println("FY2022 Q1");
		else if(monthIndex >=4 && monthIndex <=6)
			System.out.println("FY2022 Q2");
		else if(monthIndex >=7 && monthIndex <=9)
			System.out.println("FY2022 Q3");
		else if(monthIndex >=10 && monthIndex <=12)
			System.out.println("FY2022 Q4");
		else if(monthIndex <=0  || monthIndex >=13)
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		Info info = new Info();
		info.dayInfo(-3);
		info.dayInfo(2);
		info.weekInfo(4);
		info.weekInfo(7);
		info.quarterInfo(2);
		info.quarterInfo(4);
		info.quarterInfo(8);
		info.quarterInfo(12);
		info.quarterInfo(13);
	}
}