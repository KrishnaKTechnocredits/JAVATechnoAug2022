package nikitaPhase;
class WeekdayWeekend{
	//Define a method to check input for weekday or weekend.
	void checkInput(int day){
		System.out.println("Input is: " + day);
		if(day >= 1 && day <= 5){
			System.out.println("This is weekday.");
			if(day == 1){
				System.out.println("Day is Monday.");
			}else if(day == 2){
				System.out.println("Day is Tuesday.");
			}else if(day == 3){
				System.out.println("Day is Wednesday.");
			}else if(day == 4){
				System.out.println("Day is Thursday.");
			}else if(day == 5){
				System.out.println("Day is Friday.");
			}
			System.out.println();
		}else if(day == 6 || day == 7){
			System.out.println("This is weekend.");
			if(day == 6){
				System.out.println("Day is Saturday.");
			}else{
				System.out.println("Day is Sunday.");
			}
			System.out.println();
		}else{
			System.out.println("Invalid input.");
			System.out.println();
		}
	}
	//Define main method:
	public static void main(String[] args){
		//Create an object:
		WeekdayWeekend weekdayWeekend = new WeekdayWeekend();
		
		//Call a method:
		weekdayWeekend.checkInput(4);
		weekdayWeekend.checkInput(7);
		weekdayWeekend.checkInput(59);
		weekdayWeekend.checkInput(-23);
	}
}