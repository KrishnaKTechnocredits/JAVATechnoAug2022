package swapnilMaheshwari.DivisibleProgramms;

public class SecondLastNumDivisibleBy3and7 {
	void processData(int startRange , int endRange) 
	{
		int count=0;
			for ( ;endRange>startRange; endRange--)
			{
			
				if ( endRange%3==0 && endRange%7==0) 
				{
					
					count++;
				}
				if (count==2)
				{ 
					System.out.println(endRange);
					break;
				}
					
			}
	}
	public static void main ( String[] args)
	{
		SecondLastNumDivisibleBy3and7 secondLastNumDivisibleBy3and7 = new SecondLastNumDivisibleBy3and7();
		secondLastNumDivisibleBy3and7.processData(10,200);	}
}
