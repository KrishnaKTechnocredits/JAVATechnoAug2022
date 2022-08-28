package pankajBhatt;

class WhichDayOfWeek{
	
	void processData(int dayIndex){
		if(dayIndex == 1){
			System.out.println("It's Monday");
		}
		else if(dayIndex == 2){
			System.out.println("It's Tuesday");
		}
		else if(dayIndex == 3){
			System.out.println("It's a Wednesday");
		}
		else if(dayIndex == 4){
			System.out.println("It's a Thursday");
		}
		else if(dayIndex ==5){
			System.out.println("Partyyy It's Friday");
		}
		else if(dayIndex ==6){
			System.out.println("Saturday");
		}
		else if(dayIndex ==7){
			System.out.println("Sunday");
		}
		else
			System.out.println("Invalid day Index of the week");
	}
	
	public static void main(String[] srgs){
		WhichDayOfWeek whichDayOfWeek = new WhichDayOfWeek();
		whichDayOfWeek.processData(4);
	}
}