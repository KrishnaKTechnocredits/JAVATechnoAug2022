package shivaniGour;

public class ArrayAssignment19 {
	int getSumOfArray(int[] arr) {
		int add = 0;
		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];
		}
		return add;
	}

	int sumOfPrimeArray(int[] arr) {
		int sumPrime = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				sumPrime = sumPrime + arr[i];
			}
		}
		return sumPrime;
	}

	boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	int getMaxArray(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	int getMinArray(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	void getMidCharArray(String[] arr) {
		int strIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			int strLength = arr[i].length();
			if (strLength % 2 == 0) {
				strIndex = strLength / 2 - 1;
				System.out.println(arr[i] + ": " + arr[i].charAt(strIndex));

			} else {
				strIndex = strLength / 2;
				System.out.println(arr[i] + ": " + arr[i].charAt(strIndex));
			}

		}

	}

	public static void main(String[] args) {
		ArrayAssignment19 varArr = new ArrayAssignment19();
		int[] arr = { 10, 11, 15, 17 };
		String[] arr1 = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("Sum of elements is: " + varArr.getSumOfArray(arr));
		System.out.println("Sum of Prime elements is: " + varArr.sumOfPrimeArray(arr));
		System.out.println("Max Array element is: " + varArr.getMaxArray(arr));
		System.out.println("Max Array element is: " + varArr.getMinArray(arr));
		varArr.getMidCharArray(arr1);
	}
}
