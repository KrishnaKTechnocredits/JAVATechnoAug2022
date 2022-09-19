/*Assignment - 20 : 10th Sep'2022

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10
*/

package deepakPatil.Assignment20ArrayExamples;

import java.util.Arrays;

public class ArrayAssignment20_2 {
	
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
	
	public static void main(String[]args) {
		ArrayAssignment20_2 arrayAssignment20_2=new ArrayAssignment20_2();
		
		int[] input1={10,11,15,6};
		System.out.println("Given array is "+Arrays.toString(input1));
		System.out.println("Sum of all even numbers from given array is "+arrayAssignment20_2.getSumOfEven(input1));
		
		int[] input2={10,11,15,6};
		System.out.println("\nGiven array is "+Arrays.toString(input2));
		System.out.println("Difference between sum of all even numbers and sum of all even numbers from given array is "+arrayAssignment20_2.getDiffernceEvenAndOddNumber(input2));

	}

}
