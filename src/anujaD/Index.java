package anujaD;

class Index{
	
	void dayIndex(int day){
	if(day == 1)
		System.out.println("Today is monday");
	else if(day == 2)
		System.out.println("Today is Tuesday");
	else if(day == 3)
		System.out.println("Today is Wednesday");
	else if(day == 4)
		System.out.println("Today is Thursday");
	else if(day == 5)
		System.out.println("Today is friday");
	else
		System.out.println("Invalid Index");
		
	}
	
	void weekdays(int day){
			if(day >= 1 && day <= 5)
				System.out.println("It is a weekday");
			else if(day >=6 && day <=7)
				System.out.println("It is a Weekend");
			else
				System.out.println("Invalid Index");
				
		}
		
	void Quater(int month){
				if(month == 1 || month == 2 || month == 3) 
						System.out.println("This is FY2022 Q1");
				else if(month == 4 || month == 5 || month == 6) 
						System.out.println("This is FY2022 Q2");
				else if(month == 7 || month == 8 || month == 9) 
						System.out.println("This is FY2022 Q3");
				else if(month == 10 || month == 11 || month == 12) 
						System.out.println("This is FY2022 Q4");
				else
						System.out.println("Invalid Month Index");
					
			}
					public static void main(String[] args){
						Index  dayIndex1 = new Index();
						Index  weekDaysexample1 = new Index();
						Index  monthIndex1 = new Index();
						dayIndex1.dayIndex(1);
						dayIndex1.dayIndex(4);
						dayIndex1.dayIndex(-4);
						dayIndex1.dayIndex(-3);
						System.out.println("\n");
						weekDaysexample1.weekdays(4);
						weekDaysexample1.weekdays(6);
						weekDaysexample1.weekdays(8);
						System.out.println("\n");
						monthIndex1.Quater(2);
						monthIndex1.Quater(6);
						monthIndex1.Quater(10);
						monthIndex1.Quater(8);
						monthIndex1.Quater(15);
					}

}
