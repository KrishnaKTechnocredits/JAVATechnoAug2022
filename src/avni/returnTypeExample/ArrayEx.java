package avni.returnTypeExample;

public class ArrayEx {
	/*
	 * Write a method to return sum of all numbers in given array. input :
	 * {10,11,15} output : 36
	 */
	int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	/*
	 * 2) Write a method to return sum of all prime numbers from given array. input:
	 * {11,14,17,22,44} output : 28 Hint : (11+17 = 28)
	 */
	boolean isPrimeNo(int num1) {

		boolean flag = true;

		for (int i = 2; i <= num1 / 2; i++) {

			if (num1 % i == 0) {
				flag = false;

			}
		}
		if (flag == true) {

		}
		return flag;
	}

	int getSumOfPrime(int arr[]) {
		int sum = 0;

		{
			for (int i = 0; i < arr.length; i++) {
				int a = arr[i];
				boolean flag = isPrimeNo(a);
				if (flag)
					sum = sum + arr[i];
			}

		}
		return sum;
	}

	/*
	 * Write a method to return max number from array. input : {11,4,55,23,43}
	 * output : 55
	 */
	int getMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	/*
	 * Write a method to return min number from array. input : {11,4,55,23,43}
	 * output : 4
	 */

	int getMin(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	/*
	 * 5) Write a method to print middle character of all array elements. input :
	 * {"Ashish","Aditty","Manjiri","Ankita"} output : Ashish -> h Aditty -> i
	 * Manjiri -> j Ankita -> k
	 */
	char getMiddleChar(String str) {
		if (str.length() % 2 != 0)
			return str.charAt(str.length() / 2);
		else
			return str.charAt(str.length() / 2 - 1);
	}

	void printMiddleChar(String[] name) {
		for (int i = 0; i < name.length; i++) {
			char ch = getMiddleChar(name[i]);
			System.out.println("--->  " + name[i] + "'s Middle character  : " + ch);
		}
	}

	public static void main(String[] args) {
		ArrayEx ex1 = new ArrayEx();
		int num1[] = { 10, 11, 15 };
		int num2[] = { 11, 14, 17, 22, 44 };
		int num3[] = { 11, 4, 55, 23, 43 };

		System.out.println("---> Sum of all elements of given array is " + ex1.sumArray(num1));
		System.out.println("---> Sum of all Prime numbers of given array is " + ex1.getSumOfPrime(num2));
		System.out.println("---> Max number of given array is " + ex1.getMax(num3));
		System.out.println("---> Min number of given array is " + ex1.getMin(num3));

		String str[] = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		ex1.printMiddleChar(str);
	}
}
