/*
 * Assignment - 14 : 2nd Sep'2022
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
package hindaviIngle;

public class Assignment14 {

	void isPrime(int num) {
		int counter = 0;
		int no = 2;
		while (counter < num) {
			int status = 0;
			
			for (int index = 2; index < no; index++) {
				if (no % index == 0) {
					status = 1;
					break;
				}
			}
			if (status == 0) {
				System.out.println(no);
				counter++;
			}
			no++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment14 primeExample = new Assignment14();
		System.out.println("First "+5+" Prime Numbers: \n ");
		primeExample.isPrime(5);
	}

}
