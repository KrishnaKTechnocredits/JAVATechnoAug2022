package sagarY.Arrays;

public class Assignment20Arrays {

	int sumOfArrays(int[] num1) {
		int sum = 0;
		for (int index = 0; index < num1.length; index++) {
			sum = sum + (num1[index]);
		}
		return sum;
	}

	boolean isNonPrime(int num2) {
		boolean flag = true;
		for (int index = 2; index <= num2 / 2; index++) {
			if (num2 % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int getSumOfPrime(int[] num2) {
		int sum = 0;
		for (int index = 0; index < num2.length; index++) {
			boolean flag = isNonPrime(num2[index]);
			if (flag == false) {
				sum = sum + num2[index];
			}
		}
		return sum;
	}

	int getSumOfPrimeAndDivisibleBy5And7(int[] num2) {
		int sum = 0;
		for (int index = 0; index < num2.length; index++) {
			boolean flag = isNonPrime(num2[index]);
			if (flag == false && (num2[index] % 5 == 0 || num2[index] % 7 == 0)) {
				sum = sum + num2[index];
			}
		}
		return sum;
	}

	int sumOfEvenNumbers(int[] num4) {
		int sum = 0;
		for (int index = 0; index < num4.length; index++) {
			if (num4[index] % 2 == 0) {
				sum = sum + num4[index];
			}
		}
		return sum;
	}

	int diffBetSumOfEvenAndOdd(int[] num5) {
		int sumOfOdd = 0;
		int sumOfEven = 0;
		for (int index = 0; index < num5.length; index++) {
			if (num5[index] % 2 == 0)
				sumOfEven = sumOfEven + num5[index];
			else
				sumOfOdd = sumOfOdd + num5[index];
		}
		return sumOfOdd - sumOfEven;
	}

	int countOfVowels(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] num1 = { 11, 13, 17, 22, 44 };
		int output1 = new Assignment20Arrays().sumOfArrays(num1);
		System.out.println("Sum of the numbers in given array {11,13,17,22,44} is: \n" + output1);

		int output2 = new Assignment20Arrays().getSumOfPrime(num1);
		System.out.println("Sum of the NonPrime numbers in given array {11,13,17,22,44} is: \n" + output2);

		int[] num3 = { 11, 35, 17, 105, 44 };
		int output3 = new Assignment20Arrays().getSumOfPrimeAndDivisibleBy5And7(num3);
		System.out.println("Sum of Non Prime numbers from {11,35,17,105,44} which are also divisible by 5 and 7 are is: \n"+ output3);

		int[] num4 = { 10, 11, 15, 6 };
		int output4 = new Assignment20Arrays().sumOfEvenNumbers(num4);
		System.out.println("Sum of Even numbers from {10,11,15,6} is: \n" + output4);

		int[] num5 = { 10, 11, 15, 6 };
		int output5 = new Assignment20Arrays().diffBetSumOfEvenAndOdd(num5);
		System.out.println("Difference between Sum of Even numbers and Odd numbers from {10,11,15,6} is: \n" + output5);

		int output6 = new Assignment20Arrays().countOfVowels("Maulik");
		System.out.println("Count of Vowels in \"Maulik is\n" + output6);

	}

}
