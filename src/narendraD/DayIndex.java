package narendraD;

class DayIndex{
	
	void processData(int index) {
		if(index==1)
		{
			System.out.println("It's a Monday");
		}
		else if(index==2)
		{
			System.out.println("It's a Tuesday");
		}
		else if(index==3)
		{
			System.out.println("It's a Wednesday");
		}
		else if(index==4)
		{
			System.out.println("It's a Thursday");
		}
		else if(index==5)
		{
			System.out.println("It's a Friday");
		}
		else if(index==6)
		{
			System.out.println("It's a Saturday");
		}
		else if(index==7)
		{
			System.out.println("It's a Sunday");
		}
		else
		{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args) {
		DayIndex dayindex = new DayIndex();
		
		dayindex.processData(1);
		dayindex.processData(3);
		dayindex.processData(5);
		dayindex.processData(7);
		dayindex.processData(-1);
		dayindex.processData(8);
	}
}