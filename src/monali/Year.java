package monali;
class Year
{
	void ProcessData(int month)
	{
		if(month>=1 &&month<=4)
		{
			System.out.println("Q1");
		}
		else if(month>4 &&month<=8)
		{
			System.out.println("Q2");
		}
		else if(month>8 && month<=12)
		{
			System.out.println("Q3");
		}
		else
		{
		System.out.println("Invalid Data");
		}
				
	}
	public static void main(String[] args)
	{
		Year year=new Year();
		year.ProcessData(10);
		year.ProcessData(13);
		year.ProcessData(2);
		year.ProcessData(5);
	}
		
}
	
							
	