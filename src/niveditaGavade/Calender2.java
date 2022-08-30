package niveditaGavade;
class Calender2{
	
	void printDayIndex(int dayIndex){
	
		if(dayIndex==1){
			System.out.println("This is weekday");
			System.out.println("Monday");
		}
		else if(dayIndex==2){
			System.out.println("This is Weekday");
			System.out.println("Tuesday");
		}
		else if(dayIndex==3){
			System.out.println("This is Weekday");
			System.out.println("Wednesday");
		}
		else if(dayIndex==4){
			System.out.println("This is Weekday");
			System.out.println("Thursday");
		}
		else if(dayIndex==5){
			System.out.println("This is Weekday");
			System.out.println("Friday");
		}
		else if(dayIndex==6){
			System.out.println("This is Weekend");
			System.out.println("Saturday");
		}
		else if(dayIndex==7){
			System.out.println("This is Weekend");
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid Index");
		}
	}
	public static void main(String[] args){
		Calender2 calender2= new Calender2();
		calender2.printDayIndex (1);
		calender2.printDayIndex (2);
		calender2.printDayIndex (7);
		calender2.printDayIndex (3);
		calender2.printDayIndex (13);
	}
}