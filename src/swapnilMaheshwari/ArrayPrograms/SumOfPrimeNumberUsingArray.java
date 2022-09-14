package swapnilMaheshwari.ArrayPrograms;

public class SumOfPrimeNumberUsingArray {

	boolean status = true;
	int count = 0;

	boolean isPrimeNumber(int arr) {
		for (int index = 0; index < arr; index++) {
			status = true;
			for (int i = 2; i < arr; i++) {

				if (arr % i == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				count++;

			}
		}
		return status;
	}

	int getSumOfPrimeNumber(int[] arr1) {

		int sum = 0;

		for (int index = 0; index < arr1.length; index++) {
			boolean flag = isPrimeNumber(arr1[index]);
			if (flag)
				sum = sum + arr1[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] num = { 11, 14, 17, 22, 44 };
		int sumOfPrime;

		sumOfPrime = new SumOfPrimeNumberUsingArray().getSumOfPrimeNumber(num);
		System.out.println("The sum of prime number is" + sumOfPrime);
	}
}
