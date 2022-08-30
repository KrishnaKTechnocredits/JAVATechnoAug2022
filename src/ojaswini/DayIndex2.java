package ojaswini;

public class DayIndex2 
{
	void processData(int day) 
	{
		if(day==1&&day==2)
		{
			System.out.println("number" + day + "is weekend");
		}
		else if(day==3&&day==4)
		{
			System.out.println("number" + day + "is weekend");
		}
		else if(day==5)
		{
			System.out.println("number" + day + "is weekend");
		}
		else if(day==6||day==7)
		{
			System.out.println("number" + day + "is weekday");
		}
		else 
		{
			System.out.println("INVALID INDEX");
		}
	}
	public static void main(String[] args)
	{
		DayIndex2 dayindex2 = new DayIndex2();
		dayindex2.processData(9);
		dayindex2.processData(7);
		dayindex2.processData(5);
		dayindex2.processData(-1);
	}
}
