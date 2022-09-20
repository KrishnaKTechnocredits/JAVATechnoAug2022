package amolMule.arrayss;

public class ArrayOpr {

	int sumArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	int maxArr(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	int minArr(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}

	boolean isPrime(int n) {
		boolean b = true;
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;
				b = false;
				break;
			}

		}
		if (flag == 0) {
			b = true;
		}

		return b;
	}

	int getSumPrime(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean b1 = isPrime(arr[i]);
			if (b1 == true) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	char midChar(String str) {
		char ch = ' ';
		int n = str.length();
		int div = n % 2;
		if (div == 0) {
			ch = str.charAt((n / 2) - 1);
		} else {
			ch = str.charAt((n / 2));
		}
		return ch;
	}

	void middleCharArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			char chr = midChar(arr[i]);
			System.out.println("Middle character of string " + arr[i] + " " + chr);
		}
	}

	public static void main(String[] args) {
		ArrayOpr opr = new ArrayOpr();
		int[] num = { 10, 11, 15 };
		int sum1 = opr.sumArr(num);
		System.out.println("Sum of array is: " + sum1);

		boolean b1 = opr.isPrime(9);
		//System.out.println(b1);

		int[] arr1 = { 3, 4, 12, 5, 6, 9, 13 };
		int c = opr.getSumPrime(arr1);
		System.out.println("Sum of all prime numbers are: " + c);

		int maxValue = opr.maxArr(arr1);
		System.out.println("max value in arr is: " + maxValue);

		int minValue = opr.minArr(arr1);
		System.out.println("max value in arr is:" + minValue);

		char ch = opr.midChar("Amolm");
		System.out.println("Mid char is of provided string is  :" + ch);

		String[] arr2 = { "Amol", "Amita", "Jay" };
		opr.middleCharArr(arr2);

	}

}
