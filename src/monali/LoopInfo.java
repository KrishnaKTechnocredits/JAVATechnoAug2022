package monali;
class LoopInfo
{
	void PrintEven(int start_index,int end_index)
	{	
		System.out.println("Even numbers between "+start_index+" and "+end_index+" are :");
		for( int index=start_index; index<=end_index; index++)
		{
		if(index%2==0)
			{	
				System.out.println(index);
			}
		}
	}
	void PrintDivisbleby5(int start_index,int end_index)
	{
		System.out.println("Numbers divisble by 5 are:");
		for(int index=start_index;index<=end_index;index++)
		{
			if(index%5==0)
			{
				System.out.println(index);
			}
		}
	}
	void PrintDivisbleby5and3(int start_index,int end_index)
	{
		System.out.println("Numbers divisble by 5 and 3 are ");
			
		for(int index=start_index;index<=end_index;index++)
		{
			if(index%5==0 &&index%3==0)
			{
				System.out.println(index);
			}
		}
	}
	void PrintDivisibleby7or13(int start_index,int end_index)
	{
		System.out.println("Numbers divisble by 7 and 13 are " );
		for(int index=start_index;index<=end_index;index++)
		{
			if(index%7==0 || index%13==0)
			{
				System.out.println(index);
			}
		}
	}
	void SumofallNumbers(int start_index,int end_index)
	{
		System.out.println("Addition of numbers is:");
		int sum=0;
		for(int index=start_index;index<=end_index;index++)
		{
			 sum = sum + index;
		}
			System.out.println(sum);
		
			
	}	
	void DifferenceofOddEeven(int start_index ,int end_index)
	{
		int diff,sum1=0,sum=0;
		for(int index=start_index;index<=end_index;index++)
		{
			if(index%2==0)
			{
				sum=sum+index;
			}
			else
			{
				sum1=sum1+index;
			}
			
			
		}
		diff=sum1-sum;
		System.out.println("the difference of odd and even number is :\n" + diff);
	}
	void OddNumbersInReverese(int start_index,int end_index)
	{
		System.out.println("The odd number in reverse order is:");
		for(int index=end_index;index>=start_index;index--)
		{
			if(index%2!=0)
			{
			System.out.println(index);
			}
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		LoopInfo loopinfo =new LoopInfo();
		loopinfo.PrintEven(10,15);
		loopinfo.PrintDivisbleby5(10,30);
		loopinfo.PrintDivisbleby5and3(5,18);
		loopinfo.PrintDivisibleby7or13(5,40);
		loopinfo.SumofallNumbers(1,5);
		loopinfo.DifferenceofOddEeven(3,9);
		loopinfo.OddNumbersInReverese(10,20);
	}
}
			