package pujaSah.assignments20_30;

public class OperationsOnArray {
	int getSumOfElementsInarray(int[] arr) {
		int size = arr.length;
		int sum = 0;
		for (int i = 0; i <= size - 1; i++) {
			sum += arr[i];
		}
		return sum;
	}

	int getSumOfAllPrimeNosInArray(int[] arr) {
		int size = arr.length;
		int sum = 0;
		for (int i = 0; i <= size - 1; i++) {
			if (isPrime(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	int getMaxNoFromArray(int[] arr) {
		int size = arr.length;
		int i = 0;
		int maxNum = arr[i];
		for (int j = i + 1; j <= size - 1; j++) {
			if (arr[j] > maxNum) {
				maxNum = arr[j];
			}
		}
		return maxNum;
	}

	int getMinNoFromArray(int[] arr) {
		int size = arr.length;
		int i = 0;
		int minNum = arr[i];
		for (int j = i + 1; j <= size - 1; j++) {
			if (arr[j] < minNum) {
				minNum = arr[j];
			}
		}
		return minNum;
	}

	void getMiddleCharInArray(String[] arr) {
		int size = arr.length;
		for (int i = 0; i <= size - 1; i++) {
			System.out.println(" The middle character in " + arr[i] + " is " + getMiddleCharinAString(arr[i]));
		}
	}

	char getMiddleCharinAString(String str) {
		int length = str.length();
		int middleIndex = 0;
		if (length % 2 == 0) {
			middleIndex = length / 2 - 1;
		} else {
			middleIndex = length / 2;
		}
		return str.charAt(middleIndex);
	}

	boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		OperationsOnArray obj = new OperationsOnArray();

		int[] sumArr = { 10, 11, 12 };
		System.out.println(" Sum of elements within array {10, 11, 12} is " + obj.getSumOfElementsInarray(sumArr));

		int[] primeArr = { 11, 14, 17, 22, 44 };
		System.out.println(" Sum of all prime numbers within array {11, 14, 17, 22, 44} is "
				+ obj.getSumOfAllPrimeNosInArray(primeArr));

		int[] maxArr = { 11, 4, 55, 23, 43 };
		System.out.println(
				" Maximum of all elements within array {11, 4, 55, 23, 43} is " + obj.getMaxNoFromArray(maxArr));

		int[] minArr = { 11, 4, 55, 23, 43 };
		System.out.println(
				" Minimum of all elements within array {11, 4, 55, 23, 43} is " + obj.getMinNoFromArray(minArr));

		String[] middleChArr = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		obj.getMiddleCharInArray(middleChArr);
	}
}
