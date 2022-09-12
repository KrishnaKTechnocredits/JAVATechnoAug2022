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
		 Ankita -> k
*/

package sanket;

public class ArrayOperationsEx1 {
	
	// method to return sum of all numbers in given array
	int getSumOfElemntsArray(int[] arr) {
		int sumArrayElement = 0;

		for (int index = 0; index < arr.length; index++) {
			sumArrayElement = sumArrayElement + arr[index];
		}
		return sumArrayElement;
	}

	// method to check number is prime
	boolean isPrime(int number) {
		
		boolean statusFlag = true;
		for (int index = 2; index < number / 2; index++) {
			if (number % index == 0) {
				statusFlag = false;
				break;
			}
		}
		if (statusFlag)
			statusFlag = true;
		return statusFlag;
	}

	// method to return sum of all prime numbers from given array using above isPrime method
	int getSumOfPrimeNumber(int[] arr) {
		
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isPrime(arr[index]);

			if (flag)
				sum = sum + arr[index];
		}
		return sum;
	}

	// method to return max number from array
	int getMaxValueFromArray(int[] arr) {
		
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}
		return max;
	}

	// method to return minimum number from array
	int getMinValueFromArray(int[] arr) {
		
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}
		return min;
	}

	// method to get the middle character from String
	char getMiddleChar(String name) {
		
		int length = name.length();
		int index = 0;

		if (length % 2 == 0)
			index = name.length() / 2 - 1;
		else
			index = name.length() / 2;

		char ch = name.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		
		ArrayOperationsEx1 arrayOperationsEx1 = new ArrayOperationsEx1();

		int[] arr1 = { 10, 11, 15 };
		int summation = arrayOperationsEx1.getSumOfElemntsArray(arr1);
		System.out.println("Summation of elements of array arr1 = {10,11,15} is : " + summation);

		int[] arr2 = { 11, 14, 17, 22, 44 };
		int summationPrime = arrayOperationsEx1.getSumOfPrimeNumber(arr2);
		System.out.println("Summation of prime elements of array arr2 = { 11,14,17,22,44 } is : " + summationPrime);

		int[] arr3 = { 11, 4, 55, 23, 43 };
		int maxValue = arrayOperationsEx1.getMaxValueFromArray(arr3);
		System.out.println("Maximum value from arr3 ={ 11,4,55,23,43 } is : " + maxValue);

		int minValue = arrayOperationsEx1.getMinValueFromArray(arr3);
		System.out.println("Minimum value from arr3 ={ 11,4,55,23,43 } is : " + minValue);

		String[] arr4 = { "Ashish", "Aditty", "Manjiri", "Ankita" };

		for (int index = 0; index < arr4.length; index++) {
			char getMiddleChar = arrayOperationsEx1.getMiddleChar(arr4[index]);
			System.out.println("Middle Charactr for " + arr4[index] + " ----> " + getMiddleChar + ".");
		}
	}
}
