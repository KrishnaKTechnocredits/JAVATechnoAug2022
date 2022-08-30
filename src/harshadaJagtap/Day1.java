//printing Day by day index
package harshadaJagtap;
class Day1{
	void processData(int dayInd){
		if (dayInd==1)
			System.out.println("Monday");
		else if (dayInd==2)
			System.out.println("Tuesday");
		else if (dayInd==3)
			System.out.println("Wednsday");
		else if (dayInd==4)
			System.out.println("Thursday");
		else if (dayInd==5)
			System.out.println("Friday");
		else if (dayInd==6)
			System.out.println("Saturday");
		else if (dayInd==7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid Day Index");
	}
	public static void main (String[]args){
		Day1 day=new Day1();
		day.processData(2);
		day.processData(-3);
		day.processData(6);
	}
}