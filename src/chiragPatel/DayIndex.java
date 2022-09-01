package chiragPatel;
class DayIndex{

	void processData(int day){
		if (day==1){
			System.out.println("Monday");
		}else if (day==2){
			System.out.println("Tuesday");
		}else if (day==3){
			System.out.println("wednedsay");
		}else if (day==4){
			System.out.println("Thursday");
		}else if (day==5){
			System.out.println("Friday");
		}else if (day==6){
			System.out.println("Saturday");
		}else if (day==7){
			System.out.println("sunday");
		}else 
			System.out.println("invalid day index");
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.processData(1);
		dayIndex.processData(2);
		dayIndex.processData(5);
	}
}