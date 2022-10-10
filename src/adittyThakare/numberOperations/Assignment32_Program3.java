/*Assignment 32 : 30th Sep'2022
Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number*/
package adittyThakare.numberOperations;

public class Assignment32_Program3 {

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

	// Method to check if number is palindrome or not
	void checkNumberPalindrome(int num) {

		if (num == reversedNumber(num))
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_Program3 assignment32_Program3 = new Assignment32_Program3();
		int num1 = 1221, num2 = 1231;
		System.out.println("\nInput Number: " + num1);
		assignment32_Program3.checkNumberPalindrome(num1);
		System.out.println("\nInput Number: " + num2);
		assignment32_Program3.checkNumberPalindrome(num2);

	}

}
