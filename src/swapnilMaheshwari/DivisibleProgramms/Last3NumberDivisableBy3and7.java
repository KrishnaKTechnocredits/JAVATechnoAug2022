package swapnilMaheshwari.DivisibleProgramms;

public class Last3NumberDivisableBy3and7
{
	void processData(int startRange , int endRange) 
	{
		int count=0;
			for ( ;endRange>startRange; endRange--)
			{
			
				if ( endRange%3==0 && endRange%7==0) 
				{
					System.out.println(endRange);
					count++;
				}
				if (count==3)
					break;
			}
	}
	public static void main ( String[] args)
	{
		Last3NumberDivisableBy3and7 last3NumberDivisableBy3and7 = new Last3NumberDivisableBy3and7();
		last3NumberDivisableBy3and7.processData(10,200);
	}
	
}

