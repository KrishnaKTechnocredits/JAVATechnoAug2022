package ojaswini;

public class DayIndex {
	void processData(int day)
	{
		if(day==1)
		{
			System.out.println("Monday");
		}
		else if(day==2)
		{
			System.out.println("Tuesday");
		}
		else if(day==3) 
		{
			System.out.println("Wednesday");
		}
		else if(day==4)
		{
			System.out.println("Thursday");
		}
		else if(day==5)
		{
			System.out.println("Friday");
		}
		else if(day>1||day<7)
		{
			System.out.println("Invalid Index");
		}
		
	}
	public static void main(String[] args)
	{
		DayIndex dayindex=new DayIndex();
		dayindex.processData(8);
		dayindex.processData(5);
	}

}
