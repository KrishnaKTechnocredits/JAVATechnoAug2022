package harshalRane.basic;

class PrimeNumberWithMethods{
	int primeSum;
	int primeCount;
	int primeAverage;
	
	void checkPrimeNum(int num){
		boolean primeFlag = true;	
		for(int index=2;index<=num/2;index++){
			if(num%index == 0){ 
				primeFlag = false;
				break;
			}
		}
		if(primeFlag == true){
			System.out.println(num + " is a prime number");
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum/primeCount;
		}
	}
	
	void printAllPrime(int startNum, int endNum) {
		for(int num=startNum;num<=endNum;num++) {
			checkPrimeNum(num);
		}
		System.out.println("Sum of Prime Numbers is" +primeSum);
		System.out.println("Total Prime Numbers is" +primeCount);
	}
	
	
	
	public static void main(String[] args){
		new PrimeNumberWithMethods().printAllPrime(100, 150);
	}
}