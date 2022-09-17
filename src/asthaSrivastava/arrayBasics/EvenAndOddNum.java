/*3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10*/

package asthaSrivastava.arrayBasics;

import java.util.Arrays;

public class EvenAndOddNum { //Program3

	int getEvenNumber(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean test = false;
			for (int i = 0; i < num[index]; i++) {
				if (num[index] % 2 == 0) {
					test = true;
					break;
				}
			}
			if (test)
				sum = sum + num[index];
		}
		return sum;

	}

	int diffOfEvenAndOdd(int[] arr) {  ///Program4
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = true;
			for (int i = 0; i < arr[index]; i++) {
				if (arr[index] % 2 == 0) {
					sumEven = sumEven + arr[index];
					flag = false;
					break;
				}
			}
			if (flag)
				sumOdd = sumOdd + arr[index];

		}
		return sumEven - sumOdd;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 15, 6 };

		int result = new EvenAndOddNum().getEvenNumber(input);
		System.out.println("Sum of even numbers in given array" + Arrays.toString(input) + " is " + result);

		int result1 = new EvenAndOddNum().diffOfEvenAndOdd(input);
		System.out.println(
				"Differnce of even and odd numbers in given array" + Arrays.toString(input) + " is " + result1);

	}
}
