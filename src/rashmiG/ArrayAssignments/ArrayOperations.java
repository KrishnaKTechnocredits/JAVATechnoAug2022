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

package rashmiG.ArrayAssignments;

class ArrayOperations {

	int getSumOfNosArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	boolean isPrime(int num) {
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	int getSumofPrimeNosArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index <= arr.length - 1; index++) {
			boolean isPrimeFlag = isPrime(arr[index]);
			if (isPrimeFlag) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	int getMaxNumberFromArray(int[] arr) {
		int maxNumber = 0;
		for (int index = 0; index <= arr.length - 1; index++) {
			if (arr[index] > maxNumber) {
				maxNumber = arr[index];
			}
		}
		return maxNumber;
	}

	int getMinNumberFromArray(int[] arr) {
		int minNumber = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (arr[index] < minNumber) {
				minNumber = arr[index];
			}
		}
		return minNumber;
	}

	char getMiddleChar(String name) {
		int length = name.length();
		if (length % 2 == 0) {
			return name.charAt(length / 2 - 1);
		} else {
			return name.charAt(length / 2);
		}
	}

	void printMiddleCharOfArrayElements(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			char ch = getMiddleChar(arr[index]);
			System.out.println(arr[index] + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		ArrayOperations arrayOperations = new ArrayOperations();
		int[] arr = { 10, 11, 15 };
		System.out.println("Sum of all numbers in an array : " + arrayOperations.getSumOfNosArray(arr));
		int[] primeNOsSumArr = { 11, 14, 17, 22, 44 };
		System.out.println(
				"Sum of all prime numbers from array : " + arrayOperations.getSumofPrimeNosArray(primeNOsSumArr));
		int[] maxArray = { 11, 4, 55, 23, 43 };
		System.out.println("Maximum number from array : " + arrayOperations.getMaxNumberFromArray(maxArray));
		int[] minArray = { 11, 4, 55, 23, 43 };
		System.out.println("Minimum number from array : " + arrayOperations.getMinNumberFromArray(minArray));
		String[] middleCharArray = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		arrayOperations.printMiddleCharOfArrayElements(middleCharArray);
	}
}
