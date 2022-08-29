//printing in which quarter month falls
package harshadaJagtap;
class Day2
{
	void processData(int monthInd)
	{
		if (monthInd==1 || monthInd==2 || monthInd==3)
			System.out.println("Quarter 1");
		else if (monthInd==4 || monthInd==5 || monthInd==6)
			System.out.println("Quarter 2");
		else if(monthInd==7 || monthInd==8 || monthInd==9)
			System.out.println("Quarter 3");
		else if	(monthInd==10 || monthInd==11 || monthInd==12)
			System.out.println("Quarter 4");
		else
			System.out.println("Invalid Month Index");
	}
		public static void main(String[]args)
		{
		Day2 day=new Day2();
		day.processData(2);
		day.processData(-3);
		day.processData(6);
		}
}	