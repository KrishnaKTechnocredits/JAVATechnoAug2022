/*2) Write a method to return sum of all non prime numbers 
				and should be divisible by 5 & 7 from given array.
				input : {11,35,17,105,44}
				output : 140
				Hint : (35+105 = 28)	*/
package maheshSantoki.arrayExamples;

public class NonPrimeNumber {
	boolean flag = true;

	boolean divisible(int num) {

		if (num % 5 == 0 && num % 7 == 0)
			flag = false;
		else
			flag = true;
		return flag;
	}

	boolean checkNonPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		if (flag == false)
			flag = divisible(num);
		return flag;
	}

	int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			flag = checkNonPrime(arr[i]);
			if (flag == false)
				sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		NonPrimeNumber non = new NonPrimeNumber();

		int input[] = { 11, 35, 17, 105, 44 };
		System.out.println("sum of all non prime numbers and should be divisible by 5 & 7 from given array : "
				+ non.getSum(input));
	}
}
