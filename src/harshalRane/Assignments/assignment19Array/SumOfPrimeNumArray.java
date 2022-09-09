package harshalRane.Assignments.assignment19Array;

public class SumOfPrimeNumArray {
	boolean isPrime(int num) {
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

	int getSumOfPrimeNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = isPrime(num[index]);
			if (flag) {
				System.out.println(num[index]);
				sum = sum + num[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfPrimeNumArray obj = new SumOfPrimeNumArray();
		int[] number = { 11, 14, 17, 22, 44 };
		System.out.println("Sum of Prime Numbers is: " + obj.getSumOfPrimeNumbers(number));
	}
}
