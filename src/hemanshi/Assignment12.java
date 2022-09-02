package hemanshi;

public class Assignment12 {
	int Count;
	int Sum;
	int Average;
		
	void PrintPrimeNumbers(int num)
	{
		boolean primeFlag = true;
		
		for(int index=2;index<=num/2;index++)
		{
			if(num%index==0)
			{
				primeFlag = false;	
				break;				
			}
		}
		if(primeFlag==true)
		{
			System.out.println(num);
			Count++;
			Sum = Sum + num;
			Average = Sum / Count;
			
		}

}
	void PrimeRange(int startRange, int finalRange){
		System.out.println("Prime Numbers with the given range are: ");
		for(int num=startRange;num<=finalRange;num++)
		{
			PrintPrimeNumbers(num);	
		}
		System.out.println("\nTotal Count of prime numbers with given range is:\n" +Count);
		System.out.println("\nSum of prime numbers with given range is:\n" +Sum );
		System.out.println("\nAverage of prime numbers with given range is:\n" +Average);
	}
	
	public static void main(String[] args){
		new Assignment12().PrimeRange(100,120);
	}
}