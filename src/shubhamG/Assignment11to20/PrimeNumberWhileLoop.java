package shubhamG.Assignment11to20;

/*Assignment - 14 : 2nd Sep'2022
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
public class PrimeNumberWhileLoop {
	int count = 0;

	void primeNumbers(int num) {
		boolean primeFlag = true;
		int index = 2;
		while (index <= (num/2)) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
			index++;
		}
		if (primeFlag == true) {
			count++;
			System.out.println(num);
		}
	}

	void printFirstN(int N) {
		int num = 2;
		System.out.println("First "+N+" Prime numbers are");
		while (num >= 2 && count < N) {
			primeNumbers(num);
			num++;
		}
	}

	public static void main(String[] args) {

		new PrimeNumberWhileLoop().printFirstN(5);
	}
}
