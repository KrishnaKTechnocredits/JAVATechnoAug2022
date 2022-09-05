package harshadaJagtap.LoopExapmples;

public class PrimeNumbers {
	  int count=0;
	  int sum=0;
	
	
	void checkPrime(int num) {
		
		boolean primeFlag=true;
		if(num>1) {
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				primeFlag=false;
				break;
			}
		}
		if (primeFlag==true) {
			System.out.println(num + " is a prime number");
			count++;
			sum=sum+num;	
		}
		}
	}
	
	void checkPrimeRange(int startRange, int endRange) {
		for(int range=startRange; range<=endRange; range++) {
			checkPrime(range);
		}
	}

	public static void main(String[] args) {
		PrimeNumbers primeNumbers= new PrimeNumbers();
		primeNumbers.checkPrime(15);
		primeNumbers.checkPrimeRange(100, 120);
		System.out.println("Total number of prime numbers = " + primeNumbers.count);
		System.out.println("Sum of prime numbers = " + primeNumbers.sum);
		int average=primeNumbers.sum/primeNumbers.count;
		System.out.printf("Average of prime numbers = " + average);
	}
	
}
