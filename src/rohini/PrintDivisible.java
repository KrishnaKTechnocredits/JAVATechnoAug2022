package rohini;

class PrintDivisible {

	void divisibleBy37(int start, int end) 
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(i%3==0 && i%7==0)
			{
				System.out.println(i);
				count++;
			}
			if(count==3)
			break;
		}
	}

	public static void main(String[] args)
	{
		PrintDivisible printDivisible=new PrintDivisible();
		printDivisible.divisibleBy37(20, 100);
	}
}
