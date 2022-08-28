package technocredits;

class Example8{
	
	void printDayByIndex(int dayIndex){
		if(dayIndex==1){
			System.out.println("Its a Weekday");
			System.out.println("Monday");
		}else if(dayIndex==2){
			System.out.println("Its a Weekday");
			System.out.println("Tuesday");
		}else if(dayIndex == 3){
			System.out.println("Its a Weekday");
			System.out.println("wed");
		}else if(dayIndex == 4){
			System.out.println("Its a Weekday");
			System.out.println("thr");
		}else if(dayIndex == 5){
			System.out.println("Its a Weekday");
			System.out.println("fri");
		}else if(dayIndex == 6){
			System.out.println("Its a Weekend");
			System.out.println("sat");
		}else if(dayIndex == 7){
			System.out.println("Its a Weekend");
			System.out.println("sun");
		}else{
			System.out.println("Invalid");
		}
	}
	
	void printDayByIndexOptimized(int dayIndex){
		if(dayIndex >=1 && dayIndex <=5){
			System.out.println("Its a Weekday");
			if(dayIndex == 1){
				System.out.println("Monday");
			}else if(dayIndex == 2){
				System.out.println("Tuesday");
			}
		}else if(dayIndex == 6 || dayIndex ==7){
			System.out.println("Its a Weekend");
			if(dayIndex == 6){
				System.out.println("sat");
			}else if(dayIndex == 7){
				System.out.println("sun");
			}
		}else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args){
	
	}
}