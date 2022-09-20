/*Assignment - 20 : 10th Sep'2022

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


package sanket;

public class ArrayOperationsEx2 {

	//method to return sum of all not prime numbers from given array
	int getSumOfNoPrimeNumbArray(int[] arr) {
		int sumArrayElement = 0;

		for (int index = 0; index<arr.length; index++) {
			if (arr[index] % 2 == 0)
				sumArrayElement = sumArrayElement + arr[index];
		}
		return sumArrayElement;
	}

	//method to return sum of all non prime numbers and should be divisible by 5 & 7 from given array
	int getSumOfNoPrimeNumbDiv57(int[] arr) {
		int sumArrayElement = 0;

		for (int index = 0; index<arr.length; index++) {
			if (arr[index] % 2 != 0) {
				if (arr[index] % 5 == 0 || arr[index] % 7 == 0) {
					sumArrayElement = sumArrayElement + arr[index];
				}
			}
		}
		return sumArrayElement;
	}

	//method to return sum of all even numbers in given array
	int getSumOfEvenNumbArray(int[] arr) {
		int sumArrayElement = 0;

		for (int index = 0; index<arr.length; index++) {
			if (arr[index] % 2 == 0)
				sumArrayElement = sumArrayElement + arr[index];
		}
		return sumArrayElement;
	}

	// method to return difference of sum of all even numbers and odd numbers in given array
	int getDiffOfEvenNumbPrimeArray(int[] arr) {
		int sumArrayEvenElement = 0;
		int sumArrayPrimeElement = 0;
		int diffEvenPrime = 0;

		for (int index = 0; index<arr.length; index++) {
			if (arr[index] % 2 == 0)
				sumArrayEvenElement = sumArrayEvenElement + arr[index];
		}

		for (int index = 0; index<arr.length; index++) {
			boolean statusFlag = true;
			if (arr[index] % 2 == 0) {
				statusFlag = false;
			} else if (statusFlag) {
				sumArrayPrimeElement = sumArrayPrimeElement + arr[index];
			}
		}
		diffEvenPrime = sumArrayPrimeElement - sumArrayEvenElement;

		if (diffEvenPrime > 0)
			diffEvenPrime = sumArrayPrimeElement - sumArrayEvenElement;
		else
			diffEvenPrime = sumArrayEvenElement - sumArrayPrimeElement;
		return diffEvenPrime;
	}

	//Return count of vowels in a given String
	int getVowelCountString(String name) {
		int count = 0;
		name = name.toLowerCase();

		for (int index = 0; index<name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == 'a') {
				count++;
			} else if (ch == 'e') {
				count++;
			} else if (ch == 'i') {
				count++;
			} else if (ch == 'o') {
				count++;
			} else if (ch == 'u') {
				count++;
			}
		}
		return count;
	}

	//method to return name having maximum length
	String getMaxLengthString(String[] name) {

		int maxLength = name[0].length();
		String maxLengthName = "";

		for (int index = 1; index<name.length; index++) {

			if (maxLength<name[index].length())
				maxLength = name[index].length();
			maxLengthName = name[index];
		}
		return maxLengthName;
	}

	public static void main(String[] args) {
		ArrayOperationsEx2 arrayOperationsEx2 = new ArrayOperationsEx2();

		int[] arr = { 11, 13, 17, 22, 44 };
		int sumOfNoPrimeNumber = arrayOperationsEx2.getSumOfNoPrimeNumbArray(arr);
		System.out.println(
				"Sum of no prime number in given array arr = { 11, 13, 17, 22, 44 } is " +
						sumOfNoPrimeNumber + "\n");

		int[] arr2 = { 11, 35, 17, 105, 44 };
		int sumOfNoPrimeNumberDiv57 = arrayOperationsEx2.getSumOfNoPrimeNumbDiv57(arr2);
		System.out.println(
				"Sum of no prime number and divisible by 5 and 7 in given array arr2 = { 11, 35, 17, 105, 44 } is " +
						sumOfNoPrimeNumberDiv57 + "\n");

		int[] arr3 = { 10, 11, 15, 6 };
		int sumOfEvenNumber = arrayOperationsEx2.getSumOfEvenNumbArray(arr3);
		System.out.println("Sum of even numbers in given array arr3 = { 10, 11, 15, 6 } is " +
				sumOfEvenNumber + "\n");

		int diffEvenPrime = arrayOperationsEx2.getDiffOfEvenNumbPrimeArray(arr3);
		System.out.println(
				"Difference between even numbers and prime number in given array arr3 = { 10, 11, 15, 6 } is " +
						diffEvenPrime + "\n");

		String name = "Maulik";
		int vowelCount = arrayOperationsEx2.getVowelCountString(name);
		System.out.println("The total vowels in Maulik is " + vowelCount + "\n");

		String[] arr4 = {
				"Ashish", "Aditty", "Manjiri", "Ankita"
		};
		System.out.println("Vowel count of each name in given array are:");

		for (int index = 0; index<arr4.length; index++) {
			System.out.println(
					arr4[index] + "--->" + arrayOperationsEx2.getVowelCountString(arr4[index]));
		}

		String[] arr5 = {
				"Ashish", "Aditty", "Manjiri", "Ankita", "Credits"
		};

		System.out.println("\n"+"Name having maximum length in array \"Ashish\",\"Aditty\",\"Manjiri\",\"Ankita\",\"Credits\" is : " + arrayOperationsEx2.getMaxLengthString(arr5));
	}
}