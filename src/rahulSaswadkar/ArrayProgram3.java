/*
 * Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.
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

package rahulSaswadkar;

import java.util.Arrays;

public class ArrayProgram3 {
	public static void main(String[] args) {
		ArrayProgram3 arrayProgram3 = new ArrayProgram3();

		int[] num1 = { 11, 13, 17, 22, 44 };
		int[] num2 = { 11, 35, 17, 105, 44 };
		int[] num3 = { 10, 11, 15, 6 };
		int[] num4 = { 10, 11, 15, 6 };
		String str1 = "maulik";
		String[] str2 = {"Ashish", "Aditty", "Manjiri", "Ankita"};
		String[] str3 = {"Ashish","Aditty","Manjiri","Ankita","Credits"};

		System.out.println("Sum of all Non Prime Numbers in given array " + Arrays.toString(num1) + " is : "
				+ arrayProgram3.m1(num1));
		System.out.println("\nSum of all Non Prime Numbers and Numbers divisible by 5 & 7  in given array "
				+ Arrays.toString(num2) + " is : " + arrayProgram3.m2(num2));
		System.out.println("\nSum of all Even Numbers in given array " + Arrays.toString(num3) + " is : "
				+ arrayProgram3.m3(num3));
		System.out.println("\nDifference of sum of all Even Numbers and sum of all Odd Numbers in given array "
				+ Arrays.toString(num4) + " is : " + arrayProgram3.m4(num4));
		System.out.println("\nCount of Vowels in give String \'" + str1 + "\' is : " + arrayProgram3.m5(str1));

		System.out.println("\nGiven Array : " + Arrays.toString(str2));
		System.out.println("Count of Vowels in each element of given array is as below :");
		arrayProgram3.displayData(str2);
		
		System.out.println("\nName having maximum length in given String \'" + Arrays.toString(str3) + "\' is : " + arrayProgram3.m6(str3));

	}

	int m1(int[] num1) {
		PrimeWithWhileAndReturn primeWithWhileAndReturn = new PrimeWithWhileAndReturn();
		int sum = 0;
		for (int index = 0; index < num1.length; index++) {
			if (!primeWithWhileAndReturn.isPrimeNumber(num1[index])) {
				sum = sum + num1[index];
			}
		}
		return sum;
	}

	int m2(int[] num2) {
		PrimeWithWhileAndReturn primeWithWhileAndReturn = new PrimeWithWhileAndReturn();
		int sum = 0;
		for (int index = 0; index < num2.length; index++) {
			if ((!primeWithWhileAndReturn.isPrimeNumber(num2[index])) && (num2[index] % 5 == 0)
					&& (num2[index] % 7 == 0)) {
				sum = sum + num2[index];
			}
		}
		return sum;
	}

	int m3(int[] num3) {
		int sum = 0;
		for (int index = 0; index < num3.length; index++) {
			if (num3[index] % 2 == 0) {
				sum = sum + num3[index];
			}
		}
		return sum;
	}

	int m4(int[] num4) {
		int sumOfEvenNumbers = 0;
		int sumOfOddNumbers = 0;
		int diff = 0;
		for (int index = 0; index < num4.length; index++) {
			if (num4[index] % 2 == 0) {
				sumOfEvenNumbers = sumOfEvenNumbers + num4[index];
			} else {
				sumOfOddNumbers = sumOfOddNumbers + num4[index];
			}
			if (sumOfEvenNumbers > sumOfOddNumbers) {
				diff = sumOfEvenNumbers - sumOfOddNumbers;
			} else
				diff = sumOfOddNumbers - sumOfEvenNumbers;
		}
		return diff;
	}

	int m5(String str1) {
		int countOfVowels = 0;
		for (int index = 0; index < str1.length(); index++) {
			if (str1.charAt(index) == 'a' || str1.charAt(index) == 'e' || str1.charAt(index) == 'i'
					|| str1.charAt(index) == 'o' || str1.charAt(index) == 'u' || str1.charAt(index) == 'A'
					|| str1.charAt(index) == 'E' || str1.charAt(index) == 'I' || str1.charAt(index) == 'O'
					|| str1.charAt(index) == 'U') {
				countOfVowels += 1;
			}
		}

		return countOfVowels;
	}

	void displayData(String[] str2) {
		for (int index = 0; index < str2.length; index++) {
			System.out.println(str2[index] + "-->" + m5(str2[index]));
		}
	}
	
	String m6(String[] str3) {
		int maxLength = str3[0].length();
		String maxLengthStringArrElement = str3[0];
		for(int index=1;index<str3.length;index++) {
			if(str3[index].length() > maxLength) {
				maxLengthStringArrElement = str3[index];
			}
		}
		return maxLengthStringArrElement;
		
		
		
	}

}
