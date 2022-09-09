package sagarY.Arrays;

public class ArrayBasics {

	int sumOfArrays(int[] num1) {
		int sum = 0;
		for (int index = 0; index < num1.length; index++) {
			sum = sum + (num1[index]);
		}
		return sum;
	}

	boolean isPrime(int num2) {
		boolean flag = true;
		for (int index = 2; index <= num2 / 2; index++) {
			if (num2 % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
		}
		return flag;
	}

	int getSumOfPrime(int[] num2) {
		int sum = 0;
		for (int index = 0; index < num2.length; index++) {
			boolean flag = isPrime(num2[index]);
			if (flag) {
				sum = sum + num2[index];
			}
		}
		return sum;
	}

	int maxNumber(int[] num3) {
		int max = 0;
		for (int index = 0; index < num3.length; index++) {
			if (max < num3[index]) {
				max = num3[index];
			}
		}
		return max;
	}

	int minNumber(int[] num4) {
		int min = num4[0];
		for (int index = 0; index < num4.length; index++) {
			if (min > num4[index]) {
				min = num4[index];
			}
		}
		return min;
	}

	char getMiddleChar(String str) {
		if (str.length() % 2 != 0) {
			return (str.charAt(str.length() / 2));
		} else {
			return (str.charAt(str.length() / 2 - 1));
		}
	}

	void printMiddleChar(String[] str) {
		System.out.println("Middle Character of below names is: ");
		for (int index = 0; index < str.length; index++) {

			char ch = getMiddleChar(str[index]);
			System.out.println(str[index] + ": " + ch);
		}
	}

	public static void main(String[] args) {
		int[] num1 = { 11, 34, 17, 25, 31 };
		int output1 = new ArrayBasics().sumOfArrays(num1);
		System.out.println("Sum of the numbers in given array {20,40,60} is: \n" + output1);

		int output2 = new ArrayBasics().getSumOfPrime(num1);
		System.out.println("Sum of the prime numbers in given array {11,34,17,25} is: \n" + output2);

		int[] num3 = { 11, 4, 55, 23, 43 };
		int output3 = new ArrayBasics().maxNumber(num3);
		System.out.println("Maximum num from array {11,4,55,23,43} is: \n" + output3);

		int output4 = new ArrayBasics().minNumber(num3);
		System.out.println("Minimum num from array {11,4,55,23,43} is: \n" + output4);

		String[] str = { "Ashish", "DeepakP", "Maulik", "Krishna" };
		new ArrayBasics().printMiddleChar(str);
	}

}
