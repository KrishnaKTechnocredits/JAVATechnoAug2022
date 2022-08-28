package nikitaPhase;
class Days{
	
	void findday(int dayIndex){
		if(dayIndex == 1){
			System.out.println("Monday");
		}
		else if (dayIndex == 2){
			System.out.println("Tuesday");
		}
		else if (dayIndex == 3){
			System.out.println("Wednesday");
		}
		else if (dayIndex == 4){
			System.out.println("Thursday");
		}
		else if (dayIndex == 5){
			System.out.println("Friday");
		}
		else if (dayIndex == 6){
			System.out.println("Saturday");
		}
		else if (dayIndex == 7){
			System.out.println("Sunday");
		}
		else{
			System.out.println("Invalid day");
		}
	}

    void weekday(int dayIndex){
		if (dayIndex >=1 && dayIndex <=5){
			System.out.println("It is a weekday");
		}
	    else if (dayIndex ==6 && dayIndex ==7){
			System.out.println("It is a weekend");
		}
		else{
			System.out.println("It is a valid Index");
		}
	}
	void quater(int monthIndex){
		if(monthIndex >=1 && monthIndex <=3){
			System.out.println("FY2022  Q1");
		}
		else if(monthIndex >=4 && monthIndex <=6){
			System.out.println("FY2022  Q2");
		}
		else if(monthIndex >=7 && monthIndex <=9){
			System.out.println("FY2022  Q3");
		}
		else if(monthIndex >=10 && monthIndex <=12){
		    System.out.println("FY2022  Q4");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	public static void main(String [] args){
		Days days = new Days ();
		days.findday(-3);
		days.findday(5);
		days.findday(1);
		days.findday(13);
		System.out.println();
		
		days.weekday(-3);
		days.weekday(5);
		days.weekday(4);
		
		System.out.println();
		days.quater(3);
		days.quater(6);
		days.quater(7);
		days.quater(8);
		days.quater(20);
	}
}