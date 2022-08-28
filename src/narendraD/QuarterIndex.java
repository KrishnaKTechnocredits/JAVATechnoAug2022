package narendraD;

class QuarterIndex {
	
	void processData(int index) {
		if(index>=1 && index<=3)
		{
			System.out.println("Its a month "+index+": Quarter 1");
		}
		else if(index>=4 && index<=6)
		{
			System.out.println("Its a month "+index+": Quarter 2");
		}
		else if(index>=7 && index<=9)
		{
			System.out.println("Its a month "+index+": Quarter 3");
		}
		else if(index>=10 && index<=12)
		{
			System.out.println("Its a month "+index+": Quarter 4");
		}
		else
		{
			System.out.println("Invalid Index");
		}
	}
		
	public static void main(String[] args) {
		QuarterIndex quarterindex = new QuarterIndex();
			
		quarterindex.processData(1);
		quarterindex.processData(3);
		quarterindex.processData(6);
		quarterindex.processData(7);
		quarterindex.processData(9);
		quarterindex.processData(12);
		quarterindex.processData(15);
		quarterindex.processData(-2);
			
	}	
	
}