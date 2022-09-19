package harshalRane.Assignments.assignment12PrimeNumbersParam;

class PrimeNumbersParam{
	int primeCount;
	int primeSum;
	int primeAverage;
		
	void printPrimeNumbers(int num)
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
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum / primeCount;
			
		}
	}
	
	void primeRange(int startRange, int endRange){
		System.out.println("Prime Numbers within the given range are: ");
		for(int num=startRange;num<=endRange;num++)
		{
			printPrimeNumbers(num);	
		}
		System.out.println("\nTotal Count of prime numbers within given range is:\n" +primeCount);
		System.out.println("\nSum of prime numbers within given range is:\n" +primeSum );
		System.out.println("\nAverage of prime numbers within given range is:\n" +primeAverage);
	}
	
	public static void main(String[] args){
		new PrimeNumbersParam().primeRange(100,120);
	}
}