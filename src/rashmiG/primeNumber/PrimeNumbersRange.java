/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range*/

package rashmiG.primeNumber;

class PrimeNumbersRange {
	int primeCount = 0;
	int primeSum = 0;

	void checkPrime(int num) {
		boolean primeFlag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag) {
			System.out.println(num);
			primeCount++;
			primeSum = primeSum + num;
		}
	}

	void printAllPrimeNumbers(int startNum, int endNum) {
		System.out.println("Prime numbers between range "+startNum + "->" + endNum +" are :");
		for (int num = startNum; num <= endNum; num++) {
			checkPrime(num);
		}
		System.out.println(
				"Total number of prime numbers between range " + startNum + "->" + endNum + " are: " + primeCount);
		System.out.println("Sum of all prime numbers between range " + startNum + "->" + endNum + " is: " + primeSum);
		System.out.println("Average of prime numbers between range " + startNum + "->" + endNum + " is: "
				+ (primeSum / primeCount));
	}

	public static void main(String[] args) {
		new PrimeNumbersRange().printAllPrimeNumbers(2, 20);
	}
}