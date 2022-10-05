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
              11*/

package apurvaBabel.Assignment11to20;

public class Assignment14_PrimeNumWhileLoop {
	void printNPrimeNumbers(int n) {
		int count = 0;
		int num = 2;

		while (count != n) {
			boolean flag = true;
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		Assignment14_PrimeNumWhileLoop primeNumWhileLoop = new Assignment14_PrimeNumWhileLoop();
		primeNumWhileLoop.printNPrimeNumbers(5);
	}
}
