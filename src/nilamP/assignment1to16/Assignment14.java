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
package nilamP.assignment1to16;



public class Assignment14 {
	int count;

	boolean primeFlag;

	void CheckPrimeNumber(int num) {

		primeFlag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;

				break;
			}

		}
		if (primeFlag == true) {
			count++;
			System.out.println(num);
		}
	}

	void printAllPrime(int startNum) {
		int num = 2;
		System.out.println("Following are the First 5 Prime Numbers : ");
		while (num >= 2 && count != startNum) {
			CheckPrimeNumber(num);
			num++;
		}

	}

	public static void main(String[] args) {
System.out.println("Assignment 14 output : ");
		new Assignment14().printAllPrime(5);

	}
}
