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
—-----------------------------------------------
*/
package nilamP;

import java.util.Arrays;

public class ArrayOperations6 {
	int sum = 0;
	int oddSum = 0;
	int difference = 0;

	static boolean isPrime(int num) {
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

	int isNotPrimeFromArray(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = isPrime(num[index]);
			if (flag == false) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	int getSumOfAllNonPrimeArray(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = isPrime(num[index]);
			if (flag == false)
				if ((num[index] % 5 == 0) && (num[index] % 7 == 0))
					sum = sum + num[index];
		}
		return sum;
	}

	int evenNumbersSum(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	int OddNumbersSum(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 1) {
				oddSum = oddSum + num[index];
			}
		}
		return oddSum;
	}

	int diffSumEvenOdd(int[] num) {
		OddNumbersSum(num);
		difference = oddSum - sum;
		return difference;
	}

	int getCountOfVovels(String name) {
		int count = 0;
		name = name.toLowerCase();

		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				count++;
			}
		}
		return count;
	}

	int[] getCountOfVovelsArray(String[] name) {
		int[] output = new int[name.length];
		for (int index = 0; index < name.length; index++) {
			output[index] = getCountOfVovels(name[index]);
		}
		return output;
	}

	void display(String[] name, int[] output) {
		for (int index = 0; index < name.length; index++) {

			System.out.println(name[index] + " : " + output[index]);
		}
	}

	String getMaxLength(String[] name) {
		int maxLength = name[0].length();
		String maxString = name[0];

		for (int index = 1; index < name.length; index++) {
			if (name[index].length() > maxLength) {
				maxString = name[index];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		ArrayOperations6 ao = new ArrayOperations6();
		System.out.println(" *** Program 1 output ***");
		int[] input = { 11, 13, 17, 22, 44 };
		System.out.println("input: " + Arrays.toString(input));
		System.out.println("Sum of all non prime numbers from given array : " + ao.isNotPrimeFromArray(input));
		System.out.println(" *** Program 2 output ***");
		int[] input1 = { 11, 35, 17, 105, 44 };
		System.out.println("input: " + Arrays.toString(input1));
		System.out.println("Sum of all non prime numbers from given array which are divisible by 5 & 7  : "
				+ ao.getSumOfAllNonPrimeArray(input1));
		System.out.println(" *** Program 3 output ***");
		int[] input2 = { 10, 11, 15, 6 };
		System.out.println("input: " + Arrays.toString(input2));
		System.out.println("Sum of all even numbers in given array " + ao.evenNumbersSum(input2));
		System.out.println(" *** Program 4 output ***");
		System.out.println("input: " + Arrays.toString(input2));
		System.out.println(
				"difference of sum of all even numbers and odd numbers in given array " + ao.diffSumEvenOdd(input2));
		System.out.println(" *** Program 5 output ***");
		System.out.println("Count of vowels in a given String are " + ao.getCountOfVovels("Maulik"));
		System.out.println(" *** Program 6 output ***");
		String[] input3 = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("input : " + Arrays.toString(input3));
		int[] output = ao.getCountOfVovelsArray(input3);
		ao.display(input3, output);
		System.out.println(" *** Program 7 output ***");
		String[] input4 = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println("input : " + Arrays.toString(input4));
		System.out.println("name having maximum length : " + ao.getMaxLength(input4));
	}
}
