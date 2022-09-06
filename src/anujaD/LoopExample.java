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
package anujaD;

public class LoopExample {
	int count;

	void primeNumbers(int num) {
		boolean flag = true;
		for (int Index = 2; Index <= num / 2; Index++) {
			if (num % Index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			count++;
			System.out.println(num);
		}
	}
	void printPrimeNumber(int number) {
		int num =2;
		System.out.println("Print first N prime numbers: ");
		
		while(num>=2 && count !=number) {
			primeNumbers(num);
			num++;
			
		}
	}
	public static void main(String[] args) {
		new LoopExample().printPrimeNumber(5);
		
	}
}
