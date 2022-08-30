package niveditaGavade;
class Calender{

	void printDayIndex(int dayIndex){
	
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
		}else if(dayIndex>=6 && dayIndex<=7){
			System.out.println("Weekend");
		}else 
			{System.out.println("Invalid");
		}
	}
	public static void main(String[] args){
		Calender calender= new Calender();
		calender.printDayIndex(1);
		calender.printDayIndex(2);
		calender.printDayIndex(6);
	}
}