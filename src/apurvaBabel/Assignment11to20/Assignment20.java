/*Assignment - 20 :

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

package apurvaBabel.Assignment11to20;

public class Assignment20 {

	// Method to return sum of all non prime numbers from given array
	int getSumOFNonPrimeNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0) {
				for (int i = 2; i <= num[index] / 2; i++) {
					if (num[index] % i == 0) {
						sum = sum + num[index];
						break;
					}
				}
			}
		}
		return sum;
	}

	// Method to return sum of all non prime numbers which are also divisible by 5&7 from given array
	int getSumOFNonPrimeNumbersDivisibleBy5And7(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0) {
				for (int i = 2; i < num[index] / 2; i++) {
					if (num[index] % i == 0) {
						if (num[index] % 5 == 0 && num[index] % 7 == 0) {
							sum = sum + num[index];
							break;
						}
					}
				}
			}
		}
		return sum;
	}

	// Method to return sum of all even numbers in given array
	int getSumOfEvenNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	// Method to return difference of sum of all even and odd numbers in given array
	int getDifferenceOfSumOfEvenOddNumbers(int[] num) {
		int evenSum = 0;
		int oddSum = 0;
		int difference;

		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenSum = evenSum + num[index];
			} else {
				oddSum = oddSum + num[index];
			}
		}
		if (evenSum > oddSum) {
			difference = evenSum - oddSum;
		} else {
			difference = oddSum - evenSum;
		}
		return difference;
	}

	// Method to return count of vowels in a given string
	int getCountOfVowels(String name) {
		name = name.toLowerCase();
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	// Method to return name having max length
	String getMaxLengthName(String[] name) {
		int maxLength = 0;
		String tempName = " ";
		for (int index = 0; index < name.length; index++) {
			if (maxLength <= name[index].length()) {
				maxLength = name[index].length();
				tempName = name[index];
			}
		}
		return tempName;
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		int[] num1 = { 11, 13, 17, 22, 44 };
		System.out.println(
				"Sum of all non prime numbers from given array is " + assignment20.getSumOFNonPrimeNumbers(num1));

		int[] num2 = { 11, 35, 17, 105, 44 };
		System.out.println("\nSum of all non prime numbers which are also divisible by 5 and 7 from given array is "
				+ assignment20.getSumOFNonPrimeNumbersDivisibleBy5And7(num2));

		int[] num3 = { 10, 11, 15, 6 };
		System.out.println("\nSum of all even numbers from given array is " + assignment20.getSumOfEvenNumbers(num3));
		System.out.println("\nDifference of sum of even and odd numbers from given array is "
				+ assignment20.getDifferenceOfSumOfEvenOddNumbers(num3));

		String name = "Maulik";
		System.out.println("\nNumber of vowels in given string are " + assignment20.getCountOfVowels(name));

		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("\nNumber of vowels in each element of given string are: ");
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index] + "-->" + assignment20.getCountOfVowels(input[index]));
		}

		String[] input1 = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println("\nName with maximum length from given array is " + assignment20.getMaxLengthName(input1));
	}
}