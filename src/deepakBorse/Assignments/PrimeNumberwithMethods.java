/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range
*/

package deepakBorse.Assignments;

public class PrimeNumberwithMethods {
	int primecount, Sumprime;

	void checkPrimeNumber(int num) {
		boolean primeFlag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag == true) {
			System.out.println(num + " Number is Prime");
			primecount++;
			Sumprime = Sumprime + num;
		}

	}

	void printAllPrime(int startNum, int endNum) {
		for (int num = startNum; num <= endNum; num++) {
			checkPrimeNumber(num);
		}
		System.out.println("Total number of Prime numbers from range (" + startNum + "," + endNum + ") : " + primecount);
		System.out.println("Sum of Prime numbers from range (" + startNum + "," + endNum + ") : " + Sumprime);
		System.out.println("Average of Prime numbers from range (" + startNum + "," + endNum + ") : " + (Sumprime / primecount));
	}

	public static void main(String[] args) {
		new PrimeNumberwithMethods().printAllPrime(100, 150);

	}
}
