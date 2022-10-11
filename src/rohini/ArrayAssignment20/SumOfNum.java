package rohini.ArrayAssignment20;
//Assignment-20
import java.util.Arrays;

//Program1:Sum of all Non Prime numbers from given Array
public class SumOfNum {
	boolean isPrime(int input) {
		for (int i = 2; i < input / 2; i++) {
			if (input % i == 0)
				return false;
		}
		return true;
	}
	int getSumOfNotPrime(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			if (!isPrime(input[i])) {
				sum = sum + input[i];
			}
		}
		return sum;
	}
//Program2:Sum of all Non Prime numbers and should be divisible by 5 and 7 from given Array
	int getSumOfDivisibleby5And7(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			if (!isPrime(input[i]) && input[i] % 5 == 0 && input[i] % 7 == 0) {
				sum = sum + input[i];
			}
		}
		return sum;
	}
//Program3: Sum of all even numbers in given array
	int isEvenNum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				sum = sum + input[i];
			}
		}
		return sum;
	}
//Program4:Return difference of Sum of all even numbers and odd numbers in given array
	int getDiffOfSumOfOddEvenNum(int[] input) {
		int odd = 0, even = 0;
		int sum;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0)
				even = even + input[i];
			else
				odd = odd + input[i];
		}
		return Math.abs(even - odd);
	}

	public static void main(String[] args) {
		int[] input = { 11, 13, 17, 22, 44 };
		System.out.println("Input Array:" + Arrays.toString(input));
		System.out.println("Sum of non Prime numbers from given Array: " + new SumOfNum().getSumOfNotPrime(input));
		int[] input1 = { 11, 35, 17, 105, 44 };
		System.out.println("\nInput Array:" + Arrays.toString(input1));
		System.out.println("Sum of non Prime numbers and divisible by 5 and 7 from given Array from given Array: "+ new SumOfNum().getSumOfDivisibleby5And7(input1));
		int[] input2 = { 10, 11, 15, 6 };
		System.out.println("\nInput Array:" + Arrays.toString(input2));
		System.out.println("Sum of even numbers from given Array: " + new SumOfNum().isEvenNum(input2));
		System.out.println("\nInput Array:" + Arrays.toString(input2));
		System.out.println("Difference of Sum of all even numbers and odd numbers in given array: "+ new SumOfNum().getDiffOfSumOfOddEvenNum(input2));

	}

}
