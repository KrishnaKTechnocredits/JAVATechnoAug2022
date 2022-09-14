/* Assignment - 19 : 9th Sep'2022

1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36

2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)

3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55

4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4

5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k */

package swatiM.assignment.arrayPrograms;

public class ArrayLengthAndMiddleChar {

	int getSumOfAllNumbersOfArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		return flag;
	}

	int getSumOfPrimeNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = isPrime(num[index]);
			if (flag) {
				System.out.println(num[index]);
				sum = sum + num[index];
			}
		}
		return sum;
	}

	int getMaxNumFromArray(int[] num) {
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
			}
		}
		return max;
	}

	int getMinNumFromArray(int[] num) {
		int min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min) {
				min = num[index];
			}
		}
		return min;
	}

	char getMiddleChar(String name) {
		int index = 0;
		int length = name.length();
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = name.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		ArrayLengthAndMiddleChar array = new ArrayLengthAndMiddleChar();
		int[] arr = { 10, 11, 15 };
		System.out.println("sum of all numbers in given array is: " + array.getSumOfAllNumbersOfArray(arr));
		int[] primeArr = { 11, 14, 17, 22, 44 };
		System.out.println("Sum of all prime numbers within array is :" + array.getSumOfPrimeNumbers(primeArr));
		int maxnum[] = { 11, 4, 55, 23, 43 };
		System.out.println("Maximum Number from Given array is: " + array.getMaxNumFromArray(maxnum));
		int minnum[] = { 11, 4, 55, 23, 43 };
		System.out.println("Minimum Number from Given array is: " + array.getMinNumFromArray(minnum));
		String[] arrMiddle = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("Middle name of " + arrMiddle[0] + " is: " + array.getMiddleChar(arrMiddle[0]));
		System.out.println("Middle name of " + arrMiddle[1] + " is: " + array.getMiddleChar(arrMiddle[1]));
		System.out.println("Middle name of " + arrMiddle[2] + " is: " + array.getMiddleChar(arrMiddle[2]));
		System.out.println("Middle name of " + arrMiddle[3] + " is: " + array.getMiddleChar(arrMiddle[3]));

	}
}
