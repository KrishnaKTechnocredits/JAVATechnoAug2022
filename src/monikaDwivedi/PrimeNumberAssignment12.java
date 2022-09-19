/*Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within the same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range*/


package monikaDwivedi;

class PrimeNumberRange{
	static int primeCount;
	static int primeSum;
	static int primeAverage;
	
	static void primeNum(int num){
		int count = 0;
		for(int index = 2; index <= num/2; index++){
			if (num % index == 0){
				count = 1;
				break;
			}
		}
		if(count == 0){
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum / primeCount;
		}
	}
	static void printPNInRange(int a, int b){
		//System.out.println("Prime No in the given range are: " );
		for (int num = a; num <= b; num++){
			primeNum(num);
		}
		System.out.println("Total numbers of prime number in the given range are:- "+ primeCount);
		System.out.println("Sum of all the prime number in the range is:- "+ primeSum);
		System.out.println("Average of all the prime numbers in the range is:- "+primeAverage);		
	}
	public static void main(String[] args){
		PrimeNumberRange.printPNInRange(100,120);
	}	
}
