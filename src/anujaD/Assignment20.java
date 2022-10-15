/*
Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10

*/

package anujaD;
import java.util.Arrays;

public class Assignment20 {

	boolean isPrime(int num) {

			boolean status = true;
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					status = false;
					break;
				}
			}
			return status;
		}

		int getSumOfNotPrimeNum(int[] arr) {
			int notPrimenum = 0;
			for (int i = 0; i < arr.length; i++) {
				boolean flag = isPrime(arr[i]);
				if (flag == false)
					notPrimenum = notPrimenum + arr[i];
			}
			return notPrimenum;
		}

		int getSumOfNotPrimeAndDivisble(int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (isPrime(arr[i])!=true) {
					if (arr[i] % 5 == 0 && arr[i] % 7 == 0)
						sum = sum + arr[i];
				}
			}
			return sum;
		}

		boolean getEvenOrOddStatus(int num) {
			if(num%2==0)
				return true;
			else
				return false;
		}
		
		int getSumOfEven(int[]arr) {
			int sumOfEven=0;
			for(int i=0;i<arr.length;i++) {
				if(getEvenOrOddStatus(arr[i]))
					sumOfEven=sumOfEven+arr[i];
			}
			return sumOfEven;	
		}
		
		
		int getDiffernceEvenAndOddNumber(int[]arr) {
			int sumOfEven=0;
			int sumOfOdd=0;

			for(int i=0; i<arr.length;i++) {			
				if(getEvenOrOddStatus(arr[i]))
					sumOfEven=sumOfEven+arr[i];
				else
					sumOfOdd=sumOfOdd+arr[i];
			}
			
			int difference=0;
			if(sumOfEven>sumOfOdd)
				difference=sumOfEven-sumOfOdd;
			else
				difference=sumOfOdd-sumOfEven;
			
			return difference;
		}
		
		
		public static void main(String[] args) {
			Assignment20 arrayAssignment20 = new Assignment20();

			int[] input1 = { 11, 13, 17, 22, 44 };
			System.out.println("Given array is " + Arrays.toString(input1));
			System.out.println("Sum of not prime number from given array is " + arrayAssignment20.getSumOfNotPrimeNum(input1));

			int[] input2 = { 11, 35, 17, 105, 44 };
			System.out.println("\nGiven array is " + Arrays.toString(input2));
			System.out.println("Sum of not prime and divisible by 5 and 7 numbers from given array is "
					+ arrayAssignment20.getSumOfNotPrimeAndDivisble(input2));
			
			int[] input3={10,11,15,6};
			System.out.println("Given array is "+Arrays.toString(input3));
			System.out.println("Sum of all even numbers from given array is "+arrayAssignment20.getSumOfEven(input3));
			
			int[] input4={10,11,15,6};
			System.out.println("\nGiven array is "+Arrays.toString(input4));
			System.out.println("Difference between sum of all even numbers and sum of all even numbers from given array is "+arrayAssignment20.getDiffernceEvenAndOddNumber(input4));


		}
	}
