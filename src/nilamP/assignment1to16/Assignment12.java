/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within the same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range
*/

package nilamP.assignment1to16;

public class Assignment12 {
	int primeCount;
	int primeSum;
	int primeAverage;

	void printPrimeNumbers(int num) {
		boolean primeFlag = true;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag == true) {
			System.out.println(num);
			primeCount++;
			primeSum = primeSum + num;
			primeAverage = primeSum / primeCount;

		}
	}

	void primeRange(int startRange, int endRange) {
		System.out.println("Prime Numbers within the given range are: ");
		for (int num = startRange; num <= endRange; num++) {
			printPrimeNumbers(num);
		}
		System.out.println("Total Count of prime numbers within given range is: " + primeCount);
		System.out.println("Sum of prime numbers within given range is: " + primeSum);
		System.out.println("Average of prime numbers within given range is: " + primeAverage);
	}

	public static void main(String[] args) {
		System.out.println("Assignment 12 output : ");
		new Assignment12().primeRange(100, 120);
	}
}
