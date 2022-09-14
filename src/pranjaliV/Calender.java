/*Program 1: Find day based on dayIndex.
Program 2: Find weekday or weekend based on dayIndex.
Program 3: Find Quater based on month Index.*/
package pranjaliV;

class Calender{

	void procData1(int dayIndex){
		if (dayIndex==1)
			System.out.println(dayIndex + " - Monday");
		else if (dayIndex==2)
			System.out.println(dayIndex + " - Tuesday");
		else if (dayIndex==3)
			System.out.println(dayIndex + " - Wednesday");
		else if (dayIndex==4)
			System.out.println(dayIndex + " - Thrusday");
		else if (dayIndex==5)
			System.out.println(dayIndex + " - Friday");
		else if (dayIndex==6)
			System.out.println(dayIndex + " - Saturday");
		else if (dayIndex==7)
			System.out.println(dayIndex + " - Sunday");
		else
			System.out.println(dayIndex + " - Invalid Day Index");
	}
	
	void procData2(int dayIndex){
		if (dayIndex>=1 && dayIndex<=5)
			System.out.println(dayIndex + " - Weekday");
		else if (dayIndex==6 || dayIndex==7)
			System.out.println(dayIndex + " - Weekend");
		else
			System.out.println(dayIndex + " - Invalid Day Index");
	}
	
	void procData3(int monIndex){
		if (monIndex>=1 && monIndex<=3)
			System.out.println(monIndex + " - FY2022 Q1");
		else if (monIndex>=4 && monIndex<=6)
			System.out.println(monIndex + " - FY2022 Q2");
		else if (monIndex>=7 && monIndex<=9)
			System.out.println(monIndex + " - FY2022 Q3");
		else if (monIndex>=10 && monIndex<=12)
			System.out.println(monIndex + " - FY2022 Q4");
		else
			System.out.println(monIndex + " - Invalid Month Index");
	}
	
	public static void main(String[] agrs){
		Calender calender = new Calender();
		calender.procData1(1);
		calender.procData1(4);
		calender.procData1(7);
		calender.procData1(0);
		calender.procData1(8);
		calender.procData2(1);
		calender.procData2(6);
		calender.procData2(9);
		calender.procData3(1);
		calender.procData3(6);
		calender.procData3(9);
		calender.procData3(12);
		calender.procData3(13);

	}	
}