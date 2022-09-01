package nehaniG;

class PrimeNumberParamethod {
	int primeCount;
	int primeSum;
	int primeAverage;
	
	void printPrimeNumber(int num) {
		boolean primeFlag = true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				primeFlag = false;
				break;
			}
		}
		if(primeFlag == true) {
			System.out.println(num + " is a prime number");
		    primeCount++;
		    primeSum = primeSum + num;
		    primeAverage = primeSum/primeCount;
		}	
		
	}
	
	void primeRange(int startRange, int endRange)
	{
			System.out.println("Prime number within the given range are: ");
			for(int num=startRange;num<=endRange;num++){
				printPrimeNumber(num);
			}
			System.out.println("\nTotal Count of prime number within given range is:\n" +primeCount);
			System.out.println("\nSum of prime number within given range is:\n" +primeSum);
			System.out.println("\nAverage of prime number within given range is:\n" +primeAverage);
			
	}
		
	public static void main(String[] args)
	{
			PrimeNumberParamethod primeNumberParamethod = new PrimeNumberParamethod();
			primeNumberParamethod.primeRange(100,120);
	}
}	


