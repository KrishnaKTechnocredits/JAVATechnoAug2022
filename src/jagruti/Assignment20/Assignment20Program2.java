/* 2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)
*/
package jagruti.Assignment20;

public class Assignment20Program2 {
	int getSumOfAllNonPrimeArray(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = Assignment20Program1.isPrime(num[index]);
			if (flag == false)
				if ((num[index] % 5 == 0) && (num[index] % 7 == 0))
					sum = sum + num[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment20Program2 a = new Assignment20Program2();
		int[] input = { 11, 35, 17, 105, 44 };
		System.out.println(a.getSumOfAllNonPrimeArray(input));
	}
}
