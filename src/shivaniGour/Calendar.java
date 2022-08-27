package shivaniGour;
class Calendar{
	 
	 void week(int weekindex){
		 if(weekindex >= 1 && weekindex <= 5)
			 System.out.println("Weekday");
		 else if(weekindex == 6 || weekindex == 7)
			 System.out.println("Weekend");
		 else
			 System.out.println("Invalid Number");
	 }
	 
	 void quarter(int qindex){
		 if(qindex >= 1 && qindex <= 3)
			 System.out.println("First Quarter");
		 else if(qindex >= 4 && qindex <= 6)
			 System.out.println("Second Quarter");
		 else if(qindex >= 7 && qindex <= 9)
			 System.out.println("Third Quarter");
		 else if(qindex >= 10 && qindex <= 12)
			 System.out.println("Fourth Quarter");
		 else
			 System.out.println("Invalid Number");
	 }
	 
	 void day(int dayindex){
		 if(dayindex == 1)
			 System.out.println("Monday");
		 else if(dayindex == 2)
			 System.out.println("Tuesday");
		 else if(dayindex == 3)
			 System.out.println("Wednesday");
		 else if(dayindex == 4)
			 System.out.println("Thursday");
		 else if(dayindex == 5)
			 System.out.println("Firday");
		 else if(dayindex == 6)
			 System.out.println("Saturday");
		 else if(dayindex == 7)
			 System.out.println("Sunday");
		 else
			 System.out.println("Invalid Number");
	 }
	 
	 public static void main (String[] args){
		 Calendar calendar = new Calendar();
		 calendar.week(2);
		 calendar.week(6);
		 calendar.quarter(5);
		 calendar.day(4);
	 }
}

