/*Assignment 14 :
 * Using While loop
Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.*/
package ankitaBarwad;

public class PrimeNumberUsingWhile {

	int count;

	void printPrimeNumber(int number) {
		int index = 2;
		boolean flag = true;
		while (index <= (number / 2)) {
			if (number % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag == true) {
			System.out.print(number + " ");
			count++;
		}
	}

	void passNumberInLoop(int nPrimeNumber) {
		System.out.println("First " + nPrimeNumber + " Prime Numbers are : ");
		for (int number = 2; count < nPrimeNumber; number++) {
			printPrimeNumber(number);
		}
	}

	public static void main(String[] args) {
		PrimeNumberUsingWhile primeNumberUsingWhile1 = new PrimeNumberUsingWhile();
		primeNumberUsingWhile1.passNumberInLoop(5);
		System.out.println("\n");
		PrimeNumberUsingWhile primeNumberUsingWhile2 = new PrimeNumberUsingWhile();
		primeNumberUsingWhile2.passNumberInLoop(10);
		System.out.println("\n");
		PrimeNumberUsingWhile primeNumberUsingWhile3 = new PrimeNumberUsingWhile();
		primeNumberUsingWhile3.passNumberInLoop(16);
	}
}
