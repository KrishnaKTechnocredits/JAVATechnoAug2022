package pallaviRaut;

class NumDivisibily3and7
{
	void printNumDivisibleBy3and7(int startNum, int endNum)
	{	
		int count=1;
		System.out.println("Last three number divisible By 3 and 7 are :");
		for(int i=endNum;i>=startNum;i--)
		{
			if (i%3==0 && i%7==0)
			{
			   if (count<=3)
			   {
				 System.out.println(" "+i);
				 count++;
				 //break;
			   } 
			}
		}	
	}
	
	public static void main(String [] args)
	{
		NumDivisibily3and7 numDivisibily3and7=new NumDivisibily3and7();
		numDivisibily3and7.printNumDivisibleBy3and7(10,200);
	}
}