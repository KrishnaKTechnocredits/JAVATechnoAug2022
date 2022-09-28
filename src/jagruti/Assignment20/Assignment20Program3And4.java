/* 3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10
*/
package jagruti.Assignment20;
import java.util.Arrays;

public class Assignment20Program3And4 {
	int sum = 0;
	int oddSum = 0;
	int difference = 0;

	int evenNumbersSum(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	private int OddNumbersSum(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 1) {
				oddSum = oddSum + num[index];
			}
		}
		return oddSum;
	}

	int diffSumEvenOdd(int[] num) {
		OddNumbersSum(num);
		difference = oddSum - sum;
		return difference;
	}

	public static void main(String[] args) {
		Assignment20Program3And4 a = new Assignment20Program3And4();
		int[] input = { 10, 11, 15, 6 };
		System.out.println("Sum of all even numbers in given array "+ Arrays.toString(input)+ " is: ---" +a.evenNumbersSum(input));
		System.out.println("Difference of sum of all even numbers and odd numbers in given array"+Arrays.toString(input)+ " is:---" +a.diffSumEvenOdd(input));
	}
}
