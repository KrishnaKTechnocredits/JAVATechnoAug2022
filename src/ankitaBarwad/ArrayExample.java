/*Assignment - 19 : 9th Sep'2022

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
		 Ankita -> k*/
package ankitaBarwad;

public class ArrayExample {

	// method to return sum of all numbers in given array
	int getArraySum(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		return sum;
	}

	// method to check is Prime number or not
	boolean isPrimeNumber(int number) {
		boolean flag = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				flag = false;
			}
		}
		return flag;
	}

	// method to return sum of all prime numbers from given array
	int getPrimeNumberSum(int[] array2) {
		boolean isPrime;
		int primeSum = 0;
		for (int index = 0; index < array2.length; index++) {
			isPrime = isPrimeNumber(array2[index]);
			if (isPrime)
				primeSum = primeSum + array2[index];
		}
		return primeSum;
	}

	// method to return max number from array
	int getArrayMaxNumber(int[] array3) {
		int maxNumber = 0;
		for (int index = 0; index < array3.length; index++) {
			if (maxNumber < array3[index]) {
				maxNumber = array3[index];
			}
		}
		return maxNumber;
	}

	// method to return min number from array
	int getArrayMinNumber(int[] array4) {
		int minNumber = array4[0];
		for (int index = 0; index < array4.length; index++) {
			if (array4[index] < minNumber) {
				minNumber = array4[index];
			}
		}
		return minNumber;
	}

	//method to find middle character
	char getMiddleChar(String name) {
		int index = 0;
		int length = name.length();
		if (name.length() % 2 == 0) {
			index = length / 2 - 1;
		} else
			index = length / 2;
		return name.charAt(index);
	}
	
	// method to print middle character of all array elements
	void printMiddleCharacter(String[] names) {
		for(int index = 0; index < names.length;index++) {
			System.out.println("Middle Character of " + names[index] + " is : " + getMiddleChar(names[index]));
		}
	}
	
	// main() method
	public static void main(String[] args) {
		ArrayExample arrayExample = new ArrayExample();
		int[] array1 = { 10, 11, 15 };
		System.out.println("Sum of array is : " + arrayExample.getArraySum(array1));

		int[] array2 = { 11, 14, 17, 22, 44 };
		System.out.println("Sum of all prime numbers from given array is : " + arrayExample.getPrimeNumberSum(array2));

		int[] array3 = { 11, 14, 55, 23, 43 };
		System.out.println("Maximum number from given array is : " + arrayExample.getArrayMaxNumber(array3));

		int[] array4 = { 11, 4, 55, 23, 43 };
		System.out.println("Minimum number from given array is : " + arrayExample.getArrayMinNumber(array4)+ "\n");
		
		String[] names = {"Ashish","Aditty","Manjiri","Ankita"};
		arrayExample.printMiddleCharacter(names);
	}
}
