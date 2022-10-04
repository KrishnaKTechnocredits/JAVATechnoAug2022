/*Assignment 32 : 30th Sep'2022
Program 2 : 
Write a method to return reverse number.
input : 123
output : 321*/
package adittyThakare.numberOperations;

public class Assignment32_Program2 {

	// Method to reverse number
	int reversedNumber(int num) {
		int remainder = 0, reverseNumber = 0;

		while (num > 0) {
			remainder = num % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			num = num / 10;
		}
		return reverseNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_Program2 assignment32_Program2 = new Assignment32_Program2();
		int num = 123;
		System.out.println("Program to reverse a number!");
		System.out.println("\nInput Number: " + num);
		System.out.println("\nReversed Number: " + assignment32_Program2.reversedNumber(num));
	}

}
