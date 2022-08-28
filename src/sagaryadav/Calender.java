//Find a day based on dayIndex && monthIndex and quarterDisplay.

package sagaryadav;
class Calender{
	//Find weekdays or weekend based on dayIndex.
	void weekDisplay(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("It's a week day");
		
		else if(dayIndex<=6 && dayIndex>=7)
			System.out.println("It's a weekend so spend 5 hours for class");
		
		else
			System.out.println("You may be on other planet");		
	}
	
	//Find a day based on dayIndex. 
	void dayDisplay(int dayIndex){
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
		
		else if (dayIndex==6)
			System.out.println("Its a Saturday");
		
		else if (dayIndex==7)
			System.out.println("Its a Sunday");
		
		else
			System.out.println("Its Fun Day");		
	}
	
	//Find Quater based on month index.  
		void quarterDisplay(int monthIndex){
		if (monthIndex>=1 && monthIndex<=3)
			System.out.println("This is 1st Quarter of FY2022-23");
		
		else if (monthIndex>=4 && monthIndex<=6)
			System.out.println("This is 2nd Quarter of FY2022-23");
		
		else if (monthIndex>=7 && monthIndex<=9)
			System.out.println("This is 3rd Quarter of FY2022-23");
		
		else if (monthIndex>=10 && monthIndex<=12)
			System.out.println("This is 4th Quarter of FY2022-23");
		
		else if(monthIndex<1 || monthIndex>12)
			System.out.println("Earth has only 12 months in her Calender");		
	}
	
	public static void main(String[] args){
		Calender calender= new Calender();
		System.out.println("*********************************************");
		calender.weekDisplay(8);
		calender.dayDisplay(8);
		calender.quarterDisplay(17);
		System.out.println("*********************************************");
		calender.weekDisplay(4);
		calender.dayDisplay(6);
		calender.quarterDisplay(11);
		System.out.println("*********************************************");
		calender.weekDisplay(5);
		calender.dayDisplay(2);
		calender.quarterDisplay(9);	
		System.out.println("*********************************************");		
	}
}