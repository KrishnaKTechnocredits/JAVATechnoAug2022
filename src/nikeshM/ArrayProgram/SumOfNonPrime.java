package nikeshM.ArrayProgram;

public class SumOfNonPrime {
//	
//	2) Write a method to return sum of all non prime numbers 
//			and should be divisible by 5 & 7 from given array.
//			input : {11,35,17,105,44}
//			output : 140
//			Hint : (35+105 = 28)
	
	int getPrimeNumber(int[] num) {
		int sum = 0;
		int range = 2;
		int ans = 0;
		boolean flag = true;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 5 == 0 && num[index] % 7 == 0) {
				flag = false;
				sum = num[index];
				ans = ans + sum;
			}
		}
		System.out.println(ans);
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 11, 35, 17, 105, 44 };
		new SumOfNonPrime().getPrimeNumber(input);
	}

}
