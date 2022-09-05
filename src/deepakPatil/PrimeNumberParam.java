/*
 Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range
 */
package deepakPatil;

public class PrimeNumberParam {

	int count;
	int sum;

	void isPrime(int num) {
		boolean status = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println(num + " is prime number");
			count++;
			sum = sum + num;
		}
	}

	void findPrimeInRange(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			isPrime(num);
		}

		double avg = sum / count;
		System.out.println("\nTotal prime number within " + startIndex + " to " + endIndex + " is " + count);
		System.out.println("\nSum of total prime number within " + startIndex + " to " + endIndex + " is " + sum);
		System.out.println("\nAverage of total prime number within " + startIndex + " to " + endIndex + " is " + avg);
	}

	public static void main(String[] args) {
		new PrimeNumberParam().findPrimeInRange(10, 120);
	}
}
