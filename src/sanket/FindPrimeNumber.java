package sanket;

public class FindPrimeNumber{
	
	double primeCounter = 0;
	double primeSum = 0;
	double primeAverage = 0;
	
	void findSpecificPrimeNumber(int num){
		boolean primeFlag = true;
		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				primeFlag = false;
				//System.out.println(num + "is a not a prime number.");
				break;
			}
		}
		if(primeFlag == true){
			System.out.println(num + " is a prime number.");	
			primeCounter++;
			primeSum = primeSum + num;
			primeAverage = primeSum/primeCounter;
		}	
	}
	
	void findPrimeNumberInRange (int startR, int endR){
		for(int num=startR;num<=endR;num++){
			findSpecificPrimeNumber(num);
		}
		System.out.println("Total number of prime numbers between range "+startR+" and "+endR+" are: " + primeCounter);
		System.out.println("Sum of prime numbers between range "+startR+" and "+endR+" is: " + primeSum);
		System.out.println("Average of prime numbers between range "+startR+" and "+endR+" is: " + primeAverage);
	}
	
	public static void main(String[] args){
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
		findPrimeNumber.findPrimeNumberInRange(100,120);
	}
}