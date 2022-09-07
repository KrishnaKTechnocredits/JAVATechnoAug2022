package ashishBramhe;

class A4_DayType{
	
	void printDayType(int dayNo){
		if(dayNo >=1 && dayNo <=5)
			System.out.println(dayNo + " is a weekday");
		else if(dayNo > 5 && dayNo <=7)
			System.out.println(dayNo + " is a weekend");
		else
			System.out.println(dayNo + " is invalid day number");
	}
	
	public static void main(String args[]){
		A4_DayType dayType = new A4_DayType();
		dayType.printDayType(2);
		dayType.printDayType(3);
		dayType.printDayType(5);
		dayType.printDayType(7);
		dayType.printDayType(6);
		dayType.printDayType(0);		
	}
}