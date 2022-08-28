package narendraD;

class WeekdayIndex {
	
	void processData(int index) {
		if(index >=1 && index <=5)
		{
			System.out.println("Day "+index+": It's a Weekday");
		}
		else if(index ==6 || index ==7)
		{
			System.out.println("Day "+index+": It's a Weekend");
		}
		else
		{
			System.out.println("Invalid Index");
		}
	}
		
	public static void main(String[] args) {
		WeekdayIndex weekdayindex = new WeekdayIndex();
			
		weekdayindex.processData(1);
		weekdayindex.processData(3);
		weekdayindex.processData(6);
		weekdayindex.processData(7);
		weekdayindex.processData(9);
		weekdayindex.processData(-2);
			
	}	
	
}