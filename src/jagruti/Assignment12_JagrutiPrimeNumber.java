/*Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range*/

package jagruti;

public class Assignment12_JagrutiPrimeNumber 
{
	int primeSum;
	int primeCount;
	int primeAverage;
	
	void checkPrimeNum(int num)
	{
		boolean primeFlag = true;	
		for(int index=2;index<=num/2;index++)
		{
			if(num%index == 0)
			{ 
				primeFlag = false;
				break;
		    }
	    }
		if(primeFlag == true)
		{
			System.out.println(num + " is a prime number");
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum/primeCount;
		}
	}
	
	void printAllPrime(int startNum, int endNum) 
	{
		for(int num=startNum;num<=endNum;num++) 
		{
			checkPrimeNum(num);
		}
		System.out.println("\nSum of Prime Numbers is : " +primeSum);
		System.out.println("\nTotal Prime Numbers is :" +primeCount);
	}
		
	public static void main(String[] args)
	{
		Assignment12_JagrutiPrimeNumber assignment12_JagrutiPrimeNumber = new Assignment12_JagrutiPrimeNumber();
		assignment12_JagrutiPrimeNumber.printAllPrime(100, 120);
	}

}
