package saroj.arrayPrograms;

public class ArrayActivity {

	char ch;

	int sumOfArray(int[] numbers) {
		int sum = 0;
		for (int index = 0; index <= numbers.length - 1; index++) {
			sum = sum + numbers[index];
		}
		return sum;
	}

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	int getSumOfPrimeNo(int[] arr) {
		int sum = 0;
		// boolean flag;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = isPrime(arr[index]);

			if (flag) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	int maxNumber(int[] numbers) {
		int max = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > max) {
				max = numbers[index];
			}
		}
		return max;
	}

	int minNumber(int[] numbers) {
		int min = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] < min) {
				min = numbers[index];
			}
		}
		return min;
	}

	char middleCharacter(String[] name) {
		int length = name.length;
		for (int index = 0; index < length; index++) {
			int namLength = name[index].length();
			int index1;
			if (namLength % 2 == 0) {
				index1 = namLength / 2 - 1;
			} else {
				index1 = namLength / 2;
			}
			ch = name[index].charAt(index1);
			System.out.println("Middle character of " + name[index] + " is :" + ch);
		}
		return ch;
	}

	public static void main(String[] args) {
		ArrayActivity arrayActivity = new ArrayActivity();
		int[] numbers = { 1, 2, 3 };
		System.out.println("Sum of given numbers is: " + arrayActivity.sumOfArray(numbers));
		int[] numbers1 = { 5, 2, 4, 6, 7, 9, 11, 22 };
		System.out.println("Sum of prime numbers is: " + arrayActivity.getSumOfPrimeNo(numbers1));
		int[] numbers2 = { 5, 2, 4, 6, 72, 9, 11, 22 };
		System.out.println("Maximum number is: " + arrayActivity.maxNumber(numbers2));
		int[] numbers3 = { 5, 0, 4, 6, 7, 9, 11, 22 };
		System.out.println("Minimum number is: " + arrayActivity.minNumber(numbers3));
		String[] name = { "saroj", "Sanu", "Abhay" };
		arrayActivity.middleCharacter(name);

	}
}
