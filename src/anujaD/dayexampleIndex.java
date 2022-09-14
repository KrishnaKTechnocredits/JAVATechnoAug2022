package anujaD;

class dayexampleIndex{
	
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
	
			public static void main(String[] args){
					dayexampleIndex  dayIndex1 = new dayexampleIndex();
					dayIndex1.dayIndex(1);
					dayIndex1.dayIndex(4);
					dayIndex1.dayIndex(-4);
					dayIndex1.dayIndex(-3);
					
			}
}

