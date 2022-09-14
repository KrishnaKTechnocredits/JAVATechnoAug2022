
/*1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10*/


package manjiri.arrayEx;

public class ArrayEx1 {

	private boolean isPrime(int num) {
		boolean flag = true;

		for (int index = 2; index <= Math.sqrt(num); index++) {
			if (num % index == 0) {
				flag = false;
			}
		}
		return flag;
	}

	private boolean getNumDivisibleBy5And7(int num) {
		if (num % 5 == 0 && num % 7 == 0)
			return true;
		else
			return false;
	}

	private boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	int getSumOfNonPrimeNumbersInArray(int[] input) {
		int sum = 0;

		for (int index = 0; index < input.length; index++) {
			if (!isPrime(input[index])) {
				sum = sum + input[index];
			}
		}
		return sum;
	}

	int getSumOfNonPrimeAndDivisible5And7NumbersInArray(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			boolean primeNumFlag = isPrime(input[index]);
			boolean isDivisibleFlag = getNumDivisibleBy5And7(input[index]);

			if (!primeNumFlag && isDivisibleFlag) {
				sum = sum + input[index];
			}
		}
		return sum;
	}

	int getSumOfEvenNumbersInArray(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (isEven(input[index]))
				sum = sum + input[index];
		}
		return sum;
	}

	int getDifferneceOfEvenAndOddNumbers(int[] input) {
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < input.length; index++) {
			if (isEven(input[index]))
				evenSum += input[index];
			else
				oddSum += input[index];
		}
		if (evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;

	}
}
