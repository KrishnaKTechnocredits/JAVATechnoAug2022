/*
Program 3 : Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1
Month index is 4 or 5 or 6 -> FY2022 Q2
Month index is 7 or 8 or 9 -> FY2022 Q3
Month index is 10 or 11 or 12 -> FY2022 Q4
Any other index should be considered as invalid
*/

package akankshaVyas;
class Quater{

	void processData(int monthIndex){
	
		if(monthIndex>=1 && monthIndex<=3)
		System.out.println("FY2022 Q1");
		else if(monthIndex>=4 && monthIndex<=6)
		System.out.println("FY2022 Q2");
		else if(monthIndex>=7 && monthIndex<=9)
		System.out.println("FY2022 Q3");
		else if(monthIndex>=10 && monthIndex<=12)
		System.out.println("FY2022 Q4");
		else
		System.out.println("Invalid");
	}
	
	public static void main(String[] args){
		Quater quater = new Quater();
		quater.processData(1);
		quater.processData(5);
		quater.processData(9);
		quater.processData(12);
		quater.processData(0);
		quater.processData(16);
		quater.processData(-1);
	}
}