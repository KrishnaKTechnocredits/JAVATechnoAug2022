package harshadaJagtap;


public class FirstPrimeNumbers {
	
	void findPrime(int range) {
		int a=2;
		int count=0;
		while(true)
		{
			int isPrime = checkPrime(a);
			if(isPrime!= 0 && count<range)
			{
				System.out.println(isPrime + " is a prime number");
				count++;
			}
			
			if(count>=range)
				break;
			
			a++;
		}
		
	}
	
	int checkPrime(int a) {
		
		boolean primeFlag=true;
		if(a>1) {
		for(int index=2; index<=a/2; index++) {
			if(a%index==0) {
				primeFlag=false;
				break;
			}
		}
		}
		
		if(primeFlag)
			return a;
		
		return 0;
	}
	
	public static void main(String[] args)
	{
		FirstPrimeNumbers f = new FirstPrimeNumbers();
		f.findPrime(5);
		
	}
}
	

