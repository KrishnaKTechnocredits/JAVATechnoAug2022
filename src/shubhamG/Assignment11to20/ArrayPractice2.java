package shubhamG.Assignment11to20;

import java.util.Arrays;

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
Hint : 16 - 26 = 10

5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
*/
public class ArrayPractice2 {

	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			} else
				isPrime = true;
		}
		return isPrime;
	}

	int getSumOfPrimeNumber(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i]) == false) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	int getSumofNonPrimeNumberAndDivisiblityBy5and7(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i]) == false && arr[i] % 5 == 0 && arr[i] % 7 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	int getSumOfEvenNumberFromArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	int getSumOfOddNumberFromArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	int getDifferenceOfEvenAndOdd(int[] arr) {
		int difference = 0;
		int sumOdd = getSumOfOddNumberFromArray(arr);
		int sumEven = getSumOfEvenNumberFromArray(arr);
		if (sumOdd > sumEven) {
			difference = sumOdd - sumEven;
		} else {
			difference = sumEven - sumOdd;
		}
		return difference;
	}

	int getCountOfVowelInString(String str) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	void getCountOfVowelInEachStringOfArray(String[] arr) {
		System.out.println("Count of vowels for the given strings in array are - ");
		for (int i = 0; i < arr.length; i++) {
			int count = getCountOfVowelInString(arr[i]);
			System.out.println(arr[i] + " -> " + count);
		}
	}

	String getStringWithMaxLength(String[] arr) {
		String str = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() >= str.length()) {
				str = arr[i];
			}
		}
		return str;
	}

	public static void main(String[] args) {
		ArrayPractice2 arrayPractice2 = new ArrayPractice2();

		int[] arr1 = { 11, 13, 17, 22, 44 };
		System.out.println("Given input Array is: "+Arrays.toString(arr1));
		System.out.println("Sum of Non Prime Numbers are : " + arrayPractice2.getSumOfPrimeNumber(arr1));

		int[] arr2 = { 11, 35, 17, 105, 44 };
		System.out.println("\nGiven input Array is: "+Arrays.toString(arr2));
		System.out.println("Sum of Non Prime Numbers which are divisible by 5 and 7 are : "
				+ arrayPractice2.getSumofNonPrimeNumberAndDivisiblityBy5and7(arr2));

		int[] arr3 = { 10, 11, 15, 6 };
		System.out.println("\nGiven input Array is: "+Arrays.toString(arr3));
		System.out.println(
				"Sum of all even number in the givem string is : " + arrayPractice2.getSumOfEvenNumberFromArray(arr3));
		
		int[] arr4 = { 10, 11, 15, 6 };
		System.out.println("\nGiven input Array is: "+Arrays.toString(arr4));
		System.out.println("Difference between even and odd numbers of given array is : "
				+ arrayPractice2.getDifferenceOfEvenAndOdd(arr4));

		String str = "Maulik";
		System.out
				.println("\nCount of vowel in the string " + str + " is: " + arrayPractice2.getCountOfVowelInString(str));

		String[] str1 = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("\nGiven input Array is: "+Arrays.toString(str1));
		arrayPractice2.getCountOfVowelInEachStringOfArray(str1);

		String[] str2 = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println("\nGiven input Array is: "+Arrays.toString(str2));
		System.out.println(
				"String with Max length from given array is : " + arrayPractice2.getStringWithMaxLength(str2));
	}
}
