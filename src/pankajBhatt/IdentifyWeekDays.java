package pankajBhatt;

class IdentifyWeekDays{
	
	void processData(int dayIndex){
		if(dayIndex >=1 && dayIndex <=5){
			System.out.println("It's a Week Day");
		}
		else if((dayIndex >=6 && dayIndex <=7)){
			System.out.println("Yay it's a Weekend");
		}
		else
			System.out.println("Invalid day Index");
	}
	
	public static void main(String[] srgs){
		IdentifyWeekDays identifyWeekDays = new IdentifyWeekDays();
		identifyWeekDays.processData(4);
	}
}