package vibhaS;

public class Assignment19 {

	int getSumOfNum(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;
	}

	boolean getSumOfPrimeNum(int num) {
		int count = 0;
		boolean isPrime;
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			isPrime = true;
		} else {
			isPrime = false;
		}
		return isPrime;
	}

	int getPrimeNum(int[] arr) {
		int sum=0;
		for (int index = 0; index < arr.length; index++) {
			boolean ans = getSumOfPrimeNum(arr[index]);
			if (ans == true) {
				sum=sum+arr[index];
			}
		}
		return sum;
	}

	int getMaxNum(int[] num) {
		int max = num[0];
		for (int index = 1; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
			}
		}
		return max;
	}

	int getMinNum(int[] num) {
		int min = num[0];
		for (int index = 1; index < num.length; index++) {
			if (min > num[index]) {
				min = num[index];
			}
		}
		return min;
	}

	char getMiddleChar(String word) {
		int index = 0;
		if (word.length() % 2 == 0) {
			index = word.length() / 2 - 1;
		} else {
			index = word.length() / 2;
		}
		return word.charAt(index);
	}

	void getArrayOfMiddleChar(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			char ch = getMiddleChar(arr[index]);
			System.out.println("Middle character of " + arr[index] + " => " + ch);
		}
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		int[] num = { 10,11,15};
		int ans = assignment19.getSumOfNum(num);
		System.out.println("Sum of number => " + ans);
		System.out.println("");
		int[] num1 = { 11,14,17,22,44 };
		int ans1=assignment19.getPrimeNum(num1);
		System.out.println("sum of prime number is => " + ans1);
		System.out.println("");
		int[] num2 = { 11,4,55,23,43 };
		int ans2 = assignment19.getMaxNum(num2);
		System.out.println("max num is  => " + ans2);
		System.out.println("");
		int[] num3 = { 11,4,55,23,43 };
		int ans3 = assignment19.getMinNum(num3);
		System.out.println("min num is  => " + ans3);
		System.out.println("");
		String[] arr = {"Ashish","Aditty","Manjiri","AnKita" };
		assignment19.getArrayOfMiddleChar(arr);
		System.out.println("");
	}
}
