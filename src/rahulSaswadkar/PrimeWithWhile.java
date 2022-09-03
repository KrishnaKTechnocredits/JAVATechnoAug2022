/*
Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11
 */

package rahulSaswadkar;

public class PrimeWithWhile {
	public static void main(String[] args) {
		PrimeWithWhile pritmeWithWhile = new PrimeWithWhile();
		pritmeWithWhile.findPrimeNumbers(5);

	}

	int count;

	void findPrimeNumber(int num) {
		boolean status = true;
		if (num > 0) {
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					status = false;
					break;
				}
			}
			if (status == true) {
				System.out.println(num);
				count += 1;
			}
		} else {
			System.out.println(num + " is not a valid number");
		}
	}

	void findPrimeNumbers(int counter) {
		int startIndex = 2;
		while (count <= counter) {
			findPrimeNumber(startIndex);
			if (count == counter) {
				break;
			}
			startIndex++;
		}
	}
}
