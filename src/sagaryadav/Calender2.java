//Find a day based on dayIndex && monthIndex and quarterDisplay.

package sagaryadav;
class Calender2{
	//Find weekdays or weekend based on dayIndex.
	void weekDisplay(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("It's a week day");
				
				if (dayIndex==1)
					System.out.println("Its a Monday");
		
				else if (dayIndex==2)
					System.out.println("Its a Tuesday");
		
				else if (dayIndex==3)
					System.out.println("Its a Wednesday");
		
				else if (dayIndex==4)
					System.out.println("Its a Thursday");
		
				else if (dayIndex==5)
					System.out.println("Its a Friday");
		
				else
					System.out.println("Its Fun Day");		
		
		}		
		else if(dayIndex<=6 && dayIndex>=7){
			System.out.println("It's a weekend so spend 5 hours for class");{
				if (dayIndex==6)
					System.out.println("Its a Saturday");
		
				else if (dayIndex==7)
					System.out.println("Its a Sunday");
			}
		}
		else
			System.out.println("You may be on other planet");		
	}
	
	public static void main(String[] args){
		Calender2 calender2= new Calender2();
		System.out.println("*********************************************");
		calender2.weekDisplay(8);
		System.out.println("*********************************************");
		calender2.weekDisplay(4);
		System.out.println("*********************************************");
		calender2.weekDisplay(5);
		System.out.println("*********************************************");		
	}
}