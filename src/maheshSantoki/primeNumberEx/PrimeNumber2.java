/*Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2 3 5 7 11
*/
package maheshSantoki.primeNumberEx;

public class PrimeNumber2 {
	int c = 0;

	void checkPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			c++;
			System.out.println(n);
		}
	}

	void printPrime(int m) {
		System.out.println("First " + m + " prime numbers : ");
		int n = 2;
		while (n >= 2 && c != m) {
			checkPrime(n);
			++n;
		}
	}

	public static void main(String[] a) {
		PrimeNumber2 primenumber2 = new PrimeNumber2();
		primenumber2.printPrime(5);

	}
}